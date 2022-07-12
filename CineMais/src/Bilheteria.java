import java.util.ArrayList;
import java.util.List;

import model.Cinema;
import model.Cliente;
import model.Sessao;
import model.Sala;
import dao.CinemaDao;
import dao.DataBase;
import dao.SessaoDao;
import dao.*; 

// Essa classe é o Facade
public class Bilheteria {
    private static Bilheteria instance = new Bilheteria();
    private String shoppingSelecionado;
    private CinemaDao cinemaDao = new CinemaDao();
    private Sessao sessaoselecionada;
    private Cliente clienteSelecionado;
    private Sala salaSelecionada;
    // private SessaoDao sessaoDao = new SessaoDao();

    public Sala getSalaSelecionada() {
        return salaSelecionada;
    }

    public void setSalaSelecionada(Sala salaSelecionada) {
        this.salaSelecionada = salaSelecionada;
    }

    public Cliente getClienteSelecionado() {
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Cliente clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

    public Sessao getSessaoselecionada() {
        return sessaoselecionada;
    }

    public void setSessaoselecionada(Sessao sessaoselecionada) {
        this.sessaoselecionada = sessaoselecionada;
    }

    public Bilheteria(){
        
    }

    public static Bilheteria getInstance(){
        return instance;
    }

    public void getCinemas(){
        List<Cinema> cinemas = new ArrayList<>();
        cinemas = cinemaDao.select();
        for (int i = 0; i < cinemas.size(); i++) {
            System.out.print(cinemas.get(i).getNome());
            //this.cinemas.add(new Cinema("CineMais", shoppings.get(i).toString()));
        }
    }

    public List<Sessao> getSessaoByDateAndShop(String data, int cinemaId){
        SessaoDao sessaoDao = new SessaoDao();
        List<Sessao> sessoes=  sessaoDao.select(data, cinemaId);
        for(Sessao sessao: sessoes)
            System.out.println(sessao.getFilme().getNomeFilme()+ " " + cinemaId);
        return sessoes;
    }
    public void cadastrarCliente(Cliente cliente){
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.insert(cliente);
    }

    public String getShoppingSelecionado(){
        return this.shoppingSelecionado;
    }
    public void setShoppingSelecionado(String nome){
        this.shoppingSelecionado = nome;
    }
}

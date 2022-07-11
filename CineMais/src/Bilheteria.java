import java.util.ArrayList;
import java.util.List;

import model.Cinema;
import model.Sessao;
import dao.CinemaDao;
import dao.DataBase;
import dao.SessaoDao;

// Essa classe é o Facade
public class Bilheteria {
    private static Bilheteria instance = new Bilheteria();
    private String shoppingSelecionado;
    private CinemaDao cinemaDao = new CinemaDao();
    // private SessaoDao sessaoDao = new SessaoDao();

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
        return sessaoDao.select(data, cinemaId);
    }

    public String getShoppingSelecionado(){
        return this.shoppingSelecionado;
    }
    public void setShoppingSelecionado(String nome){
        this.shoppingSelecionado = nome;
    }
}

import java.util.ArrayList;
import java.util.List;

import model.Cinema;
import dao.CinemaDao;
import dao.DataBase;

// Essa classe é o Facade
public class Bilheteria {
    private static Bilheteria instance = new Bilheteria();
    private String shoppingSelecionado;
    private CinemaDao cinemaDao = new CinemaDao();

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

    public String getShoppingSelecionado(){
        return this.shoppingSelecionado;
    }
    public void setShoppingSelecionado(String nome){
        this.shoppingSelecionado = nome;
    }
}

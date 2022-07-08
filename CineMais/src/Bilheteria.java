// Essa classe é o Facade
public class Bilheteria {
    private static Bilheteria instance = new Bilheteria();
    private DataBase db;
    private String shoppingSelecionado;

    public Bilheteria(){
        this.db = new DataBase();
    }

    public static Bilheteria getInstance(){
        return instance;
    }

    public void listaDbInterface(){
        for (int i = 0; i < this.db.getCinemas().size(); i++) {
            System.out.println("(" + i + ") " + this.db.getCinemas().get(i).getShopping());
        }

        System.out.println(this.db.getEmail() + this.db.getSenha());
    }

    public DataBase getDb(){
        return this.db;
    }

    public String getShoppingSelecionado(){
        return this.shoppingSelecionado;
    }
    public void setShoppingSelecionado(String nome){
        this.shoppingSelecionado = nome;
    }
}

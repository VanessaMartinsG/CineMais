public class Cinema {

    private String nome;
    private String shopping[];
    private static int i = 0;

    public Cinema(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping[i] = shopping;
        i++;
    }

}
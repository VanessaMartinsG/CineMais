public class Sala {

    private Cinema cinema;
    private int numero;
    private int capacidade;
    private boolean sala3d;
    private String descricao;
    private Sessao sessoes[];

    public Sala(Cinema cinema, int numero, int capacidade, boolean sala3d, String descricao) {
        this.cinema = cinema;
        this.numero = numero;
        this.capacidade = capacidade;
        this.sala3d = sala3d;
        this.descricao = descricao;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isSala3d() {
        return sala3d;
    }

    public void setSala3d(boolean sala3d) {
        this.sala3d = sala3d;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

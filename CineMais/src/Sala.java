public class Sala {

    private Cinema cinema;
    private int numero;
    private int capacidade;
    private boolean sala3d;
    private String descricao;
    private Sessao sessoes[] = new Sessao[20];
    private static int i = 0;

    public Sala(Cinema cinema, int numero, int capacidade, boolean sala3d, String descricao) {
        this.cinema = cinema;
        this.numero = numero;
        this.capacidade = capacidade;
        this.sala3d = sala3d;
        this.descricao = descricao;
    }

    public Sessao[] getSessoes() {
        return sessoes;
    }

    public void setSessoes(Sessao sessoes) {
        this.sessoes[i] = sessoes;
        i++;
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

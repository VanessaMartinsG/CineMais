public class Sessao {
    private int numero;
    private Filme filme;
    private Data horario; // verificar utilizacao
    private Sala sala;

    public Sessao(Filme filme, Data horario, Sala sala, int numero) {
        this.filme = filme;
        this.horario = horario;
        this.sala = sala;
        this.numero = numero;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Data getHorario() {
        return horario;
    }

    public void setHorario(Data horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

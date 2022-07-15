public class Sessao {

    private Filme filme;
    private Data horario;
    private Sala sala;

    public Sessao(Filme filme, Data horario, Sala sala) {
        this.filme = filme;
        this.horario = horario;
        this.sala = sala;
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

}

package model;

public class Sessao {

    private int numeroSessaoId;
    private Filme filme;
    private String horario;
    private Sala sala;

    public Sessao() {
    
    }

    public int getNumeroSessaoId(){
        return this.numeroSessaoId;
    }

    public void setNumeroSessaoId(int novoId){
        this.numeroSessaoId = novoId;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

}

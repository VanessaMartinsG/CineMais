package model;
public class Filme {

    private int idFilme;
    private String nomeFilme;
    private String diretor;
    private String ator;
    private String duracao;
    private int faixaEtaria;
    private String categoria;

    public Filme() {
        
    }

    public int getIdFilme(){
        return idFilme;
    }

    public void setIdFilme(int novoId){
        this.idFilme = novoId;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String filme) {
        this.nomeFilme = filme;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtor() {
        return ator;
    }

    public void setAtor(String ator) {
        this.ator = ator;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}

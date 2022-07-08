public class Filme {

    private String filme;
    private String diretor;
    private String ator;
    private String duracao;
    private int faixaEtaria;
    private String categoria;

    public Filme(String filme, String diretor, String ator, String duracao, int faixaEtaria, String categoria) {
        this.filme = filme;
        this.diretor = diretor;
        this.ator = ator;
        this.duracao = duracao;
        this.faixaEtaria = faixaEtaria;
        this.categoria = categoria;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
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

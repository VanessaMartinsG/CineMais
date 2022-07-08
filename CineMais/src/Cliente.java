public class Cliente {
    private String nome;
    private boolean estudante;
    private int idade;
    private Ingresso ingresso;

    public Cliente(String nome, boolean estudante, int idade, Ingresso ingresso) {
        this.nome = nome;
        this.estudante = estudante;
        this.idade = idade;
        this.ingresso = ingresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

}

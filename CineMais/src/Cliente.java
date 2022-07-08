public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private boolean estudante;
    private int idade;
    private Ingresso ingresso;

    public Cliente(String nome, String email, String senha, boolean estudante, int idade, Ingresso ingresso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

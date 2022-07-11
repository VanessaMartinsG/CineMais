package model;

public class Cliente {
    private int cpf;
    private String nome;
    private boolean estudante;
    private int idade;
    private String email;
    private String senha;
    private Ingresso ingresso;

    public Cliente() {
    }

    public int getCpf(){
        return cpf;
    }

    public void setCpf(int novoCpf){
        this.cpf = novoCpf;
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

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }


}

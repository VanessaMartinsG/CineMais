package model;

public class Cliente {
    private int cpf;
    private String nome;
    private boolean estudante;
    private int idade;
    private Ingresso ingresso;

    public Cliente(int cpf,String nome, boolean estudante, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.estudante = estudante;
        this.idade = idade;
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

    

}

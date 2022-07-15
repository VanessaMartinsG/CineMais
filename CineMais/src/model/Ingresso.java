package model;


public class Ingresso {

    
    private int idingresso;
    private String clienteEmail;
    private double preco;
    private String status;
    private int idSessao;
    private Cliente cliente;


    public Ingresso(Ingresso ingresso){
        this.clienteEmail = ingresso.clienteEmail;
        this.preco = ingresso.preco;
        this.status = ingresso.status;
        this.idSessao = ingresso.idSessao;
    }

    public Ingresso(){
        
    }

    public Ingresso clonePrototype(){
        return new Ingresso(this);
    }

    public int getIdingresso() {
        return idingresso;
    }
    public void setIdingresso(int idingresso) {
        this.idingresso = idingresso;
    }
    public String getClienteEmail() {
        return clienteEmail;
    }
    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getIdSessao() {
        return idSessao;
    }
    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

}

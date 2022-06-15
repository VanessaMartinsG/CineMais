public class Ingresso {

    private Cliente cliente;
    private float preco;
    private Sessao sessao;
    private Data horario;
    private String duracao;
    private String status;

    public Ingresso(Cliente cliente, float preco, Sessao sessao, Data horario, String duracao, String status) {
        this.cliente = cliente;
        this.preco = preco;
        this.sessao = sessao;
        this.horario = horario;
        this.duracao = duracao;
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Data getHorario() {
        return horario;
    }

    public void setHorario(Data horario) {
        this.horario = horario;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Sessao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Ingresso;

public class ComprarIngressoController {
    @FXML
    private Label lblFromController1;
    Bilheteria bilheteria = Bilheteria.getInstance();

    @FXML
    private Button btnBack;

    @FXML
    private Button btnContinuar;

    @FXML
    private Label textDuracao;

    @FXML
    private Label textFilme;

    @FXML
    private Label textPreco;

    @FXML
    private Label textSessao;

    @FXML
    private Label textTipo;

    @FXML
    private Label titleShopping;

    @FXML
    private TextField inputIdade;

    @FXML
    private Label textData;

    @FXML
    private TextField inputQtdComum;

    @FXML
    private TextField inputQtdEstudante;

    int qtdComum = 0;
    int qtdEstudante =  0;

    @FXML
    void irFinalizacaoCompra(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        
        inserirIngresso();

        Parent root = FXMLLoader.load(getClass().getResource("finalizacaoCompra.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void voltarFilmesEmCartaz(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("listaShoppings.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        Sessao sessao = bilheteria.getSessaoselecionada();
        titleShopping.setText(bilheteria.getShoppingSelecionado());

        if (sessao.getSala().isSala3d())
            textTipo.setText("3D");
        else
            textTipo.setText("2D");

        textFilme.setText(sessao.getFilme().getNomeFilme());
        textSessao.setText(Integer.toString(sessao.getNumeroSessaoId()));
        textDuracao.setText(sessao.getFilme().getDuracao());
        textPreco.setText(Float.toString(bilheteria.getSessaoselecionada().getFilme().getPreco()));
        textData.setText(sessao.getData());

    }

    @FXML
    double isWeekend(double preco) {

        Sessao sessao = bilheteria.getSessaoselecionada();
        

        if (sessao.getData().equals(bilheteria.getFds())) {
            preco = preco * 1.1;
        }
        return preco;

    }
    @FXML
    double is3D(double preco) {

        Sessao sessao = bilheteria.getSessaoselecionada();
        

        if (sessao.getSala().isSala3d()) {
            preco = preco * 1.2;
        }
        return preco;

    }

    @FXML 

    double totalPreco() {

        double preco = 0;
        double precoComum = bilheteria.getSessaoselecionada().getFilme().getPreco();
        double precoEstudante = bilheteria.getSessaoselecionada().getFilme().getPreco();

        
        precoComum = is3D(precoComum);
        precoComum = isWeekend(precoComum);
        precoComum = precoComum * qtdComum;

        precoEstudante = is3D(precoEstudante);
        precoEstudante = isWeekend(precoEstudante);
        precoEstudante =  precoEstudante / 2;
        precoEstudante = precoEstudante * qtdEstudante;

        preco = precoComum + precoEstudante;

        return preco;
    }

    public double calcPrecoEstudante(){
        double precoEstudante = bilheteria.getSessaoselecionada().getFilme().getPreco();
        precoEstudante = is3D(precoEstudante);
        precoEstudante = isWeekend(precoEstudante);
        precoEstudante =  precoEstudante / 2;
        return precoEstudante;
    }

    public double calcPrecoPadrao(){
        double precoPadrao = bilheteria.getSessaoselecionada().getFilme().getPreco();
        precoPadrao = is3D(precoPadrao);
        precoPadrao = isWeekend(precoPadrao);
        return precoPadrao;
    }



    @FXML
    void inserirIngresso() {
        Ingresso ingresso = new Ingresso();;
        double precoTotal = totalPreco();
        qtdComum = Integer.parseInt(inputQtdComum.getText()); 
        qtdEstudante = Integer.parseInt(inputQtdEstudante.getText());
        
        System.out.println("AQUI FORA");
        for(int i=0; i < qtdEstudante; i++){
            System.out.println("AQUI FORA");
            if(i == 0){
                System.out.println("AQUI DENTRO");
                ingresso.setClienteEmail(bilheteria.getClienteSelecionado().getEmail());
                ingresso.setPreco(calcPrecoEstudante());
                ingresso.setStatus("Vendido");
                ingresso.setIdSessao(bilheteria.getSessaoselecionada().getNumeroSessaoId());
                bilheteria.cadastrarIngresso(ingresso); 
            }else{
                bilheteria.cadastrarIngresso(ingresso.clonePrototype());
            }
            
        }

        for(int i=0; i < qtdComum; i++){
            System.out.println("AQUI FORA");
            if(i == 0){
                System.out.println("AQUI EU");
                ingresso.setClienteEmail(bilheteria.getClienteSelecionado().getEmail());
                ingresso.setPreco( calcPrecoPadrao());
                ingresso.setStatus("Vendido");
                ingresso.setIdSessao(bilheteria.getSessaoselecionada().getNumeroSessaoId());
                bilheteria.cadastrarIngresso(ingresso); 
            }else{
                bilheteria.cadastrarIngresso(ingresso.clonePrototype());
            }
        }

        // Ingresso ingresso = new Ingresso();

        // ingresso.setClienteEmail(bilheteria.getClienteSelecionado().getEmail());
        // ingresso.setPreco(precoTotal);
        // ingresso.setStatus("Vendido");
        // ingresso.setIdSessao(bilheteria.getSessaoselecionada().getNumeroSessaoId());

        //bilheteria.cadastrarIngresso(ingresso);

    }

}

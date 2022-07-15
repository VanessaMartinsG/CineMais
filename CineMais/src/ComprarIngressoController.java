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

    @FXML
    void irFinalizacaoCompra(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        
        loopIngresso();

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
    void loopIngresso() {

        int totalQtd;
        totalQtd = Integer.parseInt(inputQtdEstudante.getText()) + Integer.parseInt(inputQtdComum.getText());

        for (int x = 0; x == totalQtd; x++) {

            inserirIngresso();

        }

        
    }

    @FXML 

    double totalPreco() {


        int ingressoComum = Integer.parseInt(inputQtdComum.getText()); 
        int ingressoEstudante =  Integer.parseInt(inputQtdEstudante.getText());
        double preco = 0;
        double precoComum = bilheteria.getSessaoselecionada().getFilme().getPreco();
        double precoEstudante = bilheteria.getSessaoselecionada().getFilme().getPreco();

        
        precoComum = is3D(precoComum);
        precoComum = isWeekend(precoComum);
        precoComum = precoComum * ingressoComum;

        precoEstudante = is3D(precoEstudante);
        precoEstudante = isWeekend(precoEstudante);
        precoEstudante =  precoEstudante / 2;
        precoEstudante = precoEstudante * ingressoEstudante;

        preco = precoComum + precoEstudante;

        return preco;
    }



    @FXML
    void inserirIngresso() {

        double precoTotal = totalPreco();

        Ingresso ingresso = new Ingresso();

        ingresso.setClienteEmail(bilheteria.getClienteSelecionado().getEmail());
        ingresso.setPreco(precoTotal);
        ingresso.setStatus("Vendido");
        ingresso.setIdSessao(bilheteria.getSessaoselecionada().getNumeroSessaoId());

        bilheteria.cadastrarIngresso(ingresso);

    }

}

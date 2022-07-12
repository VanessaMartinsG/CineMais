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

public class ComprarIngressoController {
    @FXML
    private Label lblFromController1;
    Bilheteria bilheteria = Bilheteria.getInstance();
    
    @FXML
    private Button btnBack;

    @FXML
    private Button btnContinuar;

    @FXML
    private TextField inputQtd;

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
    void irFinalizacaoCompra(ActionEvent event) throws IOException {
       Stage stage;
        Scene scene;

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

        if(sessao.getSala().isSala3d())
            textTipo.setText("3D");
        else 
            textTipo.setText("2D");
        
        textFilme.setText(sessao.getFilme().getNomeFilme());
        textSessao.setText(Integer.toString(sessao.getNumeroSessaoId()));
        textDuracao.setText(sessao.getFilme().getDuracao());
    }



}

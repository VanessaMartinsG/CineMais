import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class contaController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnEditar;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputEstudante;

    @FXML
    private TextField inputIdade;

    @FXML
    private TextField inputNome;

    @FXML
    private TextField inputSenha;

    @FXML
    void editarCadastro(ActionEvent event) {


    }

    @FXML
    void voltarPerfil(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
     
        Parent root = FXMLLoader.load(getClass().getResource("perfil.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

}
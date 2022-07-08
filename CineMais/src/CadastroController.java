import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class CadastroController {

    private Cliente cliente;

    @FXML
    private ToggleGroup estudante;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputIdade;

    @FXML
    private TextField inputNome;

    @FXML
    private TextField inputSenha;

    @FXML
    private RadioButton radioNao;

    @FXML
    private RadioButton radioSim;

    @FXML
    void backToLogin(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void fazerCadastro(ActionEvent event) {

    }

    void criarNovoUsuario() {
        cliente.setNome(inputNome.getText());
        cliente.setEmail(inputEmail.getText());
        cliente.setSenha(inputSenha.getText());
        cliente.setIdade(Integer.parseInt(inputIdade.getText()));
        RadioButton radio = (RadioButton) estudante.getSelectedToggle();
        if (radio.getText() == "Não") {
            cliente.setEstudante(false);
        } else {
            cliente.setEstudante(true);
        }

    }

}

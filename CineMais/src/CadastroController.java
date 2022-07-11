import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.Cliente;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CadastroController {
    Bilheteria bilheteria = Bilheteria.getInstance();

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
    void backToLogin(ActionEvent event) {

    }

    @FXML
    void fazerCadastro(ActionEvent event) throws IOException {

        

        Cliente cliente = new Cliente();
        cliente.setNome(inputNome.getText());
        cliente.setEmail(inputEmail.getText());
        cliente.setIdade(Integer.parseInt(inputIdade.getText()));
        cliente.setSenha(inputSenha.getText());
        bilheteria.cadastrarCliente(cliente);

        Stage stage;
        Scene scene;

        
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    

}

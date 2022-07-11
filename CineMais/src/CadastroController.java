import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.Cliente;

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
    void fazerCadastro(ActionEvent event) {
        Cliente cliente = new Cliente();
        cliente.setNome(inputNome.getText());
        cliente.setEmail(inputEmail.getText());
        cliente.setIdade(Integer.parseInt(inputEmail.getText()));
        cliente.setSenha(inputSenha.getText());
    }

}

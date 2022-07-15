import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import dao.ClienteDao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
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
    private ToggleGroup estudante;

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
    void fazerCadastro(ActionEvent event) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome(inputNome.getText());
        cliente.setEmail(inputEmail.getText());
        cliente.setIdade(Integer.parseInt(inputIdade.getText()));
        cliente.setSenha(inputSenha.getText());
        RadioButton radio = (RadioButton) estudante.getSelectedToggle();
        if (radio.getText() == "Não") {
            cliente.setEstudante(false);
        } else {
            cliente.setEstudante(true);
        }

        Alert errorAlert = new Alert(AlertType.ERROR);
        ArrayList<Cliente> cadastrados = new ArrayList<Cliente>();
        ClienteDao clienteDao = new ClienteDao();
        cadastrados = clienteDao.selectAll();

        for (int i = 0; i < cadastrados.size(); i++) {
            if (cadastrados.get(i).getEmail().equals(cliente.getEmail())) {
                errorAlert.setHeaderText("ERROR!");
                errorAlert.setContentText("Email ja cadastrado! Tente novamente...");
                errorAlert.showAndWait();

            } else {
                bilheteria.cadastrarCliente(cliente);

                Stage stage;
                Scene scene;

                Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root, 640, 400);
                stage.setScene(scene);
                stage.show();
                break;
            }
        }

    }

}

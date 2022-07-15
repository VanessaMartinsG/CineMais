import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import dao.ClienteDao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Cliente;
import javafx.fxml.FXML;

public class LoginController {
    Bilheteria bilheteria = Bilheteria.getInstance();
    @FXML
    private Button btnBackLogin;

    @FXML
    private Button btnLogar;

    @FXML
    private Button criarCadastrar;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputSenha;



    @FXML
    void fazerLogin(ActionEvent event) throws IOException {

        Alert errorAlert = new Alert(AlertType.ERROR);
        ArrayList<Cliente> cadastrados = new ArrayList<Cliente>();
        Cliente cliente = new Cliente();
        cliente.setEmail(inputEmail.getText());
        cliente.setSenha(inputSenha.getText());
        ClienteDao clienteDao = new ClienteDao();
        cadastrados = clienteDao.selectAll();

        for (int i = 0; i < cadastrados.size(); i++) {
            if (cadastrados.get(i).getEmail().equals(cliente.getEmail())) {
                if (cadastrados.get(i).getSenha().equals(cliente.getSenha())) {
                    Stage stage;
                    Scene scene;
                    bilheteria.setClienteSelecionado(cadastrados.get(i));
                    Parent root = FXMLLoader.load(getClass().getResource("listaShoppings.fxml"));
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root, 640, 400);
                    stage.setScene(scene);
                    stage.show();
                    return;
                } else {
                    errorAlert.setHeaderText("ERROR!");
                    errorAlert.setContentText("Senha Incorreta! Tente novamente...");
                    errorAlert.showAndWait();
                    return;
                }
            }
        }

        errorAlert.setHeaderText("ERROR!");
        errorAlert.setContentText("Email não cadastrado! Tente novamente...");
        errorAlert.showAndWait();

    }

    @FXML
    void irParaCadastro(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void voltarHome(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

}

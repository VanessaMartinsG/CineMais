import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

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
import javafx.fxml.FXML;

public class LoginController {

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
    void fazerLogin(ActionEvent event) {
        // verifica se o usuario existe no json
    }

    @FXML
    void irParaCadastro(ActionEvent event) {
        
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

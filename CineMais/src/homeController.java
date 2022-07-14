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

public class homeController {

    @FXML
    private Button btnComprarIngresso;

    @FXML
    private Button btnFilmesCartaz;

    @FXML
    private Button btnPerfil;

    @FXML
    void menuPerfil(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
        Parent root;
        if (bilheteria.getClienteSelecionado() != null) {
            root = FXMLLoader.load(getClass().getResource("perfil.fxml"));
        } else {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void GoToLogin(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
<<<<<<< Updated upstream

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
=======
        Parent root;
        if (bilheteria.getClienteSelecionado() != null) {
            root = FXMLLoader.load(getClass().getResource("listaShoppings.fxml"));
        } else {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        }
>>>>>>> Stashed changes
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ViewFilmesEmCartaz(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("listaShoppings.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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

public class ListaShoppingsControllers {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnBahia;

    @FXML
    private Button btnBarra;

    @FXML
    private Button btnParalela;

    @FXML
    private Button btnSalvador;

    @FXML
    void abrirShoppingBahia(ActionEvent event) {

    }

    @FXML
    void abrirShoppingBarra(ActionEvent event) {

    }

    @FXML
    void abrirShoppingParalela(ActionEvent event) {

    }

    @FXML
    void abrirShoppingSalvador(ActionEvent event) {

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

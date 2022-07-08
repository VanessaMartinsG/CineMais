import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
public class FilmesEmCartazController {

    @FXML
    private Button btn01;

    @FXML
    private Button btn02;

    @FXML
    private Button btn03;

    @FXML
    private Button btn04;

    @FXML
    private Button btn05;

    @FXML
    private Button btn06;

    @FXML
    private Button btnBack;

    @FXML
    private Label titleShopping;

    // Add references to the controls in Layout2.fxml
    @FXML
    private Label lblFromController1;
    Bilheteria bilheteria = Bilheteria.getInstance();

    @FXML
    void irIngresso01(ActionEvent event) throws IOException {
        
    }

    @FXML
    void irIngresso02(ActionEvent event) {

    }

    @FXML
    void irIngresso03(ActionEvent event) {

    }

    @FXML
    void irIngresso04(ActionEvent event) {

    }

    @FXML
    void irIngresso05(ActionEvent event) {

    }

    @FXML
    void irIngresso06(ActionEvent event) {

    }

    @FXML
    void voltarListaShoppings(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("listaShoppings.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize(){
        titleShopping.setText(bilheteria.getShoppingSelecionado());
    }

}

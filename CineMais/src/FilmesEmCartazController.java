import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

<<<<<<< Updated upstream
=======
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

>>>>>>> Stashed changes
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
    private Button btnDetalhes01;

    @FXML
    private Button btnDetalhes02;

    @FXML
    private Button btnDetalhes03;

    @FXML
    void irDetalhes01(ActionEvent event) {

    }

<<<<<<< Updated upstream
=======
    @FXML
    private ImageView iconUser;

    @FXML
    private Label infoSalaTipo01;

    @FXML
    private Label infoSalaTipo02;

    @FXML
    private Label infoSalaTipo03;

    @FXML
    private Label infoSalaTipo04;

    @FXML
    private Label infoSalaTipo05;

    @FXML
    private Label infoSalaTipo06;

    @FXML
    private Label titleData;

    @FXML
    private Label titleFilme0102;

    @FXML
    private Label titleFilme0304;

    @FXML
    private Label titleFilme0506;

    // Add references to the controls in Layout2.fxml
>>>>>>> Stashed changes
    @FXML
    void irDetalhes02(ActionEvent event) {

    }

    // void detalhesUsuario(ActionEvent event) throws IOException {
    // Stage stage;
    // Scene scene;

    // Parent root = FXMLLoader.load(getClass().getResource("perfil.fxml"));
    // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    // scene = new Scene(root, 640, 400);
    // stage.setScene(scene);
    // stage.show();
    // }

    @FXML
<<<<<<< Updated upstream
    void irDetalhes03(ActionEvent event) {

    }

    @FXML
    private Label titleShopping;

    @FXML
    void irIngresso01(ActionEvent event) {
=======
    void irIngresso01(ActionEvent event) throws IOException {
>>>>>>> Stashed changes

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
    void voltarListaShoppings(ActionEvent event) {

<<<<<<< Updated upstream
=======
        Parent root = FXMLLoader.load(getClass().getResource("listaShoppings.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        titleShopping.setText(bilheteria.getShoppingSelecionado());
>>>>>>> Stashed changes
    }

}

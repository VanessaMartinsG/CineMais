
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

public class App extends Application {

    @FXML
    private Button btnComprarIngresso;

    @FXML
    private Button btnFilmesCartaz;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("CineMais");
        primaryStage.setScene(tela);
        primaryStage.show();
    }

    /**
     * @param event
     * @throws IOException
     */
    @FXML
    void GoToLogin(ActionEvent event) throws IOException {

        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("login"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ViewFilmesEmCartaz(ActionEvent event) {

    }
}

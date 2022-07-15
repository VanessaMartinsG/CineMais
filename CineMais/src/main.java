import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public class main extends Application{

    @FXML
    private Button btnComprarIngresso;

    @FXML
    private Button btnFilmesCartaz;

    public static void main(String[] args) throws Exception {
        
        Bilheteria bilheteria = Bilheteria.getInstance();
        
        bilheteria.getCinemas();
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
}

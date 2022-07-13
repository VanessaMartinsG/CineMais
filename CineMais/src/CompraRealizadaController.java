import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Sessao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompraRealizadaController {

    @FXML
    private Button btnIrParaHome;

    @FXML
    void irParaHome(ActionEvent event) throws IOException {
        
            Stage stage;
             Scene scene;
     
             Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
             stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
             scene = new Scene(root, 640, 400);
             stage.setScene(scene);
             stage.show();
             
            
         
    }

}

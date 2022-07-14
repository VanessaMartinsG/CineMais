import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

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


public class perfilController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnConta;

    @FXML
    private Button btnExcluirConta;

    @FXML
    private Button btnIngressos;



    @FXML
    void abrirConta(ActionEvent event) throws IOException {
        
        Stage stage;
        Scene scene;
     
        Parent root = FXMLLoader.load(getClass().getResource("conta.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
             
            
         
    }


    @FXML
    void abrirExcluirConta(ActionEvent event) throws IOException{

        Stage stage;
        Scene scene;
     
        Parent root = FXMLLoader.load(getClass().getResource("contaDeletada.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
             
    }

    @FXML
    void abrirIngressos(ActionEvent event) throws IOException {

        Stage stage;
             Scene scene;
     
             Parent root = FXMLLoader.load(getClass().getResource("ingressos.fxml"));
             stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
             scene = new Scene(root, 640, 400);
             stage.setScene(scene);
             stage.show();
             
    }

    @FXML
    void voltarHome(ActionEvent event) throws IOException{

             Stage stage;
             Scene scene;
     
             Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
             stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
             scene = new Scene(root, 640, 400);
             stage.setScene(scene);
             stage.show();
             
    }

    
   

}
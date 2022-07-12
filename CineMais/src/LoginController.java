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
    void fazerLogin(ActionEvent event) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setEmail(inputEmail.getText());
        ClienteDao clienteDao = new ClienteDao();
        cliente = clienteDao.select(cliente);

        // verifica se o usuario existe no json
        Bilheteria bilheteria = Bilheteria.getInstance();
        bilheteria.setClienteSelecionado(cliente);
        //bilheteria.getDb().initDb();
        //bilheteria.listaDbInterface();
        
        
    //    String emailTF = inputEmail.getText();
    //    String senhaTF = inputSenha.getText();

    //    String emailDB = bilheteria.getDb().getEmail();
    //    String senhaDB = bilheteria.getDb().getSenha();

        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("listaShoppings.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    //    if(emailTF.equals(emailDB)){
    //         if(senhaTF.equals(senhaDB)){
                


    //         }
    //         else{
    //             System.out.println("Senha errada");
    //         }
    //     }else{
    //         System.out.println("Email erradao");
    //     }
    
        

       
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

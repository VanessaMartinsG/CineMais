import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Sessao;

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

    @FXML
    private Label filme1;

    @FXML
    private Label filme2;

    @FXML
    private Label filme3;

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
        List<Sessao> sessoes = new ArrayList<>();
        titleShopping.setText(bilheteria.getShoppingSelecionado());
        
        switch(bilheteria.getShoppingSelecionado()){
            case "Shopping Salvador":
            sessoes = bilheteria.getSessaoByDateAndShop("2022-07-08",1);
            filme1.setText(sessoes.get(0).getFilme().getNomeFilme());
            filme2.setText(sessoes.get(2).getFilme().getNomeFilme());
            filme3.setText(sessoes.get(4).getFilme().getNomeFilme());
            break;
            case "Shopping Barra":
            sessoes = bilheteria.getSessaoByDateAndShop("2022-07-08",2);
            filme1.setText(sessoes.get(0).getFilme().getNomeFilme());
            filme2.setText(sessoes.get(2).getFilme().getNomeFilme());
            filme3.setText(sessoes.get(4).getFilme().getNomeFilme());
            break;
            case "Shopping Paralela":
            sessoes = bilheteria.getSessaoByDateAndShop("2022-07-08",3);
            filme1.setText(sessoes.get(0).getFilme().getNomeFilme());
            filme2.setText(sessoes.get(2).getFilme().getNomeFilme());
            filme3.setText(sessoes.get(4).getFilme().getNomeFilme());
            break;
            case "Shopping da Bahia":
            sessoes = bilheteria.getSessaoByDateAndShop("2022-07-08",4);
            filme1.setText(sessoes.get(0).getFilme().getNomeFilme());
            filme2.setText(sessoes.get(2).getFilme().getNomeFilme());
            filme3.setText(sessoes.get(4).getFilme().getNomeFilme());
            break;
        }
    }

}

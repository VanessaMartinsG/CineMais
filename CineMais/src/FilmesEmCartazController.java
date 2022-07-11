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
    private Button btn01Filme1;
    @FXML
    private Button btn02Filme1;
    @FXML
    private Button btn03Filme2;
    @FXML
    private Button btn04Filme2;
    @FXML
    private Button btn05Filme3;
    @FXML
    private Button btn06Filme3;
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
    void irDetalhes01(ActionEvent event) {

    }

    @FXML
    void irDetalhes02(ActionEvent event) {

    }

    @FXML
    void irDetalhes03(ActionEvent event) {

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
            btn01Filme1.setText(sessoes.get(0).getHorario());
            btn02Filme1.setText(sessoes.get(1).getHorario());
            btn03Filme2.setText(sessoes.get(2).getHorario());
            btn04Filme2.setText(sessoes.get(3).getHorario());
            btn05Filme3.setText(sessoes.get(4).getHorario());
            btn06Filme3.setText(sessoes.get(5).getHorario());
            setDataTipoSala(sessoes);
            
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

    public void setDataTipoSala(List<Sessao> sessoes){
        if(sessoes.get(0).getSala().isSala3d()) infoSalaTipo01.setText("Sala:"+sessoes.get(0).getSala().getNumero()+ "  " + "3D");
            else infoSalaTipo01.setText("Sala:"+sessoes.get(0).getSala().getNumero()+ "  " + "2D");
            
            if(sessoes.get(1).getSala().isSala3d()) infoSalaTipo02.setText("Sala:"+sessoes.get(1).getSala().getNumero()+ "  " + "3D");
            else infoSalaTipo02.setText("Sala:"+sessoes.get(1).getSala().getNumero()+ "  " + "2D");
            
            if(sessoes.get(2).getSala().isSala3d()) infoSalaTipo03.setText("Sala:"+sessoes.get(2).getSala().getNumero()+ "  " + "3D");
            else infoSalaTipo03.setText("Sala:"+sessoes.get(2).getSala().getNumero()+ "  " + "2D");
            
            if(sessoes.get(3).getSala().isSala3d()) infoSalaTipo04.setText("Sala:"+sessoes.get(3).getSala().getNumero()+ "  " + "3D");
            else infoSalaTipo04.setText("Sala:"+sessoes.get(3).getSala().getNumero()+ "  " + "2D");
            
            if(sessoes.get(4).getSala().isSala3d()) infoSalaTipo05.setText("Sala:"+sessoes.get(4).getSala().getNumero()+ "  " + "3D");
            else infoSalaTipo05.setText("Sala:"+sessoes.get(4).getSala().getNumero()+ "  " + "2D");
            
            if(sessoes.get(5).getSala().isSala3d()) infoSalaTipo06.setText("Sala:"+sessoes.get(5).getSala().getNumero()+ "  " + "3D");
            else infoSalaTipo06.setText("Sala:"+sessoes.get(5).getSala().getNumero()+ "  " + "2D");
    }

}

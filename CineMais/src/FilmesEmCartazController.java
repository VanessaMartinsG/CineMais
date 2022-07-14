import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private Button btnBuscarData;

    @FXML
    private TextField inputDia;

    @FXML
    private TextField inputMes;

    @FXML
    private Button btnPerfil;

    @FXML
    private Label lblFromController1;
    Bilheteria bilheteria = Bilheteria.getInstance();
    private String dateFormated;

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
    void initialize() {

        titleShopping.setText(bilheteria.getShoppingSelecionado());
        int shoppingId = -1;
        switch (bilheteria.getShoppingSelecionado()) {
            case "Shopping Salvador":
                shoppingId = 1;
                break;
            case "Shopping Barra":
                shoppingId = 2;
                break;
            case "Shopping Paralela":
                shoppingId = 3;
                break;
            case "Shopping da Bahia":
                shoppingId = 4;
                break;
        }
        dateFormated = "2022-" + inputMes.getText() + "-" + inputDia.getText();
        System.out.print(dateFormated);
        final List<Sessao> sessoes = bilheteria.getSessaoByDateAndShop(dateFormated, shoppingId);
        filme1.setText(sessoes.get(0).getFilme().getNomeFilme());
        filme2.setText(sessoes.get(2).getFilme().getNomeFilme());
        filme3.setText(sessoes.get(4).getFilme().getNomeFilme());
        btn01.setText(sessoes.get(0).getHorario());
        btn01.setOnAction(e -> {
            try {
                sessaoSelecionada(sessoes.get(0), e);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        btn02.setText(sessoes.get(1).getHorario());
        btn02.setOnAction(e -> {
            try {
                sessaoSelecionada(sessoes.get(1), e);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        btn03.setText(sessoes.get(2).getHorario());
        btn03.setOnAction(e -> {
            try {
                sessaoSelecionada(sessoes.get(2), e);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        btn04.setText(sessoes.get(3).getHorario());
        btn04.setOnAction(e -> {
            try {
                sessaoSelecionada(sessoes.get(3), e);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        btn05.setText(sessoes.get(4).getHorario());
        btn05.setOnAction(e -> {
            try {
                sessaoSelecionada(sessoes.get(4), e);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        btn06.setText(sessoes.get(5).getHorario());
        btn06.setOnAction(e -> {
            try {
                sessaoSelecionada(sessoes.get(5), e);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        setDataTipoSala(sessoes);
    }

    public void setDataTipoSala(List<Sessao> sessoes) {
        if (sessoes.get(0).getSala().isSala3d())
            infoSalaTipo01.setText("Sala:" + sessoes.get(0).getSala().getNumero() + "  " + "3D");
        else
            infoSalaTipo01.setText("Sala:" + sessoes.get(0).getSala().getNumero() + "  " + "2D");

        if (sessoes.get(1).getSala().isSala3d())
            infoSalaTipo02.setText("Sala:" + sessoes.get(1).getSala().getNumero() + "  " + "3D");
        else
            infoSalaTipo02.setText("Sala:" + sessoes.get(1).getSala().getNumero() + "  " + "2D");

        if (sessoes.get(2).getSala().isSala3d())
            infoSalaTipo03.setText("Sala:" + sessoes.get(2).getSala().getNumero() + "  " + "3D");
        else
            infoSalaTipo03.setText("Sala:" + sessoes.get(2).getSala().getNumero() + "  " + "2D");

        if (sessoes.get(3).getSala().isSala3d())
            infoSalaTipo04.setText("Sala:" + sessoes.get(3).getSala().getNumero() + "  " + "3D");
        else
            infoSalaTipo04.setText("Sala:" + sessoes.get(3).getSala().getNumero() + "  " + "2D");

        if (sessoes.get(4).getSala().isSala3d())
            infoSalaTipo05.setText("Sala:" + sessoes.get(4).getSala().getNumero() + "  " + "3D");
        else
            infoSalaTipo05.setText("Sala:" + sessoes.get(4).getSala().getNumero() + "  " + "2D");

        if (sessoes.get(5).getSala().isSala3d())
            infoSalaTipo06.setText("Sala:" + sessoes.get(5).getSala().getNumero() + "  " + "3D");
        else
            infoSalaTipo06.setText("Sala:" + sessoes.get(5).getSala().getNumero() + "  " + "2D");
    }

    @FXML
    void procurarPorData(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
        initialize();
        // Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // scene = new Scene(root, 640, 400);
        // stage.setScene(scene);
        // stage.show();
    }

    void sessaoSelecionada(Sessao sessao, ActionEvent event) throws IOException {
        bilheteria.setSessaoselecionada(sessao);

        Stage stage;
        Scene scene;
        Parent root;
        if (bilheteria.getClienteSelecionado() != null) {
            root = FXMLLoader.load(getClass().getResource("comprarIngresso.fxml"));
        } else {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void menuPerfil(ActionEvent event) throws IOException {
        Stage stage;
        Scene scene;
        Parent root;
        if (bilheteria.getClienteSelecionado() != null) {
            root = FXMLLoader.load(getClass().getResource("perfil.fxml"));
        } else {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

}

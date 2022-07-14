import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import model.Sessao;
import model.Ingresso;

public class finalizacaoCompraController {
    @FXML
    private Label lblFromController1;
    Bilheteria bilheteria = Bilheteria.getInstance();
    @FXML
    private Label textNome;

    @FXML
    private Label textIdade;

    @FXML
    private Label textEmail;

    @FXML
    private Label textEstudante;

    @FXML
    private Label textFilme;

    @FXML
    private Label textSessao;

    @FXML
    private Label textDia;

    @FXML
    private Label textValor;

    @FXML
    private Label textSala;

    @FXML
    private Label textDuracao;

    @FXML
    private Label textHorario;

    @FXML
    private Label textTipo;

    @FXML
    private Label textQtd;

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
    void irCompraRealizada(ActionEvent event) throws IOException {

        Stage stage;
        Scene scene;

        Parent root = FXMLLoader.load(getClass().getResource("compraRealizada.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        Sessao sessao = bilheteria.getSessaoselecionada();
        textNome.setText(bilheteria.getClienteSelecionado().getNome());
        textEmail.setText(bilheteria.getClienteSelecionado().getEmail());
        textIdade.setText(Integer.toString(bilheteria.getClienteSelecionado().getIdade()));
        if (bilheteria.getClienteSelecionado().isEstudante())
            textEstudante.setText("É estudante");
        else
            textEstudante.setText("Não é estudante");

        textFilme.setText(sessao.getFilme().getNomeFilme());
        textSessao.setText(Integer.toString(sessao.getNumeroSessaoId()));
        textDia.setText(bilheteria.getSessaoselecionada().getData());
        textSala.setText(Integer.toString(sessao.getSala().getNumero()));
        textDuracao.setText(sessao.getFilme().getDuracao());
        textHorario.setText(sessao.getHorario());

        if (sessao.getSala().isSala3d())
            textTipo.setText("3D");
        else
            textTipo.setText("2D");
    }

}

package caburrasi.marcos.perseus.components.comment;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CommentComponent extends AnchorPane {
    private CommentController controlador;

    public CommentComponent() {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Componente_Botones.fxml"));
            this.controlador = new CommentController();
            loader.setController(this.controlador);
            Node n = (Node)loader.load();
            this.getChildren().add(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public CommentController getControlador() {
        return this.controlador;
    }
}

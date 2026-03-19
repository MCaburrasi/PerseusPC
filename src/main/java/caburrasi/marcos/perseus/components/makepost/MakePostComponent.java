package caburrasi.marcos.perseus.components.makepost;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MakePostComponent extends AnchorPane {
    private MakePostController controlador;

    public MakePostComponent() {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Componente_Botones.fxml"));
            this.controlador = new MakePostController();
            loader.setController(this.controlador);
            Node n = (Node)loader.load();
            this.getChildren().add(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public MakePostController getControlador() {
        return this.controlador;
    }
}

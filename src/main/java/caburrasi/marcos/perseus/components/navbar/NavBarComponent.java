package caburrasi.marcos.perseus.components.navbar;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class NavBarComponent extends AnchorPane {
    private NavBarController controlador;

    public NavBarComponent() {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Componente_Botones.fxml"));
            this.controlador = new NavBarController();
            loader.setController(this.controlador);
            Node n = (Node)loader.load();
            this.getChildren().add(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public NavBarController getControlador() {
        return this.controlador;
    }
}

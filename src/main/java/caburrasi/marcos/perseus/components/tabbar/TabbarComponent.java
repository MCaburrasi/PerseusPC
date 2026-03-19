package caburrasi.marcos.perseus.components.tabbar;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TabbarComponent extends AnchorPane {
    private TabBarController controlador;

    public TabbarComponent() {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Componente_Botones.fxml"));
            this.controlador = new TabBarController();
            loader.setController(this.controlador);
            Node n = (Node)loader.load();
            this.getChildren().add(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public TabBarController getControlador() {
        return this.controlador;
    }
}

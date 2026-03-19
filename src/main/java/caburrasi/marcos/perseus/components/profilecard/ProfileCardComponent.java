package caburrasi.marcos.perseus.components.profilecard;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ProfileCardComponent extends AnchorPane {
    private ProfileCardController controlador;

    public ProfileCardComponent() {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Componente_Botones.fxml"));
            this.controlador = new ProfileCardController();
            loader.setController(this.controlador);
            Node n = (Node)loader.load();
            this.getChildren().add(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ProfileCardController getControlador() {
        return this.controlador;
    }
}

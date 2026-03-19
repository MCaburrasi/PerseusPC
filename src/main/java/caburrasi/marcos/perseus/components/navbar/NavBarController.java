package caburrasi.marcos.perseus.components.navbar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class NavBarController implements Initializable {
    @FXML
    private FontIcon home;
    @FXML
    private FontIcon create;
    @FXML
    private FontIcon account;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public FontIcon getHome() {
        return home;
    }

    public FontIcon getCreate() {
        return create;
    }

    public FontIcon getAccount() {
        return account;
    }
}

package caburrasi.marcos.perseus.components.setting;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingController implements Initializable {

    @FXML
    private FontIcon icon;
    @FXML
    private Label name;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public FontIcon getIcon() {
        return icon;
    }

    public void setIcon(FontIcon icon) {
        this.icon = icon;
    }

    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }
}

package caburrasi.marcos.perseus.components.profilecard;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileCardController implements Initializable {

    @FXML
    private ImageView logo;
    @FXML
    private Label name;
    @FXML
    private Label description;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public ImageView getLogo() {
        return logo;
    }

    public void setLogo(ImageView logo) {
        this.logo = logo;
    }

    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }

    public Label getDescription() {
        return description;
    }

    public void setDescription(Label description) {
        this.description = description;
    }
}

package caburrasi.marcos.perseus.components.event;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class EventController implements Initializable {
    @FXML
    private FontIcon options;
    @FXML
    private ImageView logo;
    @FXML
    private Label name;
    @FXML
    private Label timeAndPlace;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public FontIcon getOptions() {
        return options;
    }

    public void setOptions(FontIcon options) {
        this.options = options;
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

    public Label getTimeAndPlace() {
        return timeAndPlace;
    }

    public void setTimeAndPlace(Label timeAndPlace) {
        this.timeAndPlace = timeAndPlace;
    }
}

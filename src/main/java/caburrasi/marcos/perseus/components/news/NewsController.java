package caburrasi.marcos.perseus.components.news;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class NewsController implements Initializable {


    public ImageView image;
    public Label text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public Label getText() {
        return text;
    }

    public void setText(Label text) {
        this.text = text;
    }
}

package caburrasi.marcos.perseus.components.post;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class PostController implements Initializable {
    @FXML
    private ImageView pfp;
    @FXML
    private Label name;
    @FXML
    private Label timeAndPlace;
    @FXML
    private ImageView image;
    @FXML
    private FontIcon like;
    @FXML
    private FontIcon comment;
    @FXML
    private FontIcon send;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public Label getTimeAndPlace() {
        return timeAndPlace;
    }

    public void setTimeAndPlace(Label timeAndPlace) {
        this.timeAndPlace = timeAndPlace;
    }

    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }

    public ImageView getPfp() {
        return pfp;
    }

    public void setPfp(ImageView pfp) {
        this.pfp = pfp;
    }

    public FontIcon getLike() {
        return like;
    }

    public FontIcon getComment() {
        return comment;
    }

    public FontIcon getSend() {
        return send;
    }
}

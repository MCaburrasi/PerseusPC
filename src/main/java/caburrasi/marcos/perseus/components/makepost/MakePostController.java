package caburrasi.marcos.perseus.components.makepost;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MakePostController implements Initializable {


    @FXML
    private ImageView pfp;
    @FXML
    private Label text;
    @FXML
    private ImageView image;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public ImageView getPfp() {
        return pfp;
    }

    public void setPfp(ImageView pfp) {
        this.pfp = pfp;
    }

    public Label getText() {
        return text;
    }

    public void setText(Label text) {
        this.text = text;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    public Button getButton3() {
        return button3;
    }

    public void setButton3(Button button3) {
        this.button3 = button3;
    }
}

package caburrasi.marcos.perseus.components.tool;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class ToolController implements Initializable {

    @FXML
    private ImageView image;
    @FXML
    private Label name;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }
}

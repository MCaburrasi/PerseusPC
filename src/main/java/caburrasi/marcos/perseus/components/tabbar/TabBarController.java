package caburrasi.marcos.perseus.components.tabbar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

public class TabBarController implements Initializable {

    @FXML
    private Label post;
    @FXML
    private Label event;
    @FXML
    private Label news;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public Label getPost() {
        return post;
    }

    public Label getEvent() {
        return event;
    }

    public Label getNews() {
        return news;
    }
}

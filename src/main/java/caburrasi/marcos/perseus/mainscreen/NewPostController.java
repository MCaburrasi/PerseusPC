package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import caburrasi.marcos.perseus.NavigationManager;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewPostController {
    public FontIcon homeButton;
    public TextArea postTextBox;
    public Button sendButton;

    public void openHomeScreen(MouseEvent mouseEvent) {
        NavigationManager.open("/MainScreen.fxml");

        Stage stg = (Stage) homeButton.getScene().getWindow();
        stg.close();
    }

    public void send(MouseEvent mouseEvent) throws IOException, InterruptedException {
        String s = postTextBox.getText();
        postTextBox.setText("");

        Client.getInstance().writeAndRead("Add|Post|" + s);
    }
}

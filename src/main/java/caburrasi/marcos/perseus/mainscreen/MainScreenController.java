package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import caburrasi.marcos.perseus.NavigationManager;
import caburrasi.marcos.perseus.Perseus;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;

public class MainScreenController {
    public FontIcon newPostButton;

    public void OpenNewPostScreen(MouseEvent mouseEvent) throws IOException {
        NavigationManager.open("/NewPostScreen.fxml");


        if (Client.getInstance().getId().equalsIgnoreCase("")){
            NavigationManager.open("/LogIn.fxml");
        }

        Stage stg = (Stage) newPostButton.getScene().getWindow();
        stg.close();
    }
}

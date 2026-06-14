package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import caburrasi.marcos.perseus.NavigationManager;
import caburrasi.marcos.perseus.Perseus;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainScreenController {
    public FontIcon newPostButton;
    public Label title;
    public ImageView image;
    public Label content;

    private Map<String, String> newsContent = new HashMap<>();

    private boolean showPosts = false;

    public void OpenNewPostScreen(MouseEvent mouseEvent) throws IOException {
        NavigationManager.open("/NewPostScreen.fxml");


        if (Client.getInstance().getId().equalsIgnoreCase("")){
            NavigationManager.open("/LogIn.fxml");
        }

        Stage stg = (Stage) newPostButton.getScene().getWindow();
        stg.close();
    }

    public void changeScreen(Event event) throws IOException, InterruptedException {
        showPosts = !showPosts;

        if (showPosts) loadPosts();
        else loadNews();
    }

    public void loadNews() throws IOException, InterruptedException {
        if (newsContent.isEmpty()){
            String s = Client.getInstance().writeAndRead("nwc");

            if (!s.startsWith("Error")){
                String[] sArray = s.split("\\|");

                for (String i : sArray){
                    String[] iArray = i.split("=");
                    newsContent.put(iArray[0], iArray[1]);
                }
            }
            
        }

        if (!newsContent.isEmpty()){{
            title.setText(newsContent.get("title"));
            image.setImage(new Image(newsContent.get("hdurl")));
            content.setText(newsContent.get("explanation"));
        }}

    }

    public void loadPosts(){

    }
}

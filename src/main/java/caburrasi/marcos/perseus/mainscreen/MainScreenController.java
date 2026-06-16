package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import caburrasi.marcos.perseus.NavigationManager;
import caburrasi.marcos.perseus.PostParser;
import caburrasi.marcos.perseus.data.PostData;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainScreenController {
    public ImageView newPostButton;
    public Label title;
    public ImageView image;
    public Label content;
    public VBox postBox;

    private Map<String, String> newsContent = new HashMap<>();
    private List<PostData> posts = new ArrayList<>();

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

        if (showPosts) PostParser.getInstance().parsePosts(postBox, true, 0);
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


}

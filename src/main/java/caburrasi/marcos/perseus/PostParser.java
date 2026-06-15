package caburrasi.marcos.perseus;

import caburrasi.marcos.perseus.data.PostData;
import caburrasi.marcos.perseus.mainscreen.CommentController;
import caburrasi.marcos.perseus.mainscreen.MainScreenController;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostParser {
    private static PostParser PPInstance;

    private int clickedPostId;

    public void parsePosts(VBox postBox, boolean notComment, int postId) throws IOException, InterruptedException {
        String s;
        if (notComment) s = Client.getInstance().writeAndRead("Load|Post");
        else s = Client.getInstance().writeAndRead("Load|Comment|" + postId);

        postBox.getChildren().clear();

        String[] sSplit = s.substring(1, s.length() - 1).split(", ");
        for (String postInfo: sSplit){
            parsePost(postInfo, postBox, notComment);
        }

        if (!Client.getInstance().getId().equalsIgnoreCase("")){
            Button b = new Button("Comment");
            b.setOnAction(event -> {
                clickedPostId = postId;
                comment();
            });

            postBox.getChildren().add(b);
        }
    }

    public void parsePost(String s, VBox postBox, boolean notComment) throws IOException {
        String[] postInfo = s.split("\\|");

        PostData pd;
        if (notComment) pd = new PostData(Integer.parseInt(postInfo[0]), postInfo[1], postInfo[3]);
        else pd = new PostData(Integer.parseInt(postInfo[0]), postInfo[1], postInfo[2]);

        loadPosts(pd, postBox, notComment);
    }

    public void loadPosts(PostData pd, VBox postBox, boolean notComment) throws IOException {
        ObservableList<Node> n = postBox.getChildren();
        VBox v = new VBox();
        Label user = new Label();
        user.setText(pd.getAuthor());
        Label content = new Label();
        content.setText(pd.getContent());

        v.getChildren().add(user);
        v.getChildren().add(content);

        v.fillWidthProperty();

        user.setFont(Font.font(30));
        content.setFont(Font.font(20));

        v.setStyle("-fx-border-radius: 30; -fx-padding: 12; -fx-background-color: #DBD");

        n.add(v);

        if (notComment){
            v.setOnMouseClicked(event -> {
                try {
                    showComments(pd.getId(), postBox);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    public void showComments(int id, VBox postBox) throws IOException, InterruptedException {
        //NavigationManager.open("/CommentScreen.fxml");

        parsePosts(postBox, false, id);
    }

    public void comment(){
        NavigationManager.open("/Comment.fxml");
    }

    public static PostParser getInstance() {
        if (PPInstance == null){
            PPInstance = new PostParser();
        }

        return PPInstance;
    }

    public int getClickedPostId() {
        return clickedPostId;
    }
}

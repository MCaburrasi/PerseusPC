package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import caburrasi.marcos.perseus.PostParser;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CommentController {
    public TextField comment;

    public void setComment(ActionEvent actionEvent) throws IOException, InterruptedException {
        Client.getInstance().writeAndRead("Add|Comment|" + PostParser.getInstance().getClickedPostId() + "|" + comment.getText());
    }
}

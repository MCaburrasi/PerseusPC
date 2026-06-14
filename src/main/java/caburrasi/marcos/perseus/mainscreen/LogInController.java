package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController {
    public TextField username;
    public TextField password;

    public void createAccount(ActionEvent actionEvent) throws IOException, InterruptedException {
        String s = Client.getInstance().writeAndRead("Add|User|" + username.getText() + "|" + password.getText());

        if (!s.equalsIgnoreCase("no")) confirmLogIn();
        else {
            username.clear();
            password.clear();
        }
    }

    public void logIn(ActionEvent actionEvent) throws IOException, InterruptedException {
        String s = Client.getInstance().writeAndRead("Load|User|" + username.getText() + "|" + password.getText());

        if (!s.equalsIgnoreCase("no")) confirmLogIn();
        else {
            username.clear();
            password.clear();
        }
    }

    public void confirmLogIn() throws IOException, InterruptedException {
        Client.getInstance().logIn(username.getText());
        Client.getInstance().writeAndRead("login|" + Client.getInstance().getId());

        Stage stg = (Stage) username.getScene().getWindow();
        stg.close();
    }
}

package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogInController {
    public TextField username;
    public TextField password;

    public void createAccount(ActionEvent actionEvent) throws IOException, InterruptedException {
        Client.getInstance().writeAndRead("Add|User|" + username + "|" + password);
    }

    public void logIn(ActionEvent actionEvent) throws IOException, InterruptedException {
        Client.getInstance().writeAndRead("Load|User|" + username + "|" + password);
    }
}

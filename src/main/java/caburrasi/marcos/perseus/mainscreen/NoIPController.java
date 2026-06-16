package caburrasi.marcos.perseus.mainscreen;

import caburrasi.marcos.perseus.Client;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NoIPController {
    public TextField ip;

    public void setIP(ActionEvent actionEvent) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream("src/main/java/client.properties"));

        p.setProperty("ip", ip.getText());
        ip.setText("");

        try {
            Client.getInstance();
            Stage stg = (Stage) ip.getScene().getWindow();
            stg.close();
        } catch (IOException e) {
            ip.setPromptText("Try again");
        }
    }
}

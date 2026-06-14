package caburrasi.marcos.perseus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.UnknownHostException;

public class Perseus extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Perseus.class.getResource("/MainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Perseus");
        primaryStage.setScene(scene);
        primaryStage.show();

        connectToServer();
    }

    public synchronized void connectToServer() throws InterruptedException {
        try{
            Client.getInstance();
        } catch (IOException e) {
            NavigationManager.open("/NoIP.fxml");
        }
    }
}

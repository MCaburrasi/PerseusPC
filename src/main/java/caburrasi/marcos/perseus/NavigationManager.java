package caburrasi.marcos.perseus;

import caburrasi.marcos.perseus.mainscreen.MainScreenController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NavigationManager {
    public static FXMLLoader loader;

    public static void open(String url){
        Stage st2 = new Stage();
        Parent padre_2 = null;

        try {
            padre_2 = FXMLLoader.load(NavigationManager.class.getResource(url));
        } catch (IOException ex) {
            Logger.getLogger(MainScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene escena_2 = new Scene(padre_2);
        st2.setScene(escena_2);
        st2.show();
    }
}

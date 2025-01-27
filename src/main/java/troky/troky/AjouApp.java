package troky.troky;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AjouApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AjoutReclam.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 123, 123);
        primaryStage.setTitle("Ajouter Réclamation");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

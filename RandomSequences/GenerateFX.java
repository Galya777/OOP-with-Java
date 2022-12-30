package Lab8F18JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GenerateFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sceneGenerate.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("Generate random sequence");
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

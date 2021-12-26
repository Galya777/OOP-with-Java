package zad1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public abstract class DrawTest extends Application {
@Override
    public void start(Stage stage) throws Exception{
    Group group =new Group();
    Line example= new Line();
    example.draw(group);
    stage.setTitle("Example Line");

    stage.setScene(new Scene(group, 300, 300));
    stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/*--module-path "C:\Program Files\JetBrains\openjfx-17-ea+3_windows-x64_bin-sdk\javafx-sdk-17\lib"
        --add-modules javafx.fxml,javafx.controls

        --module-path ${PATH_TO_FX} --add-modules javafx.controls,javafx.fxml

        You can also set an environment variable.
        Go to IntelliJ->File->Settings->Appearance & Behavior->Path Variables,
        and add PATH_TO_FX, with the path to the lib folder*/
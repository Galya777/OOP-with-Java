package NamesGreetings;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NamesGreet extends Application {


    private TextField txtInputFieldWithPrompt;
    private Alert messageBox;

    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane(14,14);
        pane.setAlignment(Pos.CENTER);
        messageBox = new Alert(Alert.AlertType.INFORMATION);

        Text text = new Text("Enter your name: ");
        txtInputFieldWithPrompt = new TextField("Enter your name ...");
        Button greet = new Button("Show greeting");
        Button quit = new Button("Quit");
        // event handling with inner classes
        ActionHandlerClass actionHandler = new ActionHandlerClass();
        greet.setOnAction(actionHandler);
        quit.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });


        pane.getChildren().addAll(text, txtInputFieldWithPrompt,
                greet, quit);

        Scene scene = new Scene(pane, 400, 150);

        primaryStage.setTitle("ActionEvent handling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // private inner class
    private class ActionHandlerClass implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            String string = String.format("Hello, %s", txtInputFieldWithPrompt.getText());

                messageBox.setTitle("Input text");
                messageBox.setHeaderText("Confirmation  ");
                messageBox.setContentText(string);
                messageBox.showAndWait();

        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}


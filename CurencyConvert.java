package CurrencyConverter;

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

import java.util.Objects;

public class CurencyConvert extends Application {


    private TextField txtInputFieldWithPrompt;
    private TextField txtInputFieldWithPrompt1;

    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane(14,14);
        pane.setAlignment(Pos.CENTER);

        Text text = new Text("Enter sum in leva: ");
        txtInputFieldWithPrompt = new TextField("");
        Text text1 = new Text("Enter sum in euro: ");
        txtInputFieldWithPrompt1 = new TextField("");
        Button convert = new Button("Convert");
        Button quit = new Button("Quit");
        // event handling with inner classes
       ActionHandlerClass actionHandler = new ActionHandlerClass();
        convert.setOnAction(actionHandler);
        quit.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });


        pane.getChildren().addAll(text, txtInputFieldWithPrompt,
                convert, quit);

        Scene scene = new Scene(pane, 400, 150);

        primaryStage.setTitle("ActionEvent handling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // private inner class
    private class ActionHandlerClass implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            int value=1;

          if(!Objects.equals(txtInputFieldWithPrompt.getText(), "")){
              value= Integer.parseInt(txtInputFieldWithPrompt.getText());
              value/=2;
              txtInputFieldWithPrompt1.setText(String.valueOf(value));
          } else if (!Objects.equals(txtInputFieldWithPrompt1.getText(), "")){
              value= Integer.parseInt(txtInputFieldWithPrompt1.getText());
              value*=2;
              txtInputFieldWithPrompt.setText(String.valueOf(value));
          }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
package drawrainbow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author echrk
 */
public class DrawRainbow extends Application {
    // colors to use in the rainbow, starting from the innermost
    // The two white entries result in an empty arc in the center
    private final Color VIOLET ;
    private final Color INDIGO ;
    private Color colors[];

    public DrawRainbow() {
        VIOLET = Color.rgb(75, 0, 130, 1.0);
        INDIGO = Color.rgb(128, 0, 128, 1.0);
        colors = new Color[]{Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Arc arc;
        Scene scene = new Scene(root, 800, 400);
        int radius = 40; //  radius of the arc
        //using styles with a Pane Node
        root.setStyle("-fx-background-color: lightgray;");
        // draw the rainbow near the bottom-center
        double centerX = scene.getWidth() / 2;
        double centerY = scene.getHeight() - 10;

        // draws filled arcs starting with the outermost
        for (int counter = colors.length; counter > 0; counter--) {
            // fill the arc from 0 to 180 degrees          
            arc = new Arc(centerX ,centerY ,
                          counter * radius , counter * radius,
                          0, 180);
            arc.setFill(colors[counter - 1]);// set the color for the current arc
            arc.setType(ArcType.OPEN);

            root.getChildren().add(arc);         
        } // end for

        primaryStage.setTitle("Rainbow");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

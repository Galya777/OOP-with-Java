package com.example.spiral;

// Java program to create ellipse by passing the
// coordinates of the center and radius as arguments in constructor
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.scene.shape.Ellipse;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Group;
public class Elipse extends Application {

    // launch the application
    public void start(Stage stage)
    {
        // set title for the stage
        stage.setTitle("creating ellipse");

        // create a ellipse
        Ellipse ellipse = new Ellipse(200.0f, 120.0f, 150.0f, 80.f);

        // create a Group
        Group group = new Group(ellipse);

        // create a scene
        Scene scene = new Scene(group, 500, 300);

        // set the scene
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}


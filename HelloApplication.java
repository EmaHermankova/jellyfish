package com.example.jellyfish;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        Button button = new Button(":)");
        StackPane pane = new StackPane(button);
        Scene scene = new Scene(pane, 640, 480);

        button.setOnAction((e) -> {  // lambda expression
            button.setStyle("-fx-background-color: BLUE");
            System.out.println(":(");
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
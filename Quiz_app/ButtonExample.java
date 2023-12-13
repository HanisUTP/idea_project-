package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ButtonExample  extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 130, Color.WHITE);

        GridPane gridpane = new GridPane();

        Label label = new javafx.scene.control.Label("Test Button");

        Button btn = new Button();
        btn.setText("Push Me");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("u have push me");
            }
        });


        gridpane.add(label, 1, 0);
        gridpane.add(btn, 3, 0);

        root.getChildren().add(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");
        GridPane grid = new GridPane();

        TextField email = new TextField();
        email.setPromptText("Email");

        TextField password = new TextField();
        password.setPromptText("Password");

        Button btn = new Button();
        btn.setText("Submit");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                verify emailtest = new verify();
                verify passwordtest = new verify();
                Text text = new Text();
                GridPane.setConstraints(text, 2, 4);
                if (emailtest.verifyEmail(email.getText()) & passwordtest.verifyPassword(password.getText())){
                    text.setText("Thank you for logging in");
                    grid.getChildren().remove(text);
                    grid.getChildren().add(text);

                }
                else{
                    if (!passwordtest.verifyPassword(password.getText()) & emailtest.verifyEmail(email.getText())){
                        text.setText("Please enter a valid Password");
                        grid.getChildren().add(text);
                    }
                    else if (passwordtest.verifyPassword(password.getText()) & !emailtest.verifyEmail(email.getText())){
                        text.setText("Please enter a valid Email");
                        GridPane.setConstraints(text, 2, 4);
                        grid.getChildren().add(text);
                    }
                    else {
                        text.setText("Please enter a valid Email\nPlease enter a valid Password");
                        grid.getChildren().add(text);
                    }       ;
                }
            }
        });

        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        GridPane.setConstraints(email, 2, 2);
        grid.getChildren().add(email);

        GridPane.setConstraints(password, 2, 3);
        grid.getChildren().add(password);

        GridPane.setConstraints(btn, 3, 3);
        grid.getChildren().add(btn);

        primaryStage.setScene(new Scene(grid, 300, 250, Color.SKYBLUE));
        primaryStage.show();
    }
}
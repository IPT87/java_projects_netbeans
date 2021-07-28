package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) {

        // 1. Creating the view for the application
        // 1.1 Creating components to be used
        Label instructions = new Label("Write Your name and press Start");
        Button start = new Button("Start");
        TextField name = new TextField();

        // 1.2 Creating the layout of the application and adding components to it
        GridPane inputNameLayout = new GridPane();

        inputNameLayout.add(instructions, 0, 0);
        inputNameLayout.add(name, 0, 1);
        inputNameLayout.add(start, 1, 2);

        // 1.3 styling the layout
        inputNameLayout.setPrefSize(300, 180);
        inputNameLayout.setAlignment(Pos.CENTER);
        inputNameLayout.setVgap(10);
        inputNameLayout.setHgap(10);
        inputNameLayout.setPadding(new Insets(20, 20, 20, 20));
        start.setEffect(new Reflection());
        stage.getIcons().add(new Image("file:\\C:\\Users\\MrIbi\\Desktop\\Curso_Java_2020\\App\\change.png"));

        // 1.4 creating the view itself and setting it to use the layout
        Scene inputScene = new Scene(inputNameLayout);

        // 2. Creating a view for showing the welcome message
        Label welcomeMessage = new Label();

        GridPane welcomeLayout = new GridPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.setAlignment(Pos.CENTER);
        welcomeLayout.add(welcomeMessage, 0, 0);

        Scene welcomeScene = new Scene(welcomeLayout);

        // 3. Adding an event handler to the start button.
        start.setOnAction((event) -> {
            welcomeMessage.setText("Welcome " + name.getText() + "!");
            stage.setScene(welcomeScene);
        });

        stage.setScene(inputScene);
        stage.show();
    }
}

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) {

        // 1. Create main layout
        BorderPane layout = new BorderPane();
        layout.setMinHeight(150);
        layout.setMinWidth(200);

        // 1.1. Create menu for main layout
        HBox box = new HBox(8);
        box.setPadding(new Insets(15, 15, 15, 15));

        // 1.2. Create buttons for menu and the other UI elements
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");

        // 1.3. Add buttons to menu
        box.getChildren().addAll(jokeButton, answerButton, explanationButton);

        // 2. Add subviews and add them to the menu buttons
        // 2.1. Create subview layout
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explanationLayout = createView("It is a really bad joke...");

        // 2.2. Add subviews to button. Pressing the buttons will change the view
        jokeButton.setOnAction((event) -> {
            layout.setCenter(jokeLayout);
        });

        answerButton.setOnAction((event) -> {
            layout.setCenter(answerLayout);
        });

        explanationButton.setOnAction((event) -> {
            layout.setCenter(explanationLayout);
        });

        // 2.3. Set initial view
        layout.setTop(box);
        layout.setCenter(jokeLayout);

        // 3. Create main scene with layout
        Scene scene = new Scene(layout);

        // 4. Show the main scene
        stage.setScene(scene);
        stage.show();

    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();

        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

}

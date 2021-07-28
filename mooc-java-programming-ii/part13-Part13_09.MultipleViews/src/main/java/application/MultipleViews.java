package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        VBox vBox = new VBox();
        GridPane gridPane = new GridPane();

        Label textFirst = new Label("First view!");
        Button buttonFirst = new Button("To the second view!");
        Label textSecond = new Label("Second view!");
        Button buttonSecond = new Button("To the third view!");
        Label textThird = new Label("Third view!");
        Button buttonThird = new Button("To the first view!");

        borderPane.setTop(textFirst);
        borderPane.setCenter(buttonFirst);

        vBox.getChildren().add(buttonSecond);
        vBox.getChildren().add(textSecond);

        gridPane.add(textThird, 0, 0);
        gridPane.add(buttonThird, 1, 1);

        Scene first = new Scene(borderPane);
        Scene second = new Scene(vBox);
        Scene third = new Scene(gridPane);

        buttonFirst.setOnAction((event) -> {
            stage.setScene(second);
        });

        buttonSecond.setOnAction((event) -> {
            stage.setScene(third);
        });

        buttonThird.setOnAction((event) -> {
            stage.setScene(first);
        });

        stage.setScene(first);
        stage.show();
    }

}

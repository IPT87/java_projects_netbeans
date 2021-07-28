package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Letters: 0"), new Label("Words: 0"), new Label("The longest word is:"));

        borderPane.setCenter(new TextArea(""));
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane);

        stage.setScene(scene);
        stage.setTitle("Text field");
        stage.show();
    }

}

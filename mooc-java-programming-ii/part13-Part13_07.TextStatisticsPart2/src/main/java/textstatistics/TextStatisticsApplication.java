package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longestWord = new Label("The longest word is:");
        TextArea text = new TextArea("");

        text.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov, String oldValue, String newValue) {
                letters.setText("Letters: " + text.getText().length());
                String[] numWordsArray = text.getText().split(" ");
                words.setText("Words: " + numWordsArray.length);
                String longestWordValue = Arrays.stream(numWordsArray)
                        .sorted((w1, w2) -> w2.length() - w1.length())
                        .findFirst()
                        .get();
                longestWord.setText("The longest word is: " + longestWordValue);
            }
        });

        hBox.getChildren().addAll(letters, words, longestWord);

        borderPane.setCenter(text);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane);

        stage.setScene(scene);
        stage.setTitle("Text statistics");
        stage.show();
    }

}

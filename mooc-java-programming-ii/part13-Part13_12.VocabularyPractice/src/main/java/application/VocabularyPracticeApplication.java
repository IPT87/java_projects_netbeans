package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    @Override
    public void init() {
        this.dictionary = new Dictionary();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage stage) {

        New_Words newWords = new New_Words(dictionary);
        Practice practice = new Practice(dictionary);

        BorderPane layout = new BorderPane();

        HBox box = new HBox(10);
        box.setPadding(new Insets(20, 20, 20, 20));

        Button newWordBtn = new Button("Enter new words");
        Button practiceBtn = new Button("Practice");

        box.getChildren().addAll(newWordBtn, practiceBtn);

        layout.setTop(box);

        Scene scene = new Scene(layout, 400, 300);

        stage.setScene(scene);
        stage.show();

        newWordBtn.setOnAction((event) -> {
            layout.setCenter(newWords.getView());
        });

        practiceBtn.setOnAction((event) -> {
            layout.setCenter(practice.getView());
        });
    }
}

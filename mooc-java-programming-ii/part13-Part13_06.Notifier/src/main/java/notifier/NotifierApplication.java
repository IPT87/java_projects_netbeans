package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) {
        VBox vBox = new VBox(5);

        TextField textField = new TextField();

        Button button = new Button("Update");

        Label label = new Label();

        vBox.getChildren().add(textField);
        vBox.getChildren().add(button);
        vBox.getChildren().add(label);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(textField.getText());
                textField.setText("");
            }
        });

        Scene scene = new Scene(vBox);

        stage.setTitle("Copy the text");
        stage.setScene(scene);
        stage.show();

    }

}

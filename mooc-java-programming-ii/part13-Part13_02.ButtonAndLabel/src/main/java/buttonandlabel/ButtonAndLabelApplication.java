package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage stage) {
        Button btn = new Button("Button");
        Label lbl = new Label("This is a button ");
        FlowPane t = new FlowPane();
        t.getChildren().add(lbl);
        t.getChildren().add(btn);
        Scene scene = new Scene(t);
        stage.setScene(scene);
        stage.setTitle("Test");
        stage.show();
    }

}

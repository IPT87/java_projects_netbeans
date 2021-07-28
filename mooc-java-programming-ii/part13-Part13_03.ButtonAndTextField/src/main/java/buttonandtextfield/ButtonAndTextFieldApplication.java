package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) {
        Button btn = new Button("Button");
        TextField txtf = new TextField();
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(btn);
        flowPane.getChildren().add(txtf);
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }

}

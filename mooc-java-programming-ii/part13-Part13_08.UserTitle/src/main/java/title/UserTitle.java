package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage stage) {
        Parameters param = getParameters();
        String title = param.getNamed().get("title");
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

}

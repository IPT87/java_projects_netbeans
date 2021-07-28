package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class TicTacToeApplication extends Application {

    Button button_1 = new Button(" ");
    Button button_2 = new Button(" ");
    Button button_3 = new Button(" ");
    Button button_4 = new Button(" ");
    Button button_5 = new Button(" ");
    Button button_6 = new Button(" ");
    Button button_7 = new Button(" ");
    Button button_8 = new Button(" ");
    Button button_9 = new Button(" ");

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) {

        BorderPane layout = new BorderPane();

        layout.setPadding(new Insets(10, 10, 10, 10));
        //layout.getStylesheets().add("Style.css");

        GridPane grid = new GridPane();

        Label nextTurn = new Label("Turn: X");
        nextTurn.setFont(Font.font("Monospaced", 40));
        button_1.setFont(Font.font("Monospaced", 40));
        button_2.setFont(Font.font("Monospaced", 40));
        button_3.setFont(Font.font("Monospaced", 40));
        button_4.setFont(Font.font("Monospaced", 40));
        button_5.setFont(Font.font("Monospaced", 40));
        button_6.setFont(Font.font("Monospaced", 40));
        button_7.setFont(Font.font("Monospaced", 40));
        button_8.setFont(Font.font("Monospaced", 40));
        button_9.setFont(Font.font("Monospaced", 40));

        grid.add(button_1, 0, 0);
        grid.add(button_2, 0, 1);
        grid.add(button_3, 0, 2);
        grid.add(button_4, 1, 0);
        grid.add(button_5, 1, 1);
        grid.add(button_6, 1, 2);
        grid.add(button_7, 2, 0);
        grid.add(button_8, 2, 1);
        grid.add(button_9, 2, 2);

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        layout.setTop(nextTurn);
        layout.setCenter(grid);

        button_1.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_1.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_1.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_1.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        button_2.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_2.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_2.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_2.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        button_3.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_3.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_3.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_3.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        button_4.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_4.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_4.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_4.setText("O");
                    nextTurn.setText("Turn: X");
                }

                if (checkWin()) {
                    nextTurn.setText("The end!");
                    disableAllButtons();
                }
            }
        });

        button_5.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_5.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_5.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_5.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        button_6.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_6.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_6.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_6.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        button_7.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_7.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_7.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_7.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        button_8.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_8.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_8.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_8.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        button_9.setOnMouseClicked((event) -> {

            String turn = nextTurn.getText().charAt(nextTurn.getText().length() - 1) + "";

            if (button_9.getText().equals(" ")) {
                if (turn.equalsIgnoreCase("x")) {
                    button_9.setText("X");
                    nextTurn.setText("Turn: O");
                } else {
                    button_9.setText("O");
                    nextTurn.setText("Turn: X");
                }
            }

            if (checkWin()) {
                nextTurn.setText("The end!");
                disableAllButtons();
            }
        });

        Scene scene = new Scene(layout, 295, 330);

        stage.setScene(scene);
        stage.show();

    }

    private boolean checkWin() {

        if (button_1.getText().equals("X") && button_2.getText().equals("X") && button_3.getText().equals("X")
                || button_1.getText().equals("O") && button_2.getText().equals("O") && button_3.getText().equals("O")) {
            return true;
        } else if (button_4.getText().equals("X") && button_5.getText().equals("X") && button_6.getText().equals("X")
                || button_4.getText().equals("O") && button_5.getText().equals("O") && button_6.getText().equals("O")) {
            return true;
        } else if (button_7.getText().equals("X") && button_8.getText().equals("X") && button_9.getText().equals("X")
                || button_7.getText().equals("O") && button_8.getText().equals("O") && button_9.getText().equals("O")) {
            return true;
        } else if (button_1.getText().equals("X") && button_4.getText().equals("X") && button_7.getText().equals("X")
                || button_1.getText().equals("O") && button_4.getText().equals("O") && button_7.getText().equals("O")) {
            return true;
        } else if (button_2.getText().equals("X") && button_5.getText().equals("X") && button_8.getText().equals("X")
                || button_2.getText().equals("O") && button_5.getText().equals("O") && button_8.getText().equals("O")) {
            return true;
        } else if (button_3.getText().equals("X") && button_6.getText().equals("X") && button_9.getText().equals("X")
                || button_3.getText().equals("O") && button_6.getText().equals("O") && button_9.getText().equals("O")) {
            return true;
        } else if (button_1.getText().equals("X") && button_5.getText().equals("X") && button_9.getText().equals("X")
                || button_1.getText().equals("O") && button_5.getText().equals("O") && button_9.getText().equals("O")) {
            return true;
        } else if (button_3.getText().equals("X") && button_5.getText().equals("X") && button_7.getText().equals("X")
                || button_3.getText().equals("O") && button_5.getText().equals("O") && button_7.getText().equals("O")) {
            return true;
        } else {
            return false;
        }
    }

    private void disableAllButtons() {

        button_1.setDisable(true);
        button_2.setDisable(true);
        button_3.setDisable(true);
        button_4.setDisable(true);
        button_5.setDisable(true);
        button_6.setDisable(true);
        button_7.setDisable(true);
        button_8.setDisable(true);
        button_9.setDisable(true);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author MrIbi
 */
public class Practice {

    private Dictionary dictionary;
    private String randomWord;

    public Practice(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.randomWord = dictionary.randomWord();
    }

    public Parent getView() {

        GridPane layout = new GridPane();

        Label wordToTranslate = new Label("Translate the word '" + randomWord + "'");
        TextField text = new TextField();
        Button check = new Button("Check");
        Label result = new Label();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(wordToTranslate, 0, 0);
        layout.add(text, 0, 1);
        layout.add(check, 0, 2);
        layout.add(result, 0, 3);

        check.setOnMouseClicked((event) -> {
            if (dictionary.getTranslation(randomWord).equalsIgnoreCase(text.getText())) {
                result.setText("Correct!");
            } else {
                result.setText("Incorrect! The translation fo the word '" + randomWord + "' is '" + dictionary.getTranslation(randomWord) + "'.");
            }

            randomWord = dictionary.randomWord();
            wordToTranslate.setText("Translate the word '" + randomWord + "'");
            text.clear();
        });

        return layout;

    }

}

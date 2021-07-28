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
public class New_Words {

    private Dictionary dictionary;

    public New_Words(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {

        GridPane layout = new GridPane();

        Button addWordBtn = new Button("Enter new words");
        Label wordLabel = new Label("Word");
        Label translationLbl = new Label("Translation");
        TextField word = new TextField();
        TextField translation = new TextField();
        wordLabel.setLabelFor(word);
        translationLbl.setLabelFor(translation);

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(wordLabel, 0, 0);
        layout.add(word, 0, 1);
        layout.add(translationLbl, 0, 2);
        layout.add(translation, 0, 3);
        layout.add(addWordBtn, 0, 4);

        addWordBtn.setOnMouseClicked((event) -> {
            dictionary.addWord(word.getText(), translation.getText());
            word.clear();
            translation.clear();
        });

        return layout;
    }

}

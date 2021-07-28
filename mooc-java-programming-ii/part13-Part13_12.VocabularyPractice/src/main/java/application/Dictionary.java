/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author MrIbi
 */
public class Dictionary {

    private final List<String> words;
    private final Map<String, String> dictionary;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.dictionary = new HashMap<>();

        addWord("Hello", "Hola");
    }

    public void addWord(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            words.add(word);
            dictionary.put(word, translation);
        }
    }

    public String randomWord() {
        Random random = new Random();
        int randomWord = random.nextInt(words.size());

        return words.get(randomWord);
    }

    public String getTranslation(String word) {
        return dictionary.get(word);
    }

}

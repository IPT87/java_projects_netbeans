
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class DictionaryOfManyTranslations {
        private HashMap<String, ArrayList<String>> translations;

        public DictionaryOfManyTranslations() {
            this.translations = new HashMap<>();
        }
        
        public void add(String word, String translation) {
            translations.putIfAbsent(word, new ArrayList<>());
            translations.get(word).add(translation);
        }
        
        public ArrayList<String> translate(String word) {
            ArrayList<String> results = new ArrayList<>();
            
            if (translations.get(word) != null) {
                for (String translation : translations.get(word)) {
                    results.add(translation);
                }
                return results;
            } else {
                return new ArrayList<>();
            }
        }
        
        public void remove(String word) {
            if (translations.get(word) != null) {
                translations.remove(word);
            }
        }
        
    }

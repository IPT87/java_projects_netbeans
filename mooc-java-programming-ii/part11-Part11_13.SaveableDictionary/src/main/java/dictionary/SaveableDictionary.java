/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MrIbi
 */
public class SaveableDictionary {

    private ArrayList<String> dictionary;
    private String filePath;
    
    public SaveableDictionary() {
        this.dictionary = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new ArrayList<>();
        this.filePath = file;
    }

    public boolean load() {
        try {
            Scanner scanner = new Scanner(Paths.get(filePath));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(":");
                add(words[0], words[1]);
            }
            return true;

        } catch (IOException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(filePath);) {
            dictionary.stream().forEach(words -> writer.println(words));
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!dictionary.contains(words)) {
            dictionary.add(words + ":" + translation);
        }
    }

    public String translate(String word) {
        for (String dict : dictionary) {
            if (dict.contains(word)) {
                String[] words = dict.split(":");
                if (words[0].equals(word)) {
                    return words[1];
                } else {
                    return words[0];
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        Iterator<String> it = dictionary.iterator();

        while (it.hasNext()) {
            if (it.next().contains(word)) {
                it.remove();
            }
        }
    }

}

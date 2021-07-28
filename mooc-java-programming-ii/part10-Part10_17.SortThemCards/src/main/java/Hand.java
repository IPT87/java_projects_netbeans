
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        this.cards.forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        this.cards.sort((card1, card2) -> card1.compareTo(card2));
    }

    @Override
    public int compareTo(Hand o) {
        
        int thisCardsSum = this.cards.stream().mapToInt(card -> card.getValue()).sum();
        int comparedCardsSum = o.cards.stream().mapToInt(card -> card.getValue()).sum();
        
        return thisCardsSum - comparedCardsSum;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
}

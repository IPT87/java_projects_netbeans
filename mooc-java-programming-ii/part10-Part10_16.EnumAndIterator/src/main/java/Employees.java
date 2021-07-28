
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class Employees {
    
    private ArrayList<Person> persons;
    
    public Employees() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.persons.addAll(peopleToAdd);
    }
    
    public void print() {
        Iterator<Person> iterator = this.persons.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        Person person = null;
        
        while(iterator.hasNext()) {
            person = iterator.next();
            if(person.getEducation() == education) {
                System.out.println(person);
            }
        }
        
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        
        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
    
}

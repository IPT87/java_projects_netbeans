
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName;
        String ageRecommendation;
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            
            System.out.println("Input the name of the book, empty stops: ");
            bookName = scanner.nextLine();
            
            if(bookName.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            ageRecommendation = scanner.nextLine();
            
            books.add(new Book(bookName, Integer.valueOf(ageRecommendation)));
            
        }
        
        Comparator<Book> comparator = Comparator
                                            .comparing(Book::getAgeRecommendation)
                                            .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        books.forEach(book -> System.out.println(book));

    }

}

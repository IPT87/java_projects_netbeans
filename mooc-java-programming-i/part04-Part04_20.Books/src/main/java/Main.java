import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        String title = "";
        int pages = 0;
        int yearOfPublication = 0;
        
        while (true) {
            System.out.print("Title: ");
            title = scan.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            pages = Integer.valueOf(scan.nextLine());
            
            System.out.print("Publication year: ");
            yearOfPublication = Integer.valueOf(scan.nextLine());
            
            Book book = new Book(title, pages, yearOfPublication);
            books.add(book);
        }
        
        System.out.print("What information will be printed? ");
        String whatToBePrinted = scan.nextLine();
        
        for (Book book: books) {
            if (whatToBePrinted.equals("everything")) {
                System.out.println(book);
            } else {
                System.out.println(book.getTitle());
            }
        }

    }
}


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        readBooks("C:\\Users\\MrIbi\\Desktop\\codingTest.txt").stream().forEach(element -> System.out.println(element));

    }
    
    public static List<Book> readBooks(String file) {
        try {
           return Files.lines(Paths.get(file)).map(line -> line.split(",")).map(line -> new Book(line[0], Integer.valueOf(line[1]), Integer.valueOf(line[2]), line[3])).collect(Collectors.toList());
        } catch(Exception e) {
            System.out.println("An error has ocurred! Exception:" + e.getMessage());
        }
        
        return new ArrayList<>();
        
    }

}


import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(Paths.get("data.txt"))) {
        
            while (scan.hasNext()) {
                String textLine = scan.nextLine();
                System.out.println(textLine);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}

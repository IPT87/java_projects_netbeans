
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countOfWords = 0;
        
        String input = "";
        
        while (true) {
            input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            countOfWords++;
        }
        
        System.out.println(countOfWords);

    }
}

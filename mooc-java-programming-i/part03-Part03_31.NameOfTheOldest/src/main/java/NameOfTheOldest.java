
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nameOfTheOldest = "";
        int ageOfTheOldest = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] words = input.split(",");
            
            if (Integer.valueOf(words[1]) > ageOfTheOldest) {
                ageOfTheOldest = Integer.valueOf(words[1]);
                nameOfTheOldest = words[0];
            }
            
        }
        
        System.out.println("Name of the oldest: " + nameOfTheOldest);

    }
}

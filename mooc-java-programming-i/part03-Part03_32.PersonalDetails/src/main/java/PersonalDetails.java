
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int countYears = 0;
        int sumOfYears = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] words = input.split(",");
            
            countYears++;
            sumOfYears += Integer.valueOf(words[1]);
            
            if (words[0].length() > longestName.length()) {
                longestName = words[0];
            }
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((1.0 * sumOfYears) / countYears));

    }
}

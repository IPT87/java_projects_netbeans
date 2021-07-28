
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            } else if (input % 2 == 0) {
                statistics2.addNumber(input);
            } else {
                statistics3.addNumber(input);
            }
            
            statistics1.addNumber(input);
        }
        
        System.out.println("Sum: " + statistics1.sum());
        System.out.println("Sum of even numbers: " + statistics2.sum());
        System.out.println("Sum of odd numbers: " + statistics3.sum());
    }
}

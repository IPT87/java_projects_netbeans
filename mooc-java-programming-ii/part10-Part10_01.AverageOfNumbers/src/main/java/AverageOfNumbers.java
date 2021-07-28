
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        // Write your program here
        while(true) {
            
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("end")) {
                break;
            } else {
                inputs.add(input);
            }
            
        }
        
        double average = inputs.stream().mapToInt(i -> Integer.valueOf(i)).average().getAsDouble();
        
        System.out.println("average of the numbers: " + average);
        
    }
}

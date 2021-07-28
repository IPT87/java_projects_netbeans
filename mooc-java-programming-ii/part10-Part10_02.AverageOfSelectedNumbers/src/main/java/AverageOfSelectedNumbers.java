
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        String input;
        double result;
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
            
            input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("end")) {
                break;
            } else {
                inputs.add(Integer.valueOf(input));
            }
            
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();
        
        if(input.equalsIgnoreCase("n")) {
            result = inputs.stream().filter(i -> i < 0).mapToInt(i -> i).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + result);
        } else {
            result = inputs.stream().filter(i -> i >= 0).mapToInt(i -> i).average().getAsDouble();
            System.out.println("Average of the posi--tive numbers: " + result);
        }
        
        scanner.close();

    }
}

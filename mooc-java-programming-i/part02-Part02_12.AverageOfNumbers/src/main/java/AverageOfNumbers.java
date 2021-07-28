
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numsCount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            sum += num;
            numsCount++;
        }
        
        double average = (1.0 * sum) / numsCount;
        System.out.println("Average of the numbers: " + average);

    }
}

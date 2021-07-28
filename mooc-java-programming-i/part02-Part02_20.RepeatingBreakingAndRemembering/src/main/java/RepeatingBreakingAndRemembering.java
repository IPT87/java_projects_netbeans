
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            }
            
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            sum += num;
            numbers++;
        }
        
        average = (1.0 * sum) / numbers;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}

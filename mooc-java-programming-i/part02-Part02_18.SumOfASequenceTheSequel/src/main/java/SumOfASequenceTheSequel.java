
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        
        for (int i = firstNum; i <= lastNum; i++) {
            sum += i;
        }
        
        System.out.print("The sum is " + sum);

    }
}

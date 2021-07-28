
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int input = Integer.parseInt(scanner.nextLine());
        
        while (input != 0) {
            if (input > 0) {
                sum += input;
                count++;
            }
            input = Integer.parseInt(scanner.nextLine());
        }
        
        if (sum > 0) {
            System.out.println((sum * 1.0) / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}

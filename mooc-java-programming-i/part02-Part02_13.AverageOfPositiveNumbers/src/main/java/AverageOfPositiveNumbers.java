
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNumsSum = 0;
        int countPositives = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                positiveNumsSum += num;
                countPositives++;
            }
        }
        
        if (countPositives > 0) {
            double average = (1.0 * positiveNumsSum) / countPositives;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}

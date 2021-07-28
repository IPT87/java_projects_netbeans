
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            int number = scanner.nextInt();
            
            if(number < 0) {
                break;
            } else {
                numbers.add(number);
            }
        }
        
        numbers.stream()
                .filter(number -> (number >= 1 && number <= 5))
                .forEach(number -> System.out.println(number));
        
        scanner.close();

    }
}

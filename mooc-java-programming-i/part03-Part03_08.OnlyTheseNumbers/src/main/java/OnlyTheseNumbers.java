
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.print("From where? ");
        int fromIndex = Integer.valueOf(scanner.nextLine());
        
        System.out.print("To where? ");
        int indexTo = Integer.valueOf(scanner.nextLine());
        
        for (int i = fromIndex; i <= indexTo; i++) {
            System.out.println(numbers.get(i));
        }

    }
}

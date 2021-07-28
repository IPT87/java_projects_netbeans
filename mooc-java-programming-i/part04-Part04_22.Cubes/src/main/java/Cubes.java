
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int num = 0;
        
        while (true) {
            input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            num = Integer.valueOf(input);
            
            System.out.println(num * num * num);
        }

    }
}

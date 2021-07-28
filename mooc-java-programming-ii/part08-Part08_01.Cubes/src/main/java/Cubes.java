
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cube;
        
        while (!input.equals("end")) {
            cube = Integer.parseInt(input);
            System.out.println(cube * cube * cube);
            input = scanner.nextLine();
        }
    }
}

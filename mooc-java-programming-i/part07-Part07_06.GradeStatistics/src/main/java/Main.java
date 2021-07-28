
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradesCalculator gradesCalculator = new GradesCalculator();
        UserInput ui = new UserInput(scanner, gradesCalculator);
        
        ui.start();
    }
}

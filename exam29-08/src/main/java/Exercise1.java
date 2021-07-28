
import java.util.Scanner;


public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operator = "";
        int number;
        int intermediateResult = 0;
        
        System.out.println(intermediateResult);
        
        while (true) {
            System.out.print("Enter operator: ");
            operator = scan.nextLine();
            
            if (operator.equals("exit")) {
                break;
            }
        
            System.out.print("Enter number: ");
            number = Integer.parseInt(scan.nextLine());
        
            if (!(operator.equals("-") || operator.equals("+") || operator.equals("*"))) {
                System.out.println("ERROR");
                System.out.println(intermediateResult);
            } else {
                switch (operator) {
                    case "+":
                        intermediateResult += number;
                        System.out.println(intermediateResult);
                        break;
                    case "-":
                        intermediateResult -= number;
                        System.out.println(intermediateResult);
                        break;
                    case "*":
                        intermediateResult *= number;
                        System.out.println(intermediateResult);
                        break;
                }
            }
        }
        
        System.out.println("exiting");
    }
}

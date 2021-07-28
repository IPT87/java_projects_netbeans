
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts;
        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            parts = input.split(" ");
            String command = parts[0];
            
            if (command.equals("quit")) {
                break;
            }
            
            int amount = Integer.valueOf(parts[1]);
            
            switch (command) {
                case "add":
                    if (amount > 0) {
                        if (first + amount <= 100) {
                            first += amount;
                        } else {
                            first = 100;
                        }
                    }
                    break;
                case "move":
                    if (amount > 0) {
                        if (first - amount >= 0 && first > 0) {
                            first -= amount;
                            if (second + amount <= 100) {
                                second += amount;
                            } else {
                                second = 100;
                            }
                        } else {
                            if (first > 0) {
                                if (second + first <= 100) {
                                    second += first;
                                } else {
                                    second = 100;
                                }
                            }
                        first = 0;
                        }
                    }
                    break;
                case "remove":
                    if (amount > 0) {
                        if (second - amount >= 0) {
                            second -= amount;
                        } else {
                            second = 0;
                        }
                    }
                    break;
                default:
                    break;
            }

        }
    }
    
}

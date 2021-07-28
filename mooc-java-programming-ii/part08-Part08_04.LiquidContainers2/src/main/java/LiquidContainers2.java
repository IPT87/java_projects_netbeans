
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] parts;
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            parts = input.split(" ");
            String command = parts[0];
            
            if (command.equals("quit")) {
                break;
            }
            
            int amount = Integer.valueOf(parts[1]);
            
            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    int amountLiquid = first.contains();
                    if (amountLiquid > amount) {
                        first.remove(amount);
                        second.add(amount);
                    } else {
                        second.add(first.contains());
                        first.remove(amount);
                    }
                    break;
                case "remove":
                    second.remove(amount);
                    break;
                default:
                    break;
            }

        }
    }

}

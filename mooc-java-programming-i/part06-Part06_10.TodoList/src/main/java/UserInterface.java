
import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        String input;
        
        while (true) {
            System.out.print("Command: ");
            input = scan.nextLine();
            
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.print("To add: ");
                
                this.list.add(scan.nextLine());
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                
                this.list.remove(Integer.valueOf(scan.nextLine()));
            }
        }
    }
}

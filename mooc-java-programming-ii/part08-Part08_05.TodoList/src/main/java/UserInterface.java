
import java.util.Scanner;

public class UserInterface {
    private final TodoList toDoList;
    private final Scanner scanner;
    
    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    
    public void start() {
        String command;
        
        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine();
            
            switch (command) {
                case "stop":
                    return;
                case "add":
                    System.out.print("To add: ");
                    String toAdd = scanner.nextLine();
                    this.toDoList.add(toAdd);
                    break;
                case "list":
                    this.toDoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    this.toDoList.remove(Integer.valueOf(scanner.nextLine()));
                    break;
            }
        }
    }
}

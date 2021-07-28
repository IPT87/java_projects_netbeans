
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        List<String> info = new ArrayList<>();
        String name;
        String latinName;
        boolean exist = false;
        
        System.out.print("? ");
        
        String command = scan.nextLine();
        
        while (!command.equalsIgnoreCase("Quit")) {
            switch (command) {
                case "Add":
                {
                    System.out.print("Name: ");
                    name = scan.nextLine();
                    System.out.print("Name in Latin: ");
                    latinName = scan.nextLine();
                    info.add(name + "," + latinName + "," + 0);
                    break;
                }
                case "Observation":
                {
                    String[] parts;
                    System.out.print("Bird? ");
                    name = scan.nextLine();
                    
                    for (int i = 0; i < info.size(); i++) {
                        parts = info.get(i).split(",");
                        
                        if(parts[0].equalsIgnoreCase(name)) {
                            info.set(i, parts[0] + "," + parts[1] + "," + String.valueOf(Integer.parseInt(parts[2]) + 1));
                            exist = true;
                            break;
                        }
                    }
                    
                    if (!exist) {
                        System.out.println("Not a bird!");
                    }
                    
                    exist = false;
                    break;
                }
                case "One":
                {
                    String[] parts;
                    System.out.print("Bird? ");
                    name = scan.nextLine();
                    
                    for (String element : info) {
                        parts = element.split(",");
                        
                        if(parts[0].equalsIgnoreCase(name)) {
                            System.out.println(parts[0] + " (" + parts[1] + "): " + parts[2] + " observations");
                            break;
                        }
                    }
                    break;
                }
                case "All":
                {
                    String[] parts;
                    
                    for (String element : info) {
                        parts = element.split(",");
                        
                        System.out.println(parts[0] + " (" + parts[1] + "): " + parts[2] + " observations");
                    }
                }
                default:
                {
                    break;
                }
            }
            
            System.out.print("? ");
            command = scan.nextLine();
        }
    }

}

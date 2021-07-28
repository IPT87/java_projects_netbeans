
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        String[] info;
        int age = 0;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNext()) {
                info = scan.nextLine().split(",");
                age = Integer.valueOf(info[1]);
                
                if (age > 1 || age == 0) {
                    System.out.println(info[0] + ", age: " + info[1] + " years");
                } else {
                    System.out.println(info[0] + ", age: " + info[1] + " year");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

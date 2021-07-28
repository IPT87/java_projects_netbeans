
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path;
        // test the method here
        System.out.println("Hello! Write the file path:");
        
        while(true) {
            path = scanner.nextLine();
            
            if(path.isEmpty()) {
                break;
            }
        }
        
        read(path).stream()
                    .forEach(line -> System.out.println(line));
        
        scanner.close();

    }
    
    public static List<String> read(String file) {
        ArrayList<String> content = new ArrayList<>();
        
        try {
            content = Files.lines(Paths.get(file)).collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException ex) {
            Logger.getLogger(ReadingFilesPerLine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return content;
        
    }

}

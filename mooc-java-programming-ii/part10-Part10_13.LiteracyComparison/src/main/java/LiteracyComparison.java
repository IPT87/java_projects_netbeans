
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        readData();
    }
    
    public static void readData() {
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((l1, l2) -> l1[5].compareToIgnoreCase(l2[5]))
                    .forEach(data -> System.out.println(data[3] + " (" + data[4] + ")," + data[2].substring(0, data[2].indexOf("(") - 1) + ", " + data[5]));
        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

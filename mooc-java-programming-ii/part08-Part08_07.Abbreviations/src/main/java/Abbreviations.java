
import java.util.HashMap;

public class Abbreviations {
    private final HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        
        if (hasAbbreviation(abbreviation)) {
            System.out.println("Abbreviation already exist!");
        } else {
            abbreviations.put(abbreviation, explanation);
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        
        if (hasAbbreviation(abbreviation)) {
            return abbreviations.get(abbreviation);
        } else {
            return null;
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        
        return abbreviations.containsKey(abbreviation);
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}

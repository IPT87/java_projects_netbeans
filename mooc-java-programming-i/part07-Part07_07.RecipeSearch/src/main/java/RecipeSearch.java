
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {
        private static File fileName;
        private static String recipeName;
        private static int cookingTime;
        private static String ingredient = "";
        private static String recipe;
        private static List<String> recipes = new ArrayList<>();
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        fileName = new File(scanner.nextLine());

        System.out.println();

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        System.out.println();
        String command = "";

        while (!command.equals("stop")) {

            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command) {
                case "list":
                    {
                        recipes = readFileContent(fileName);
                        String[] parts;
                        System.out.println("Recipes:");
                        
                        for (String element : recipes) {
                            parts = element.split(",");
                            System.out.println(parts[0] + ", cooking time: " + parts[1]);
                        }   
                        recipes.clear();
                        break;
                    }
                case "find name":
                    {
                        recipes = readFileContent(fileName);
                        System.out.print("Searched word: ");
                        String searchedWord = scanner.nextLine();
                        String[] parts;
                        
                        for (String element : recipes) {
                            parts = element.split(",");
                            
                            if (parts[0].contains(searchedWord)) {
                                System.out.println("Recipes:");
                                System.out.println(parts[0] + ", cooking time: " + parts[1]);
                            }
                        }       
                        recipes.clear();
                        break;
                    }
                case "find cooking time":
                    {
                        recipes = readFileContent(fileName);
                        System.out.print("Max cooking time: ");
                        int maxCookingTime = Integer.parseInt(scanner.nextLine());
                        String[] parts;
                        System.out.println("Recipes:");
                        
                        for (String element : recipes) {
                            parts = element.split(",");
                            
                            if (Integer.parseInt(parts[1]) <= maxCookingTime) {
                                System.out.println(parts[0] + ", cooking time: " + parts[1]);
                            }
                        }       
                        recipes.clear();
                        break;
                    }
                case "find ingredient":
                    {
                        recipes = readFileContent(fileName);
                        System.out.print("Ingredient: ");
                        String ingredient1 = scanner.nextLine();
                        String[] parts;
                        System.out.println("Recipes:");
                        for (String element : recipes) {
                            parts = element.split(",");
                            
                        for (int i = 2; i < parts.length; i++) {
                            if (parts[i].equals(ingredient1)) {
                                System.out.println(parts[0] + ", cooking time: " + parts[1]);
                            }
                        }       
                        }
                        recipes.clear();
                        break;
                    }
                default:
                    break;
            }
        }
    }
    
    public static List<String> readFileContent(File fileName) {
        
        try (Scanner scan = new Scanner(fileName)) {
            
            String text;
            
                    while (scan.hasNext()) { 
                        recipeName = scan.nextLine();
                        cookingTime = Integer.parseInt(scan.nextLine());
                        text = scan.nextLine();
                        
                        while (!text.isEmpty()) {
                            if (scan.hasNext()) {
                                ingredient += text + ",";
                                text = scan.nextLine();
                            } else {
                                break;
                            }
                        }
                        
                        recipe = recipeName + "," + cookingTime + "," + ingredient;
                        recipes.add(recipe);
                        ingredient = "";
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
        
        return recipes;
    }
    
}

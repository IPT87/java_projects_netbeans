
import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {
        String input;
        String word;
        String transaltion;

        while (true) {
            System.out.print("Command: ");
            input = scan.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.print("Word: ");
                word = scan.nextLine();
                System.out.print("Translation: ");
                transaltion = scan.nextLine();

                dictionary.add(word, transaltion);
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                input = scan.nextLine();

                String result = this.dictionary.translate(input);
                System.err.println("*** " + result + " ***");

                if (result == null) {
                    System.out.println("Word " + input + " was not found");
                } else {
                    System.out.println("Translation: " + result);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}

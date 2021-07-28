package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.print("Write a title for the User interface box:");
        try (Scanner scan = new Scanner(System.in)) {
            String title = scan.nextLine();
            Application.launch(UserTitle.class, "--title=" + title);
        }
    }

}


import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Container firstContainer;
    private Container secondContainer;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.firstContainer = new Container();
        this.secondContainer = new Container();
    }

    public void start() {

        String[] split = new String[2];

        while (true) {
            System.out.println("First: " + this.firstContainer.contains() + "/100");
            System.out.println("Second: " + this.secondContainer.contains() + "/100");

            String input = scan.nextLine();
            split = input.split(" ");

            if (split[0].equals("quit")) {
                break;
            }

            int amount = Integer.parseInt(split[1]);

            if (split[0].equals("add") && amount >= 0) {
                if (firstContainer.contains() + amount > 100) {
                    firstContainer.setContainer(100);
                } else {
                    firstContainer.setContainer(firstContainer.contains() + amount);
                }
            }

            if (split[0].equals("move") & amount >= 0) {
                if (firstContainer.contains() != 0 && amount < firstContainer.contains()) {
                    if (secondContainer.contains() + amount <= 100) {
                        secondContainer.setContainer(secondContainer.contains() + amount);
                    } else {
                        secondContainer.setContainer(100);
                    }

                    firstContainer.setContainer(firstContainer.contains() - amount);
                } else if (firstContainer.contains() != 0 && amount > firstContainer.contains()) {
                    if (secondContainer.contains() + firstContainer.contains() <= 100) {
                        secondContainer.setContainer(secondContainer.contains() + firstContainer.contains());
                    } else {
                        secondContainer.setContainer(100);
                    }

                    firstContainer.setContainer(0);
                } else if (firstContainer.contains() != 0 && amount == firstContainer.contains()) {
                    if (secondContainer.contains() + firstContainer.contains() <= 100) {
                        secondContainer.setContainer(secondContainer.contains() + firstContainer.contains());
                    } else {
                        secondContainer.setContainer(100);
                    }

                    firstContainer.setContainer(0);
                }
            }

            if (split[0].equals("remove") && amount >= 0) {
                if (secondContainer.contains() - amount < 0) {
                    secondContainer.setContainer(0);
                } else {
                    secondContainer.setContainer(secondContainer.contains() - amount);
                }
            }

            System.out.println();

        }
    }
}

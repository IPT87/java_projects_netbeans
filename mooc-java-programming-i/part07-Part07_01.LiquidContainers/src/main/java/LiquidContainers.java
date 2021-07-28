
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        String[] split = new String[2];
        int amount = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            split = input.split(" ");

            if (split[0].equals("quit")) {
                break;
            }

            amount = Integer.parseInt(split[1]);

            if (amount > 0) {
                if (split[0].equals("add")) {
                    if (firstContainer + amount > 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += amount;
                    }
                }

                if (split[0].equals("move")) {
                    if (firstContainer != 0 && amount < firstContainer) {
                        if (secondContainer + amount <= 100) {
                            secondContainer += amount;
                        } else {
                            secondContainer = 100;
                        }

                        firstContainer -= amount;
                    } else if (firstContainer != 0 && amount > firstContainer) {
                        if (secondContainer + firstContainer <= 100) {
                            secondContainer += firstContainer;
                        } else {
                            secondContainer = 100;
                        }

                        firstContainer = 0;
                    } else if (firstContainer != 0 && amount == firstContainer) {
                        if (secondContainer + firstContainer <= 100) {
                            secondContainer += firstContainer;
                        } else {
                            secondContainer = 100;
                        }

                        firstContainer = 0;
                    }
                }
                
                if (split[0].equals("remove")) {
                    if (secondContainer - amount < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                }
            }

            System.out.println();

        }
    }

}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        String[] data;
        int games = 0;
        int ourTeamPoints = 0;
        int rivalTeamPoints = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNext()) {
                data = scanner.nextLine().split(",");

                if (data[0].equals(teamName) || data[1].equals(teamName)) {
                    games++;

                    if (data[0].equals(teamName)) {
                        ourTeamPoints = Integer.valueOf(data[2]);
                        rivalTeamPoints = Integer.valueOf(data[3]);
                    } else {
                        ourTeamPoints = Integer.valueOf(data[3]);
                        rivalTeamPoints = Integer.valueOf(data[2]);
                    }

                    if (ourTeamPoints > rivalTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

                ourTeamPoints = 0;
                rivalTeamPoints = 0;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}

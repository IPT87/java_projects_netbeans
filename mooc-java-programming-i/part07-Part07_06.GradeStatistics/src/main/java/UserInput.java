
import java.util.Scanner;

public class UserInput {

    private Scanner scanner;
    private GradesCalculator gradesCalculator;
    private int points = 0;

    public UserInput(Scanner scanner, GradesCalculator gradesCalculator) {
        this.scanner = scanner;
        this.gradesCalculator = gradesCalculator;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                
                break;
            }

            this.gradesCalculator.sumTotalPoints(points);
            this.gradesCalculator.sumPassingPoints(points);
            this.gradesCalculator.gradeDistribution(points);

        }

        System.out.println("Point average (all): " + this.gradesCalculator.getAveragePoints());

        if (this.gradesCalculator.getAveragePassingPoints() > 0) {
            System.out.println("Point average (passing): " + this.gradesCalculator.getAveragePassingPoints());
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + this.gradesCalculator.getPercentage());
        
        printGrades(this.gradesCalculator.gradeDistribution(points));
    }
    
    public void printGrades(int[] grades) {
        
        System.out.println("Grade distribution:");
        
        for (int i = grades.length - 1; i >= 0; i--) {
            
            System.out.print(i + ": ");
            
            for (int k = 0; k < grades[i]; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

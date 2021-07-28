
public class GradesCalculator {

    private int sumfOfTotalPoints = 0;
    private int numOfTotalPoints = 0;
    private int sumOfPassingPoints = 0;
    private int numOfPassingPoints = 0;
    private double averagePoints = 0;
    private double averagePassingPoints = 0;
    private double passPercentage = 0;
    private int[] gradesLevels = new int[6];
    
    public void GradesCalculator() {
        
    }

    public void sumTotalPoints(int points) {

        if (points > -1 && points <= 100) {
            sumfOfTotalPoints += points;
            numOfTotalPoints++;
        }
    }

    public void sumPassingPoints(int points) {

        if (points >= 50 && points <= 100) {
            sumOfPassingPoints += points;
            numOfPassingPoints++;
        }
    }
    
    public double getAveragePoints() {
        
        this.averagePoints = (1.0 * sumfOfTotalPoints) / numOfTotalPoints;
        
        return this.averagePoints;
    }
    
    public double getAveragePassingPoints() {
        
        this.averagePassingPoints = (1.0 * sumOfPassingPoints) / numOfPassingPoints;
        
        return this.averagePassingPoints;
    }
    
    public double getPercentage() {
        
        this.passPercentage = 100 * (1.0 * numOfPassingPoints / numOfTotalPoints);
        
        return this.passPercentage;
    }
    
    public int[] gradeDistribution(int points) {
        
        if (points > -1 && points < 50) {
            gradesLevels[0]++;
        } else if (points >= 50 && points < 60) {
            gradesLevels[1]++;
        } else if (points >= 60 && points < 70) {
            gradesLevels[2]++;
        } else if (points >= 70 && points < 80) {
            gradesLevels[3]++;
        } else if (points >= 80 && points < 90) {
            gradesLevels[4]++;
        } else if (points >= 90 && points <= 100) {
            gradesLevels[5]++;
        }
        
        return gradesLevels;
    }
}

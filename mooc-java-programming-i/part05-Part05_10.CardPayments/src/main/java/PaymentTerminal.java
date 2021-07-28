
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        
        double change;
        
        if (payment >= 2.50) {
            this.money += 2.50;
            this.affordableMeals++;
            change = payment - 2.50;
        } else {
            change = payment;
        }
        
        return change;
    }

    public double eatHeartily(double payment) {
        
        double change;
        
        if (payment >= 4.30) {
            this.money += 4.30;
            this.heartyMeals++;
            change = payment - 4.30;
        } else {
            change = payment;
        }
        
        return change;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.50)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.30)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

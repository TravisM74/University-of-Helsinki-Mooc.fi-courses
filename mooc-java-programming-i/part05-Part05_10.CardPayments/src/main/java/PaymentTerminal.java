
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double cost = 2.50;
        if (payment >= cost) {
            this.money = this.money + cost;
            payment=payment-cost;
            affordableMeals++;
        }
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        
        return payment;
    }
    public boolean eatAffordably(PaymentCard card){
        double cost = 2.50;
        if (card.balance() >= cost){
            card.takeMoney(cost);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double cost = 4.30;
        if (payment >= cost) {
            this.money = this.money + cost;
            payment=payment-cost;
            heartyMeals++;
        }
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
       
        return payment;
    }
    public boolean eatHeartily(PaymentCard card){
        double cost = 4.30;
        if (card.balance() >= cost){
            card.takeMoney(cost);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum > 0) {
            card.addMoney(sum);
            this.money = this.money + sum ;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

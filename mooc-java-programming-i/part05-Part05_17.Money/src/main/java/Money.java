
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public Money minus(Money decreaser){
        if (this.lessThan(decreaser)){
           return new Money(0,0);
        } else {
            int tempEuros = this.euros - decreaser.euros;
            int tempCents = this.cents - decreaser.cents;
            if (tempCents < 0){
                tempCents = tempCents +100;
                tempEuros--;
            }
           return new Money(tempEuros, tempCents);
        }
       
    }
    
    public boolean lessThan(Money compared){
        //location
      
        //variables recast and compared
        Money comparedMoney = (Money) compared;
        
        if (this.euros < comparedMoney.euros){             
            return true;
        }
        if ((this.euros == comparedMoney.euros) &&
             (this.cents < comparedMoney.cents)){
            return true;
        }
        return false;
    }
    

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}

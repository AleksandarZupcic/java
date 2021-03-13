
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }

    public boolean lessThan(Money compared){
        int totalMoneyOne = this.euros * 100 + this.cents;
        int totalMoneyCompared = compared.euros * 100 + compared.cents;
        return totalMoneyOne < totalMoneyCompared;
    }
    
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser)){
           return new Money(0, 0);
        }
        
        int cent;
        int euro = this.euros - decreaser.euros;
        
        if(this.cents < decreaser.cents){
            cent = 100 + this.cents - decreaser.cents;
            euro--;
        }
        else{
            cent = Math.abs(this.cents - decreaser.cents);
        }
        
        return new Money(euro, cent);
    }
}

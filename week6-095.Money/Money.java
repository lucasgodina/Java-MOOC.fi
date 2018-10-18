
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money newMoney = new Money(this.euros + added.euros, this.cents + added.cents);
        return newMoney;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else {
            if (this.euros == compared.euros) {
                if (this.cents < compared.euros) {
                    return true;
                }
            }
        }
        return false;
    }

    public Money minus(Money decremented) {
        int c = this.cents - decremented.cents;
        int e = this.euros - decremented.euros;

        if (c < 0) {
            c +=100;
            e -= 1;
        }

        if(e < 0){
            c = 0;
            e = 0;
        }

        Money newMoney = new Money(e, c);
        return newMoney;
    }
}

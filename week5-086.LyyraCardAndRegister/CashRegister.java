
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double economicalLunch = 2.50;
        if (cashGiven >= economicalLunch) {
            this.cashInRegister += economicalLunch;
            economicalSold++;
            return cashGiven - economicalLunch;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double gourmetLunch = 4.00;
        if (cashGiven >= gourmetLunch) {
            this.cashInRegister += gourmetLunch;
            gourmetSold++;
            return cashGiven - gourmetLunch;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card){
        double economicalLunch = 2.50;
        if(card.balance() >= economicalLunch){
            card.pay(economicalLunch);
            economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card){
        double gourmetLunch = 4.00;
        if(card.balance() >= gourmetLunch){
            card.pay(gourmetLunch);
            gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if (sum > 0){
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

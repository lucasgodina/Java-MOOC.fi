public class Counter {
    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        this(startingValue, false);
    }

    public Counter(boolean check){
        this(0, check);
    }

    public Counter(){
        this(0,false);
    }

    public int value(){
        return this.number;
    }

    public void increase(){
        this.number++;
    }

    public void decrease(){
        if(check == false){
            this.number--;
        } else {
            if(number > 0){
                this.number--;
            }
        }

    }

    public void increase(int increaseAmount){
        while (increaseAmount > 0){
            increase();
            increaseAmount--;
        }
    }

    public void decrease(int decreaseAmount){
        while(decreaseAmount > 0){
            decrease();
            decreaseAmount--;
        }
    }
}

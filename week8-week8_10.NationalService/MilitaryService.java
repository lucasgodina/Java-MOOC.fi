public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work(){
        if(getDaysLeft() > 0) {
            this.daysLeft--;
        }
    }
}


import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            meals.add(meal);
        }
    }

    public void printMeals(){
        int i = 0;
        while (i < meals.size()) {
            System.out.println(meals.get(i));
            i++;
        }
    }

    public void clearMenu(){
        meals.clear();
    }
}

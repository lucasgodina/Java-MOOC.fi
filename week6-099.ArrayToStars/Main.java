
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        int i = 0;
        for (int number : array){
            int j = 0;
            while(j < array[i]){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}

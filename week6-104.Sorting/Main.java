
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallestIndex = i;
                smallest = array[i];
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int array[], int index) {
        int smallestIndex = index;
        int smallest = array[index];

        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallestIndex = i;
                smallest = array[i];
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int buffer1 = array[index1];
        int buffer2 = array[index2];

        array[index1] = buffer2;
        array[index2] = buffer1;
    }

    public static void sort(int[] array){
        int currentPosition = 0;
        while(currentPosition < array.length){
            System.out.println(array);
            int buffer = indexOfTheSmallestStartingFrom(array, currentPosition);
            swap(array, buffer, currentPosition);
            currentPosition++;
            System.out.println(array);
        }
    }
}

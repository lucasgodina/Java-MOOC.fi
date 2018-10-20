

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];

        int i = 0;
        while (i < array.length) {
            newArray[i] = array[i];
            i++;
        }

        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];

        int buffer1 = 0;
        int buffer2 = array.length - 1;
        while(buffer1 < array.length){
            newArray[buffer2] = array[buffer1];
            buffer1++;
            buffer2--;
        }

        return newArray;
    }
}

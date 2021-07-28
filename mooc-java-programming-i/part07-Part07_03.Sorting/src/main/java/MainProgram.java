
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        int indexOfTheSmallest = 0;
        int smallestNum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
                indexOfTheSmallest = i;
            }
        }

        return indexOfTheSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int indexOfTheSmallest = 0;
        int smallestNum = table[startIndex];

        for (int i = 1; i < table.length; i++) {
            if (i >= startIndex && table[i] <= smallestNum) {
                smallestNum = table[i];
                indexOfTheSmallest = i;
            }
        }

        return indexOfTheSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int newValue = array[index1];
        array[index1] = array[index2];
        array[index2] = newValue;

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(Arrays.toString(array));

            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}

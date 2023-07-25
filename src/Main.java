import java.util.Arrays;
import java.util.Random;

public class Main {

    // selection sort
    // small optimization
    // time complexity - O(n^2)
    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                // Find the minimum element in unsorted array
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // condition is used to determine whether a swap is necessary
            // if minIndex == i there is no need to swap array[i] with itself
            // this condition reduces the number of operations executed
            if (minIndex != i) {
                int tempMin = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tempMin;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-10, 50);
        }

        System.out.println("Array before selection sort: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("Array after selection sort: " + Arrays.toString(array));
    }
}
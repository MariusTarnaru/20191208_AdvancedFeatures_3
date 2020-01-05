import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randomIntsArray {

    /* Create and implement Simple Search on Array of Random ints and
    Array of Strings
     */
    public static void simpleSearch(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx])
                    min_idx = j;
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
            System.out.print(" " + array[i]);
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
        }
        System.out.print(" " + Arrays.toString(arr));
        System.out.println();
        simpleSearch(arr);
        System.out.println();

//sort of Array of Strings
        String[] cars = {"Volvo", "Mercedes","Hyundai", "BMW", "Ford", "Audi", "Mazda", "Bentley", "Honda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(" " + cars[i]);
        }
        Arrays.sort(cars);
        System.out.println();
        System.out.print(Arrays.toString(cars));

    }
}

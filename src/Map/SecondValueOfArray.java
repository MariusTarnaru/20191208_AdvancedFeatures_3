package Map;

/*
Create and implement an algorithm wich will find the second smallest
 value in an array
*/

import java.util.Arrays;

public class SecondValueOfArray {

    public static void main(String[] args) {

        int[] x = {7, 8, 9, 4, 3, 0, 5, 2};
        int[] arr = {4, 6, 12, 8, 0, 31, 7, 9};

        secondValArr(x);
        System.out.println("Array is bubble sorted: " + Arrays.toString(x));
        System.out.println("Second lowest value element of array is: " + x[1]);
        System.out.println();
        secondValArr(arr);
        System.out.println("Array is bubble sorted: " + Arrays.toString(arr));
        System.out.println("Second lowest value element of array is: " + arr[1]);


    }

    public static int[] secondValArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}

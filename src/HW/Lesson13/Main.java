package HW.Lesson13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 40;
        int[] arr = new int[10];
        int[] arr1 = new int[]{32, 43, 5, 54, 324, 5437};
        /*arr[0] = 30;
        arr[6] = 20;
        System.out.println(arr.toString());
        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[][] array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }*/
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = 9 - i;
        }*/

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

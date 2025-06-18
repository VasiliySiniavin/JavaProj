package HW.GIT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Git_HW {
    public static void main(String[] args) throws IOException {
/*
Написать программу, которая позволяет ввести с клавиатуры 5 чисел и выводит их в убывающем порядке.
 */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 чисел");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println();
        /* Пропущенное число * Вам предоставлен массив из n-1 целых чисел, и эти целые числа находятся в диапазоне от 0 до n. *
        В массиве нет дубликатов. В массиве отсутствует одно из целых чисел. Напишите эффективный код для поиска
        пропущенного целого числа. * Пример: * I/P [0, 1, 2, 4, ,6, 3, 7, 8] * O/P 5
         */
        int[] array = {0, 1, 2, 4, 6, 3, 7, 8};
        int missNumber = findElement(array);
        System.out.println(missNumber);
    }
        public static int findElement(int[] array){
            int max = Integer.MIN_VALUE;
            for (int t : array) {
                if (t > max) {
                    max = t;
                }
            }

            int sum = max * (max + 1) / 2;
            int actSum = 0;
            for (int t : array) {
                actSum += t;
        }
            return sum - actSum;
    }
}

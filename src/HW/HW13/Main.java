package HW.HW13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Создать и заполнить массив из 10 чисел, значениями от 1 до 10 */
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

        /* Создать и заполнить массив из 10 чисел, значениями от 10 до 1 */
        System.out.println("task 2");
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2.length - i;
            System.out.println(arr2[i]);
        }
        /* Создать и заполнить массив из 10 чисел, значениями от 10 до 19 */
        System.out.println("task 3");
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = 10 + i;
            System.out.println(arr3[i]);
        }
        /* Создать и заполнить массив из 10 чисел, значениями от 29 до 20 */
        System.out.println("task 4");
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = 29 - i;
            System.out.println(arr4[i]);
        }
        /* Ввести 5 строк с клавиатуры и записать их в массив */
        System.out.println("task 5");
        /*String[] arr5 = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 строк");

        for (int i = 0; i < 5; i++) {
            arr5[i] = reader.readLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr5[i] + " ");
        }*/
        /* Ввести 5 чисел с клавиатуры и записать их в массив. Вывести содержимое массива в консоль */
        /*System.out.println("task 6");
        int[] arr6 = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 чисел");

        for (int i = 0; i < 5; i++) {
            arr6[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr6[i] + " ");
        }*/
        /* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
        Посчитать сумму элементов массива и вывести её на экран. */
        System.out.println("task 7");
        int sum = 0;
        int[] arr7 = new int[]{2,4,5,6,7};

        for (int i = 0; i < arr7.length; i++) {
            sum +=arr7[i];
        }
        System.out.print(sum);
        System.out.println();
        /* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
        Найти минимальный элемент в массиве и вывести его в консоль. */
        System.out.println("task 8");
        int[] arr8 = {2,4,5,6,8};
        int min = arr8[0];
        for (int i = 1; i < arr8.length; i++) {
            if (arr8[i] < min) {
                min = arr8[i];
            }
        }
        System.out.println(min);
/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/
        System.out.println("task 9");
        System.out.println(max(initializeArray()));

/* Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
        int numb = 10;
        for (int i = 0; i < numb; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
*/
    public static int[] initializeArray() throws IOException {
        System.out.println("Введите 10 чисел");
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i] + " ");
        }
        return array;
    }
// 2. Метод max(int[] array) должен находить максимальное число из элементов массива
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

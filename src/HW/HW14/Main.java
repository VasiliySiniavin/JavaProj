package HW.HW14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Human grandFather1 = new Human("Анатолий", true, 65, null, null);
        Human grandFather2 = new Human("Виктор", true, 64, null, null);
        Human grandMother1 = new Human("Анна", false, 64, null, null);
        Human grandMother2 = new Human("Виктория", false, 62, null, null);
        Human mother = new Human("Стелла", false, 40, grandFather1, grandMother1);
       /* Human father = new Human();
        Human daugther = new Human();
        Human son = new Human();*/
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(mother);

        //System.out.println(Arrays.toString(initializeArray()));
        String[] array = {"Тест", "мной", "был", "пройден", "вчера", "сегодня", "надо", "повторить", "обязательно", "."};
        printArray(array);

        /*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
        //      System.out.println("Введите 5 строчек слов или текста");
        //      String[] arrString = new String[5];
        //      int [] arrInt = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 /*       for (int i = 0; i < arrString.length; i++) {
            arrString[i] = reader.readLine();
        }
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = arrString[i].length();
            System.out.println(arrInt[i]);
        }
        System.out.println();

/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
        System.out.println("Введите 10 чисел на каждой строке");
        int[] new_array = new int[10];
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = Integer.parseInt(reader.readLine());
        }
        // 1 вариант
      /*  int[] array_1 = new int[5];
        int[] array_2 = new int[5];
        for (int i = 0; i < new_array.length / 2; i++) {
            array_1[i] = new_array[i];
        }
        for (int i = new_array.length / 2, j = 0; i < new_array.length; i++, j++) {
            array_2[j] = new_array[i];
            System.out.println((array_2[j]));
        }
        System.out.println(); */
        // 2 вариант
        int[] array_3 = Arrays.copyOfRange(new_array, 0, new_array.length / 2);
        int[] array_4 = Arrays.copyOfRange(new_array, new_array.length / 2, new_array.length);
        //System.out.println(Arrays.toString(array_3));
        for (int i = 0; i < array_4.length; i++) {
            System.out.println((array_4[i]));
        }

    }

    /*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
*/
    public static String[] initializeArray() throws IOException {
        System.out.println("Введите 10 строчек слов или текста");
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length - 2; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 0; i < array.length; i++) {
        }
        return array;
    }
/*
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
 */
    public static void printArray(String[] new_array) {
        for (int i = new_array.length - 1; i >= 0; i--) {
            System.out.println(new_array[i]);
        }
    }
}

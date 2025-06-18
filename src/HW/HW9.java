package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW9 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /* Ввести с клавиатуры два числа, вывести на экран максимальное из них. */

        System.out.println("Input two nums: ");
        int num1t1 = Integer.parseInt(reader.readLine());
        int num2t1 = Integer.parseInt(reader.readLine());

        if (num1t1 > num2t1) {
            System.out.println(num1t1);
        } else if (num2t1 > num1t1) {
            System.out.println(num2t1);
        } else {
            System.out.println("Equals");
        }
        /* Ввести с клавиатуры три числа, вывести на экран минимальное из них. */
        System.out.println("Input three nums: ");
        int num1t2 = Integer.parseInt(reader.readLine());
        int num2t2 = Integer.parseInt(reader.readLine());
        int num3t2 = Integer.parseInt(reader.readLine());
        if (num1t2 < num2t2 && num1t2 < num3t2) {
            System.out.println(num1t2);
        } else if (num2t2 < num1t2 && num2t2 < num3t2) {
            System.out.println(num2t2);
        } else {
            System.out.println(num3t2);
        }

        /* Ввести с клавиатуры три числа, вывести на экран среднее из них. */
        System.out.println("Input three nums (average): ");
        int num1t3 = Integer.parseInt(reader.readLine());
        int num2t3 = Integer.parseInt(reader.readLine());
        int num3t3 = Integer.parseInt(reader.readLine());
        if (num1t3 > num2t3 && num1t3 < num3t3) {
            System.out.println(num1t3);
        } else if (num1t3 < num2t3 && num2t3 < num3t3) {
            System.out.println(num2t3);
        } else {
            System.out.println(num3t3);
        }

        /* Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5",
        если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр метода больше 5
         - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и. */
        System.out.println("Realize method compare(int a): ");

        int num1t4 = Integer.parseInt(reader.readLine());
        compare(num1t4);

        /* Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
        Если число отрицательное, то увеличить его на 10. Вывести результат на экран. */
        System.out.println("Task#5 num with keyboard: ");
        int num1t5 = Integer.parseInt(reader.readLine());

        if (num1t5 > 0) {
            System.out.println(num1t5 * 2);
        } else {
            System.out.println(num1t5 + 10);
        }

        /* Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 20 до 50
         и сообщить результат на экран в следующем виде: "Число а не содержится в интервале."
         или "Число а содержится в интервале.", где а - аргумент метода. */
        System.out.println("Realize method checkInterval(int a): ");
        int num1t6 = Integer.parseInt(reader.readLine());
        checkInterval(num1t6);

        /* Реализовать метод closeToFive. Метод должен выводить на экран ближайшее к 5 из двух чисел,
        записанных в аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
        Если оба числа на равной длине к 5, то вывести на экран любое из них. */
        System.out.println("Realize method closeToFive(int a, int b): ");
        int num1t7 = Integer.parseInt(reader.readLine());
        int num1t8 = Integer.parseInt(reader.readLine());
        closeToFive(num1t7, num1t8);
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println("Число меньше 5");
        } else if (a > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }
    }

    public static void checkInterval(int a) {
        if (a >= 20 && a >= 50) {
            System.out.println("Число а содержится в интервале.");
        } else {
            System.out.println("Число а не содержится в интервале.");
        }
    }

    public static void closeToFive(int a, int b) {
        //Если a больше 5, то расстояние distanceA равно a - 5, иначе 5 - a.
        int distanceA = (a > 5) ? (a - 5) : (5 - a);
        int distanceB = (b > 5) ? (b - 5) : (5 - b);
        if (distanceA < distanceB) {
            System.out.println(a);
        } else if (distanceB < distanceA) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}

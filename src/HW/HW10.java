package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW10 {
    public static void main(String[] args) throws IOException {
        /* Вывести на экран числа от 1 до 10 используя цикл while. */
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        System.out.println("next task");
        /* Вывести на экран числа от 10 до 1 используя цикл while. */
        int b = 10;
        while (b >= 1) {
            System.out.println(b);
            b--;
        }

        System.out.println("next task");
/*
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("next task");
/*
Ввести с клавиатуры строку и число N. Вывести на экран строку N раз используя цикл while.
Пример ввода: pro 2
Пример вывода: pro pro
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        int t = 0;
        while (t < num) {
            System.out.print(str + " ");
            t++;
        }
        System.out.println();
        System.out.println("next task");
/*
Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример:
m=2, n=4
8888
8888
*/
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println("8");
        }
        System.out.println("next task");
        /* Вывести на экран квадрат 10х10 из букв P используя цикл while. */
        int r = 1;
        String rt = "Р";
        while (r < 10) {
            int p = 1;
            while (p < 10) {
                System.out.print(rt);
                p++;
            }
            System.out.println();
            r++;
        }
        System.out.println("last task");
        /* Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме. */
        int sum;
        while (true) {
            int num1 = Integer.parseInt(reader.readLine());
            int num2 = Integer.parseInt(reader.readLine());
            sum = num1 + num2;
            System.out.println(sum);
            if (num == -1) {
                System.out.println("Сумма: " + sum);
                break;
            }
        }
    }
}

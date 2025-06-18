package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         /*
Ввести с клавиатуры число n. Вывести на экран надпись «Я зарабатываю $n в час».
Пример: Я буду зарабатывать $50 в час
*/
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Я зарабатываю " + num + " в час");


/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
Пример: Alex будет получать 4000 через 5 лет.
*/
        String name = reader.readLine();
        int salary = Integer.parseInt(reader.readLine());
        int year = Integer.parseInt(reader.readLine());
        System.out.println(name + " будет получать " +
                salary + " через " + year +" лет");


    }
}

package HW.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your age: ");
        /*int age = Integer.parseInt(reader.readLine());

        if(age >= 18 && age <= 30) {
            System.out.println("Adult content");
        } else {
            System.out.println("No content");
        }*/
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 < num2) {
            System.out.println(num1);
        } else if(num2 < num1) {
            System.out.println(num2);
        } else {
            System.out.println("equals");
        }

    }
}

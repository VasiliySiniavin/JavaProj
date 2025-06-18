package HW.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      /*  InputStreamReader streamReader = new InputStreamReader(System.in);
        System.out.println(streamReader.read());
        while (true) {
            int data = System.in.read();
            System.out.println(data);
        }
        String s = reader.readLine();
        System.out.println(s);

        String t = reader.readLine();
        int num = Integer.parseInt(t);
        System.out.println(num * 2);*/

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(sum(num1, num2));
    }

    private static int sum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}

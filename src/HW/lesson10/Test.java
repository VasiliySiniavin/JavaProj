package HW.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// for while and do-while
public class Test {
    public static void main(String[] args) throws IOException {
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.println("inner " + j);
           }
           System.out.println("text " + i);
       }

        /*for(int i = 0; i <= 10; i+=2) {
            System.out.println("text " + i);
        }*/
        /*int i = 10;
        while (i < 10) {
            System.out.println("text " + i);
            i++;
        }
        int j = 10;
        do {
            System.out.println("text " + j);
            j++;
        } while (j < 10);*/

        /*for (int i = 0; i < 10; i++) {
            if(i == 7) {
               // break;
                continue;
            }
            System.out.println("text " + i);
        }
        System.out.println("End");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        while (!str.equals("exit")) {
            System.out.println(str);
            str = reader.readLine();

        }*/
    }
}

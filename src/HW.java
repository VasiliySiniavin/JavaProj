import HW.lesson1.Main;

public class HW {
    public static void main(String[] args) {
        byte b = 4;
        int i = 20;
        short s = 32000;
        char c = 'a';
        float f = 23.5F;
        long l = 244060850L;
        double d = 32.5;
        boolean bool = true;

        System.out.println(b);
        System.out.println(i);
        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        /*

         */
        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int temp = number1;
        number1 = number2;
        number2 = number3;
        number3 = temp;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        Main.sum(1, 3);
    }
}

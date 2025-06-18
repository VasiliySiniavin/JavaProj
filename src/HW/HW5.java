package HW;

public class HW5 {

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(multy(5, 5));
        System.out.println(subt(5, 5));
        System.out.println(div(5, 5));
        System.out.println(convert(2));
        System.out.println(percent(20));
        print("тестовая строка");
    }

    private static int sum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
    private static int multy(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }
    private static int subt(int num1, int num2) {
        int res = num2 - num1;
        return res;
    }

    private static int div(int num1, int num2) {
        int res = num1 / num2;
        return res;
    }

    private static double convert(int digit) {
        double euro = 0.885;
        double dollar = digit * euro;
        return dollar;
    }

    private static double percent(int digit) {
        double numbOv = digit * 1.1;
        return numbOv;
    }

    private static void print(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
}

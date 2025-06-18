package HW.lesson1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       byte b = 23; // Byte - класс обертка
       int number = 20; // Integer
       short s = 32000; // Short
       char c = 49; // Character
       float f = 23.5F; // Float
       long l = 353647L; // Long
       double d = 23.5; // Double
        //Классы обертки используются в тех местах где невозможно использ примитиви для преобразования типа (пример строка в число)
       // Примитивных типов 8 и начинаются с маленькой буквы, остальные ссылочные - с большой буквы и скрываюется за ними большой класс object
       String str = "452";
       // 2 типа памяти: heap и stack. heap - глобальная память (сохранять и предоставлять)
        // stack память создается отдельно для каждого потока, мейн - 1 поток программы 1 heap и stack
        // В stack хранится все переменные примитивных типов. Ссылочные в heap и есть ссылка в stack
        System.out.println(c);
        System.out.println(str);

        int num = Integer.parseInt(str);
        System.out.println(num);

        int res = sum(20, 30);
        System.out.println(res);

        System.out.println(convert("test"));
}

public static int sum(int number1, int number2) {
    int res = number1 + number2;
    return res;
}

private static String convert(String str) {
        String res = str + "end";
        return res;
}
}
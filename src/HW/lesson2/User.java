package HW.lesson2;
//static значит что переменная создается в 1 экзмепляре и вызываются через класс
public class User {
    public /*static */ int age;
    public String name;
    public String passportData;

    public void talk(String text) {
        System.out.println(text);
    }
}

package HW.lesson2;
// user []
public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.age = 25;
        user.name = "Peter";
        user.passportData = "pass 2456";
        System.out.println(user.age);

        User user1 = new User();
        user1.age = 25;
        user1.name = "Petro";
        user1.passportData = "pass 2457";
        System.out.println(user1.age);
    }
}

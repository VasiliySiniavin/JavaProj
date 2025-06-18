package HW.lesson12;

public class Main {
    public static void main(String[] args) {
        User user = new User(25, "Alex", "0541 567451");
        User user1 = new User(25, "Peter");
        user.setName("Vasya");
        System.out.println(user1.getName());
        System.out.println(user.getName());
    }
}

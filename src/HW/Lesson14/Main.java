package HW.Lesson14;

public class Main {
    public static void main(String[] args) {
        User user = new User("Volodya", 28);
        System.out.println(user.toString());

        User user1 = new User("Volodya", 28);
        System.out.println(user1.toString());
        System.out.println(user1.hashCode());
        System.out.println(user1.equals(user));

    }
}

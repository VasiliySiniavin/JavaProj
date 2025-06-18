package HW.HW12;

public class Dog {
    private String name;
    private int age;
    private Woman owner;

    public Dog(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

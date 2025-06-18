package HW.HW12;

public class Man {
    /*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы объекты стали мужем и женой.
*/
    private String name;
    private int age;
    private Woman1 wife;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Woman1 getWife() {
        return wife;
    }
    public void setWife(Woman1 wife) {
        this.wife = wife;
    }
}

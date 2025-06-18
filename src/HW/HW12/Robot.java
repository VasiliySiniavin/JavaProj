package HW.HW12;

public class Robot {
    /*
Создать класс Robot с параметрами: name, age, power
Реализовать метод boolean fight(Robot anotherRobot): реализовать механизм драки роботов в зависимости от силы.
Метод должен определять, выиграл ли робот, у которого вызвали метод fight (this) бой или нет, т.е. возвращать true,
если выиграли и false - если нет.
Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false
     */
    private String name;
    private int age;
    private double power;

    public Robot(String name, int age, double power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }
    public Robot(double power) {
        this.power = power;
    }

    public boolean fight(Robot anotherRobot) {
        if (anotherRobot.power > getPower()) {
        } else {
           return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

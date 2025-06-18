package HW;
import HW.HW12.*;

public class HW12Test {
    public static void main(String[] args) {
    /*
Создать класс Robot с параметрами: name, age, power
Реализовать метод boolean fight(Robot anotherRobot): реализовать механизм драки роботов в зависимости от силы. Метод должен определять, выиграл ли робот, у которого вызвали метод fight (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false
*/
        Robot robot1 = new Robot("Fedor", 5, 25.4);
        Robot robot2 = new Robot("Fedor", 5, 26.4);
        System.out.println(robot1.fight(robot2));

/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы владельцем каждого питомца была одна и та же женщина.
*/
        Woman owner = new Woman("Kate", 28);
        Cat cat = new Cat("Markiz", 2, owner);
        Dog dog = new Dog("Sharik", 3, owner);
        Fish fish = new Fish("Nemo", 1, owner);

        System.out.println("Имя кота: " + cat.getName() + ". Возраст кота: " +cat.getAge() + ". Владелец кота: " + owner.getName());
        System.out.println("Имя собаки: " + dog.getName() + ". Возраст собаки: " + dog.getAge() + ". Владелец собаки: " + owner.getName());
        System.out.println("Имя рыбы: " + fish.getName() + ". Возраст рыбы: " + fish.getAge() + ". Владелец рыбы: " + owner.getName());

/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы объекты стали мужем и женой.
*/

        Woman1 woman1 = new Woman1("Julia", 34);
        Man man = new Man("Ivan", 33);
        woman1.setHusband(man);
        man.setWife(woman1);

        System.out.println("Имя жены: " + woman1.getName() + ". Возраст жены: " + woman1.getAge() + ". Имя мужа: " + man.getName());
        System.out.println("Имя мужа: " + man.getName() + ". Возраст мужа: " + man.getAge() + ". Имя жены: " + woman1.getName());

    }
}

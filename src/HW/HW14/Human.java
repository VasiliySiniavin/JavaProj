package HW.HW14;

public class Human {
    /*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
Примечание: Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Катя, пол: женский, возраст: 55
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

    private String name;
    private boolean gender;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        String sexStr = gender ? "мужчина" : "женщина";
        String fatherName = (father != null) ? father.name : "";
        String motherName = (mother != null) ? mother.name : "";
        String line1 = "Имя: " + name + ", пол: " + sexStr + ", возраст: " + age + ". отец: " + fatherName + ", мать: " + motherName;
        String line2 = "Имя: " + name + ", пол: " + sexStr + ", возраст: " + age;
        if (father != null || mother != null) {
            return line1;
        } else {
            return line2;
        }
    }
}

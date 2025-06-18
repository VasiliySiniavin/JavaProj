package HW.lesson12;

public class User {
    private String name;
    private int age;
    private String passportData;

   public User(int age, String name, String passportData) {
       this.age = age;
       this.name = name;
       this.passportData = passportData;
   }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

   public int getAge() {
       return age;
   }

   public String getName(){
       return name;
   }

   public String getPassportData() {
       return passportData;
   }

   public void setName(String name){
       this.name = name;
   }
   public void talk(String text) {
       System.out.println(text);
   }
   public static void m() {

   }
}

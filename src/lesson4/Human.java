package lesson4;

public class Human {
    //статический атрибут
    public static int count = 0;
    public static String prefix = "Mr.";
    //атрибут
    private String name;
    private int age;
    private int height;

    //Конструктор экземпляра класса
    public Human(String personName, int personAge, int height) {
        this.age = personAge;
        this.name = personName;
        this.height = height;
        count++;
    }

    //Статический метод
    public static void printCount() {
        System.out.println(count);
    }

    //Метод экземпляра класса
    public void sayHi() {
        System.out.println(this.name + ": привет");
        System.out.println(this.height);
    }

    public void switchName() {
        this.name = "Yuri";
    }

    //Геттер
    public String getName() {
        return prefix + this.name;
    }

    public int getAge() {
        return this.age;
    }

    //Сеттер
    public void setName(String newName) {
        this.name = newName;
    }
}

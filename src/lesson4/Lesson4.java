package lesson4;

public class Lesson4 {

    public static void main(String[] args) {
        Human yuri = new Human("Yurao", 30, 184);
        Human petr = new Human("Petr", 30, 184);
        Human vasiliy = new Human("Vasiliy", 30, 184);

        System.out.println(yuri.getName());
        System.out.println(petr.getName());
        System.out.println(vasiliy.getName());
        Human.prefix = "Boss ";
        System.out.println(yuri.getName());
        System.out.println(petr.getName());
        System.out.println(vasiliy.getName());

    }
}


package lesson8;

public class Lesson8CheckedExceptions {

    //Создание проверяемого исключения (Класс Exception или его наследники)
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 0;
        if (b == 0) {
            throw new Exception("Какая то ошибка");
        }
        System.out.println(a / b);
    }
}

package lesson8;

public class Lesson8UnckeckedException {

    public static void main(String[] args) {
        //Обработка RunTimeException
        try {
            runSomething();
        } catch (RuntimeException e) {
            System.out.println("Что то пошло не так");
        }

    }

    //Создание непроверяемого исключения (Класс RunTimeException или его наследники)
    public static void runSomething() {
        int a = 1;
        int b = 2;
        System.out.println(a / b);
        throw new RuntimeException("Что то пошло не так");
    }
}

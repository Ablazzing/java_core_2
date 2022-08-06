package lesson9;

/**
 * Класс Object, анонимные и вложенные классы.
 */
public class Lesson9 {
    public static void main(String[] args) throws Throwable {
        //Любой класс неявно наследуется от Object
        Human human = new Human("Yuri");

        //Методы класса Object
        //Вывод на экран информации об объекте (по умолчанию выводиться ссылка памяти на объект)
        String hiToString = human.toString();

        //Получение класс объекта
        Class<?> hiClass = human.getClass();

        //Сравнение двух объектов
        Human human2 = new Human("Yuri");
        boolean isEqual = human.equals(human2);

        //Получение краткого числового представления об объекте (hashcode)
        int hashCode = human.hashCode();

        //Клонирование объекта (Получение нового объекта, с такими же атрибутами)
        Human clone = (Human) human.clone();

        //Вызов кода при удалении объекта
        ((Human) human).finalize();
        Runtime.getRuntime().gc();

        //Относятся к многопоточности, на этой лекции рассматриваться не будут
        human.wait();
        human.notify();
        human.notifyAll();

        Car car = new Car(100, 200);
        //Вложенный статический класс
        Car.Engine engine = new Car.Engine(500, 300);

        //Вложенный нестатический класс
        Car.Transmission transmission = (car).new Transmission();
        transmission.getInfo();

        //Анонимный класс - существует только в одном экземпляре
        Flyable duck = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Утка летит");
            }
        };

        duck.fly();
    }
}

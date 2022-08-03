package lesson8;

public class Calc {
    String nameModel;
    String nameProducer;

    public Calc(String nameModel) {
        this.nameModel = nameModel;
    }

    //Перегрузка конструктора
    public Calc(String nameModel, String nameProducer) {
        this.nameModel = nameModel;
        this.nameProducer = nameProducer;
    }

    public static int add(int a, int b) {
        if (a < 0 || b < 0) {
            //Выбрасываем ошибку с помощью слова throw и создаем Экземпляр конкретной ошибки
            throw new NegativeNumberException("Одно из чисел отрицательное: " + a + " " + b);
        }

        return a + b;
    }

    //Перегрузка метода (overload) - Создание метода с уже существующим именем,
    //но другими параметрами (типами или количеством)
    public static String add(String a, String b) {
        return a + b;
    }

    //Перегрузка метода (overload) - Создание метода с уже существующим именем,
    //но другими параметрами (типами или количеством)
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

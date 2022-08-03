package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        //Примитивы
        //Нравится ли вам кофе
        //true - да, false - нет
        boolean answer = false;
        boolean myAnswer = true;
        System.out.println("Нравится ли вам кофе?");
        System.out.println(answer);

        //От минус 128 до 128
        byte bt = -128;

        //Больше значений -32765 до 32767
        short sh = 32_767;

        //Диапазон от -2 147 483 648 до 2 147 483 649
        int number = 32_767;

        //Диапазон до 2 в 64 степени
        long ln = 8_000_000_000L;

        //Числа с плавающей точкой
        float fl = 3.123456789012345f;
        //Больше знаков после запятой
        double db = 3.1234567890123456789;

        //Мат операции
        int number1 = 10;
        double number2 = 3;
        double result = number1 / number2;
        double result2 = number1 - number2;
        double result3 = number1 + number2;
        double result4 = (number1 * number2) * 2;

        //Символы
        char ch = 105 + 1;
        System.out.println(ch);

        //Массивы
        //Массив чисел
        int[] array = new int[5];
        array[0] = 10;
        System.out.println(array);

        //Массив символов
        char[] arrayChar = new char[5];
        arrayChar[0] = 'в';
        arrayChar[1] = 'о';
        arrayChar[2] = 'д';
        arrayChar[3] = 'к';
        arrayChar[4] = 'а';
        System.out.println(arrayChar);

        //Короткий способ объявления массива
        char[] newArray = new char[]{'в', 'о', 'д', 'к', 'а'};

        //Текст
        String vodka = "водка 100";
        System.out.println(vodka);
        String forChapaev = " для Чапаева";

        //Конкатенация (соединение двух строк в одну)
        String resultChapaev = vodka + forChapaev;
        System.out.println(resultChapaev);

        //Конкатенацию можно делать с другими типами данных, например String + double. Результат String
        System.out.println("Информация: " + 3.12);
    }
}

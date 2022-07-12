package lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        String text = "Меня зовут юрий\n";

        //В нижний регистр
        text = text.toLowerCase();

        //В верхний регистр
        String newText = text.toUpperCase();

        //Замена строки
        String oleg = text.replaceAll("юрий", "Олег");

        //Повторить строку n раз
        String repeatedText = text.repeat(10);

        //Добавление переноса строки
        String newTextForMe = "Это текст" + '\n' + "Вторая часть";

        //Создание строки из массива char
        char[] letters = new char[]{'v','o','d','k','a'};
        String charText = String.valueOf(letters);

        //Примитивы (копируются по значению)
        int number = 10;
        int number2 = number;

        number = 11;
        System.out.println(number);
        System.out.println(number2);

        //Ссылочные типы данных (копируются по ссылке)
        int[] numbers = new int[]{1, 2, 3, 4};
        int[] numbers2 = numbers;
        numbers2[0] = 10;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));



    }
}

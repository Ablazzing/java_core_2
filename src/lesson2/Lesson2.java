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

        int number = 10;
        int number2 = number;

        number = 11;
        System.out.println(number);
        System.out.println(number2);

        //
        int[] numbers = new int[]{1, 2, 3, 4};
        int[] numbers2 = numbers;
        numbers2[0] = 10;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        String[] strings = new String[]{"Строка 1", "Строка 2"};
        System.out.println(Arrays.toString(strings));

        String newTextForMe = "Это текст" + '\n' + "Вторая часть";
        System.out.println(newTextForMe);

        //Создание строки из массива char
        char[] letters = new char[]{'v','o','d','k','a'};
        String charText = String.valueOf(letters);
        System.out.println(charText);
    }
}

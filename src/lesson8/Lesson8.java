package lesson8;

import java.io.*;

public class Lesson8 {

    public static void main(String[] args) throws IOException {
        int a = 1;
        int b = 0;

        //Обработка ошибок
        try {
            System.out.println(a/b);

        } catch (ArithmeticException exception) {
            System.out.println("Недопустимая арифметическая операция");
        }

        //Чтение файла и обработка ошибки FileNotFoundException (файл не найден)
        //В случае если файл не найден создаем новую ошибку
        try {
            FileReader fileReader = new FileReader("E:\\repos\\java_core_2\\src\\story");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            fileReader.close();
            bufferedReader.close();
            //Действия на случай появления FileNotFoundException
        } catch (FileNotFoundException e) {
            FileWriter writer = new FileWriter("E:\\repos\\java_core_2\\src\\story");
            writer.write("какой то текст");
            writer.close();
            System.out.println("Файла не было, мы его создали сами");
            //Действия на случай появления других ошибок
        } catch (Exception e) {
            System.out.println("Какая другая ошибка");
        }

        int add = doAdd();
        System.out.println(add);
    }

    //Метод вызывающий статический метод калькулятора, и обрабатывающий потенциальные ошибки из него
    public static int doAdd() {
        try {
            int add = Calc.add(1, -3);
            return add;
            //Если в add передали негативное число, появится ошибка NegativeNumberException
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Ошибка внутри catch");
            //В случае возникновения ошибки, мы вернем 0
        } finally {
            System.out.println("Метод отработал");
            return 0;
        }
    }
}

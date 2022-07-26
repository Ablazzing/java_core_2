package lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson6 {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        Horse horse = new Horse();

        //Полиморфизм
        Animal[] animals = {cat, horse};

        for (Animal animal : animals) {
            animal.eat();
            //Проверка на принадлежность к классу
            if (animal instanceof Cat) {
                Cat cat1 = (Cat) animal;
                cat1.makeSound();
            }
        }

        String filename = "C:\\repos\\java_core_2_right\\test.txt";
        //Класс читающий файл
        FileReader fileReader = new FileReader(filename);

        // Чтение по символам
        //        while (fileReader.ready()) {
        //            char read = (char) fileReader.read();
        //            //System.out.print(read);
        //        };

        //Класс обертка, позволяющий читать кусками
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        }

        //Закрытие классов, чтобы файлы не висели в оперативе
        fileReader.close();
        bufferedReader.close();

        //Запись в файл (перезапишет с нуля существующий или создаст новый)
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("hi!");
        fileWriter.close();

        //Запись в файл (добавит в файл данные или создаст новый файл, при отсутствии)
        FileWriter fileWriter2 = new FileWriter(filename, true);
        fileWriter2.write("hi!");
        fileWriter2.close();

        //Try with resources - закрывает Filereader автоматически
        try (FileReader fileReader2 = new FileReader(filename)) {
            fileReader2.ready();
            int read = fileReader2.read();
        }
    }
}

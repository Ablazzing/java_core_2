package lesson6.homework.advance;

import lesson6.homework.base.Car;
import lesson6.homework.base.FinancialRecord;
import lesson6.homework.base.Lada;
import lesson6.homework.base.Toyota;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HomeworkAdvance {

    public static void main(String[] args) throws IOException {
        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        Car[] cars = new Car[40];
        for (int i = 0; i < 20; i++) {
            cars[i] = CarFactory.createLada();
            cars[i + 20] = CarFactory.createToyota();
        }

        for (Car car : cars) {
            if (car instanceof Lada) {
                Lada lada = (Lada) car;
                lada.broke();
            } else if (car instanceof Toyota) {
                Toyota toyota = (Toyota) car;
                toyota.musicOn();
            }
        }

        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        Random random = new Random(1);

        FinancialRecord[] financialRecords = new FinancialRecord[10];
        for (int i = 0; i < 10; i++) {
            financialRecords[i] = new FinancialRecord(random.nextInt(10000), random.nextInt(10000));
        }

        String filename = "E:\\repos\\java_core_2\\report.txt";
        FileWriter writer = new FileWriter(filename);
        for (FinancialRecord record : financialRecords) {
            writer.write(record.serialize());
        }
        writer.close();

        int totalIncomes = 0;
        int totalOutcomes = 0;
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);

        while (reader.ready()) {
            String line = reader.readLine();
            String[] split = line.split(";");
            int incomes = Integer.parseInt(split[0]);
            int outcomes = Integer.parseInt(split[1]);
            totalIncomes += incomes;
            totalOutcomes += outcomes;
        }

        System.out.println("Общие доходы " + totalIncomes);
        System.out.println("Общие расходы " + totalOutcomes);

        reader.close();
        fileReader.close();
    }
}

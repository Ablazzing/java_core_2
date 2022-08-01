package lesson6.homework.expert;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HomeworkExpert {
    private final static String DELIMITER = ";";

    public static void main(String[] args) throws URISyntaxException, IOException {
        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        //Читать файлы нужно через
        //Прочитать все файлы из папки
        //        String path1 = "путь до файла";
        //        Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));

        List<ShopRecord> shopRecords = readReports();
        task2(shopRecords);

        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд


        // Задача №2
        // Необходим составить отчет о расходах за весь период по магазинам (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результата:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд
    }

    public static void task2(List<ShopRecord> shopRecords) {
        Map<String, Double> map = new HashMap<>();
        for (ShopRecord shopRecord : shopRecords) {
            if (map.containsKey(shopRecord.getShop())) {
                Double oldOutcome = map.get(shopRecord.getShop());
                map.put(shopRecord.getShop(), oldOutcome + shopRecord.getOutcome());
            } else {
                map.put(shopRecord.getShop(), shopRecord.getOutcome());
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void task1(List<ShopRecord> shopRecords) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        for (ShopRecord shopRecord : shopRecords) {
            if (shopRecord.getShop().equals("pyterochka")) {
                String monthPlusYear = shopRecord.getDate().getMonthValue() + " " + shopRecord.getDate().getYear();
                if (map.containsKey(monthPlusYear)) {
                    Double oldProfit = map.get(monthPlusYear);
                    double dayProfit = shopRecord.getIncome() - shopRecord.getOutcome();
                    map.put(monthPlusYear, oldProfit + dayProfit);
                } else {
                    double dayProfit = shopRecord.getIncome() - shopRecord.getOutcome();
                    map.put(monthPlusYear, dayProfit);
                }
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static List<ShopRecord> readReports() throws URISyntaxException, IOException {
        String foldername = "E:\\repos\\java_core_2\\resource";
        File folder = new File(foldername);
        List<ShopRecord> shopRecords = new ArrayList<>();

        for (File file : folder.listFiles()) {
            List<String> allLines = Files.readAllLines(file.toPath());
            for (int i = 1; i < allLines.size(); i++) {
                ShopRecord shopRecord = parseTextToShopRecord(allLines.get(i));
                shopRecords.add(shopRecord);
            }
        }

        return shopRecords;
    }

    public static ShopRecord parseTextToShopRecord(String text) {
        String[] split = text.split(DELIMITER);
        String shop = split[0];
        double income = Double.parseDouble(split[1]);
        double outcome = Double.parseDouble(split[2]);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("d/M/y");
        LocalDate date = LocalDate.parse(split[3], pattern);
        return new ShopRecord(shop, income, outcome, date);
    }
}

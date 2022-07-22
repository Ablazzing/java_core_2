package lesson4.homework.expert;



import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;



public class HomeworkExpert {
    public static void main(String[] args) {
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
        //Таск №1
        getSpecialNumbers(data);
    }

    public static void getSpecialNumbers(Map<Integer, Map<String, String[]>> data) {
        Pattern pattern = Pattern.compile("М\\d{3}АВ");
        HashSet<String> specialNumbers = new HashSet<>();
        for (Map.Entry<Integer, Map<String, String[]>> entry : data.entrySet()) {
            for (Map.Entry<String, String[]> regionData : entry.getValue().entrySet()) {
                for (String carNumber : regionData.getValue()) {
                    if (pattern.matcher(carNumber).find()) {
                        specialNumbers.add(carNumber);
                    }
                }
            }
        }
        System.out.println(specialNumbers);
    }
}

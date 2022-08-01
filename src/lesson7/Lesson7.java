package lesson7;

public class Lesson7 {

    public static void main(String[] args) {
        //Примеры использования одного интерфейса, для разных классов
        Yacht yacht = new Yacht();
        Fish fish = new Fish();
        Swimmable[] swimmables = {fish, yacht};

        for (Swimmable swimmable : swimmables) {
            swimmable.swim();
        }

        System.out.println("_____________________");

        //Примеры использования одного интерфейса, для разных классов
        Tiger tiger = new Tiger();
        Soundable[] soundables = {yacht, tiger};

        for (Soundable soundable : soundables) {
            soundable.makeSound();
        }

        System.out.println("_____________________");

        //Примеры использования enam
        YachtWithCountry yachtWithCountry = new YachtWithCountry(Country.RUSSIA);
        System.out.println(Country.RUSSIA.getCountPeople());

    }
}

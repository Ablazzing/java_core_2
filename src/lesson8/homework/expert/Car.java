package lesson8.homework.expert;

public class Car {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public void getPrice() throws Exception {
        if (price < 0) {
            throw new Exception("Стоимость меньше нуля");
        }
        System.out.println(price);
    }
}

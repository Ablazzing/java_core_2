package lesson8.homework.expert;

// Реализовать паттерн Decorator для класса Car (атрибут - стоимость, метод - вывести на экран стоимость).
// Метод вывести на экран стоимость - выкидывает ошибку, если стоимость меньше 0
// Для этого шаблона характерно:
// 1. Класс основа (Car), и класс декоратор (CarShop), который принимает в себя экземпляр класса основы
// 2. Вызов всех методов происходит у декоратора
// Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимостью 5000
// Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
// 5000 - (вызванно из объекта Car)
// Хочешь купить авто? (Вызвано из объекта CarShop)

// Если стоимость машины меньше нуля:
// Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
// Неизвестна мне - (вызванно из объекта CarShop)
// Давайте посмотрим другое авто? (Вызвано из объекта CarShop)
public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void saleCar() {
        System.out.println("Здравствуй клиент, цена этого авто");
        try {
            car.getPrice();
            System.out.println("Хочешь купить авто?");
        } catch (Exception e) {
            System.out.println("Неизвестна мне");
            System.out.println("Давайте посмотрим другое авто?");
        }
    }
}

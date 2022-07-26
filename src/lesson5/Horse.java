package lesson5;

public class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Ржет");
    }
    @Override
    public void run() {
        System.out.println("Лошадь бежит галопом");
    }
}

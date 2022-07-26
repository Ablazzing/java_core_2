package lesson6;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }

    public void makeSound() {
        System.out.println("Кот шипит");
    }
}

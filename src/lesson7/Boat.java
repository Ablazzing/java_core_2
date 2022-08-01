package lesson7;

import java.util.Arrays;

public abstract class Boat implements Swimmable, Soundable {
    private String name;

    @Override
    public void makeSound() {
        System.out.println("Лодка гудит");
    }

    @Override
    public void swim() {
        System.out.println("Лодка плывет");

    }
}

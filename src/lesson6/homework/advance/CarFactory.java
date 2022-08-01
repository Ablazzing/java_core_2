package lesson6.homework.advance;

import lesson6.homework.base.Lada;
import lesson6.homework.base.Toyota;

public class CarFactory {

    public static Lada createLada() {
        return new Lada();
    }

    public static Toyota createToyota() {
        return new Toyota();
    }

}

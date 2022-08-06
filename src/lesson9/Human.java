package lesson9;

import java.util.Objects;

public class Human extends Object implements Cloneable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    //Сравнение двух объектов
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if ( !(hashCode() == obj.hashCode())) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Human anotherHuman = (Human) obj;
            return this.name.equals(anotherHuman.name);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Это человек";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ура я делаю действие при удалении");
    }

    public String getName() {
        return name;
    }
}

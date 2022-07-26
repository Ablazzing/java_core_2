package lesson5;

//У абстрактного класса невозможно создать экземпляр
public abstract class Animal {
    //Переменная final должна быть инициализирована сразу при создании объекта (Через конструктор)
    public final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println("Животное дышит");
    }

    public void run() {
        System.out.println(this.name + " бежит");
    };
}

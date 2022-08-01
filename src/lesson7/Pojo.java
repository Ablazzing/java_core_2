package lesson7;

//Pojo класс - класс с конструктором без параметров, и геттерами и сеттерами на все параметры
public class Pojo {
    private int count;
    private String name;

    public Pojo() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

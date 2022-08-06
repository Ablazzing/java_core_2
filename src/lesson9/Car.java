package lesson9;

public class Car {
    private Engine engine;
    private int countWheels = 4;

    public Car(int maxPower, int maxSpeed) {
        this.engine = new Engine(maxPower, maxSpeed);
    }

    //non-static класс - не может существовать отдельно от экземпляра класса родителя
    public class Transmission {

        public void getInfo() {
            System.out.println(countWheels);
            System.out.println(engine);
        }
    }

    //static класс - может существовать отдельно от экземпляра класса родителя
    public static class Engine {
        private int maxPower;
        private int maxSpeed;

        public Engine(int maxPower, int maxSpeed) {
            this.maxPower = maxPower;
            this.maxSpeed = maxSpeed;
        }

        public int rating() {
            return maxSpeed / maxPower;
        }
    }
}

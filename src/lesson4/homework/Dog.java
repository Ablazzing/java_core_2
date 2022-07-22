package lesson4.homework;

public class Dog {
    private int countLegs;
    private boolean isAngry;

    public Dog(int countLegs, boolean isAngry) {
        this.countLegs = countLegs;
        this.isAngry = isAngry;
    }

    public int getCountLegs() {
        return countLegs;
    }

    public void setCountLegs(int countLegs) {
        this.countLegs = countLegs;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}

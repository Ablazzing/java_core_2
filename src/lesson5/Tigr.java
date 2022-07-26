package lesson5;

public class Tigr extends Animal {
    private int countClaws;
   public Tigr(String name, final int countClaws) {
       super(name);
       this.countClaws = countClaws;
   }
    public final void hunt() {
        System.out.println("Тигр с именем " + this.name + " охотится");
    }

    @Override
    public void run() {
        System.out.println("Тигр крадется");
    }

}

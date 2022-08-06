package lesson8.homework.advance.task1;

//Ель
public class Spruce extends Tree implements Smellable {

    public Spruce(boolean hasCone) {
        super(hasCone);
    }

    @Override
    public void smell() {
        System.out.println("Ель умеет пахнуть");
    }
}

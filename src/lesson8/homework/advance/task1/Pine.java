package lesson8.homework.advance.task1;

public class Pine extends Tree implements Smellable {

    public Pine(boolean hasCone) {
        super(hasCone);
    }
    @Override
    public void smell() {
        System.out.println("Сосна умеет пахнуть");
    }
}

package lesson8.homework.advance.task2;

public class Watch {
    private boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void tick() throws WatchBrokenError {
        if (isBroken) {
            throw new WatchBrokenError();
        }
        System.out.println("Часы тикают");
    }
}

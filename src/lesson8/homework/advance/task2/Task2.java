package lesson8.homework.advance.task2;

//Задача №2
//2. Создать следующую структуру из классов и интерфейсов
// магазин (обладает работниками)
// работник (обладает часами - (часы одни))
// часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
// Бренд (обладает массивом магазинов)
// Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
// у каждого работника по часам. У одного работника часы сломаны, у второго нет.
// После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
// обработать ошибку сломанных часов.
// Ожидание вывода на экран:
// Часы тикают
// Ошибка: Часы сломались.
public class Task2 {

    public static void main(String[] args) {
        Watch watch = new Watch(false);
        Watch brokenWatch = new Watch(true);

        Worker worker = new Worker(watch);
        Worker workerWithBrokenWatch = new Worker(brokenWatch);

        Worker[] workersShop1 = {worker};
        Worker[] workersShop2 = {workerWithBrokenWatch};

        Shop shop1 = new Shop(workersShop1);
        Shop shop2 = new Shop(workersShop2);

        Shop[] shops = {shop1, shop2};
        Brand brand = new Brand(shops);

        for (Shop shop : brand.getShops()) {
            for (Worker shopWorker : shop.getWorkers()) {
                Watch workerWatch = shopWorker.getWatch();
                try {
                    workerWatch.tick();
                } catch (WatchBrokenError e) {
                    System.out.println("Ошибка: часы сломались");
                }
            }
        }
    }
}

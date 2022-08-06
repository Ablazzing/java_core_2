package lesson8.homework.advance.task1;


//Задача №1
//1. Создать следующую структуру из классов и интерфейсов:
// дерево -> ель (имеет шишки, умеет пахнуть)
// дерево -> сосна (имеет шишки, умеет пахнуть)
// растение -> роза (умеет цвести, умеет пахнуть)
// растение -> папоротник (умеет цвести)
// Создать у каждого класса по объекту, распределить по массивам интерфейсов
// И у каждого массива вызвать характерный метод
//Ожидание:
// сосна : умеет пахнуть
// ель : умееть пахнуть
// роза: умееть пахнуть
// роза: умеет цвести
// папоротник: умеет цвести
public class Task1 {

    public static void main(String[] args) {
        Pine pine = new Pine(true);
        Spruce spruce = new Spruce(true);
        Rose rose = new Rose();
        Fern fern = new Fern();

        Smellable[] smellables = {pine, spruce, rose};
        Bloomable[] bloomables = {rose, fern};

        for (Smellable smellable : smellables) {
            smellable.smell();
        }

        for (Bloomable bloomable : bloomables) {
            bloomable.bloom();
        }
    }
}

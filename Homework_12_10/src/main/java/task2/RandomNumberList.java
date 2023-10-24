package task2;
// Напишите метод, который создаёт список с произвольным количеством элементов.
// Список должен быть заполнен случайными числами в диапазоне от -100 до 100 включительно.
// Напишите второй метод, который принимает список чисел и
// удаляет из него все отрицательные числа. В main вызовите оба метода.
import java.util.ArrayList;
import java.util.Random;

public class RandomNumberList {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = createRandomList(10);
        System.out.println("Сгенерированный список чисел:");
        System.out.println(numberList);

        removeNegativeNumbers(numberList);
        System.out.println("Список чисел после удаления отрицательных:");
        System.out.println(numberList);
    }

    public static ArrayList<Integer> createRandomList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = rand.nextInt(201) - 100; // Генерация числа от -100 до 100
            list.add(randomNumber);
        }

        return list;
    }

    public static void removeNegativeNumbers(ArrayList<Integer> list) {
        list.removeIf(n -> n < 0); // Удаление всех отрицательных чисел из списка
    }
}

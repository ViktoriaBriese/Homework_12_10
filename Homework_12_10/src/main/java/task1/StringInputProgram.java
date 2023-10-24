package task1;

import java.util.ArrayList;
import java.util.Scanner;

// Создайте программу, которая принимает от пользователя неограниченное количество строк.
// Ввод строк должен закончится, когда пользователь введёт слово quit.
// Выведите в консоль все строки, которые ввёл пользователь.
// Реализуйте два метода – один находит самую длинную строку в списке,
// второй – самую короткую строку. Выведите самую длинную и самую короткую из строк в консоль.
public class StringInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputStrings = new ArrayList<>();

        System.out.println("Введите строки (для завершения введите 'quit'):");

        while (true) {
            String input = scanner.nextLine(); // Считывание строки с клавиатуры
            if (input.equals("quit")) {
                break; // Выход из цикла, если введено "quit"
            }
            inputStrings.add(input); // Добавление строки в список
        }

        if (inputStrings.isEmpty()) {
            System.out.println("Вы не ввели ни одной строки.");
        } else {
            System.out.println("Ваши введенные строки:");
            for (String str : inputStrings) {
                System.out.println(str);
            }

            String longestString = findLongestString(inputStrings);
            String shortestString = findShortestString(inputStrings);

            System.out.println("Самая длинная строка: " + longestString);
            System.out.println("Самая короткая строка: " + shortestString);
        }
    }
    public static String findLongestString(ArrayList<String> strings) {
        String longest = "";
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    public static String findShortestString(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return "";
        }

        String shortest = strings.get(0);
        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
}




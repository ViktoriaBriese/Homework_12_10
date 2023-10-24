package task3;
// Создайте класс Group, который хранит фамилии всех студентов в учебной группе.
// В классе напишите метод, который по заданным первым буквам фамилии находит всех студентов
// и возвращает результат в виде списка. Вызовите метод в main.
import java.util.ArrayList;
import java.util.List;
public class Group {
    private List<String> studentNames;

    public Group() {
        studentNames = new ArrayList<>();
    }

    public void addStudent(String name) {
        studentNames.add(name);
    }

    public List<String> findStudentsByFirstLetter(String firstLetter) {
        List<String> result = new ArrayList<>();
        for (String name : studentNames) {
            if (name.startsWith(firstLetter)) {
                result.add(name);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Group group = new Group();
        group.addStudent("Иванов");
        group.addStudent("Петров");
        group.addStudent("Сидоров");
        group.addStudent("Смирнов");
        group.addStudent("Алексеев");

        String searchLetter = "С"; // Искать студентов, фамилии которых начинаются с буквы "С"
        List<String> foundStudents = group.findStudentsByFirstLetter(searchLetter);

        System.out.println("Студенты, фамилии которых начинаются с буквы " + searchLetter + ":");
        for (String student : foundStudents) {
            System.out.println(student);
        }
    }
}

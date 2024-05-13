import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    private static final int MINAGE = 18;
    private static final int MAXAGE = 25;
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<String> womenNames = List.of("Kate", "Ann" , "Jane", "Mary", "Alise");
        List<String> manNames = List.of("Sam", "Tim", "Bob", "John", "Mike");

        //Необходимо заполнить коллекцию несколькими студентами.
        for (int i = 1; i <= 10; i++) {
            Sex studentSex = Sex.values()[new Random().nextInt(Sex.values().length)];
            StringBuilder studentName = new StringBuilder();
            if (studentSex == Sex.Women) {
                studentName.append(womenNames.get(new Random().nextInt(4)));
            } else {
                studentName.append(manNames.get(new Random().nextInt(4)));
            }

            students.add(new Student(
                    studentName.toString(),
                    studentSex,
                    new Random().nextInt(MINAGE, MAXAGE),
                    Classes.setAttendedClasses()
            ));
        }
        System.out.println(students);

        //вывести всех юношей
        List<Student> onlyMan = new ArrayList<>();
        for (Student student: students) {
            if (student.getSex() == Sex.Man) {
                onlyMan.add(student);
            }
        }
        System.out.println("Man among students: " + onlyMan);

        //найти всех студентов старше 20 лет
        List<Student> elderThanTwenty = new ArrayList<>();
        for (Student student: students) {
            if (student.getAge() > 20) {
                elderThanTwenty.add(student);
            }
        }
        System.out.println("Students elder than 20: " + elderThanTwenty);

        //найти всех студентов, которые посещают менее 2 занятий
        List<Student> attendsLessTwoClasses = new ArrayList<>();
        int count = 0;
        for (Student student: students) {
            if (student.getSubjects().size() < 2) {
                attendsLessTwoClasses.add(student);
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("No students attending less than two classes");
        } else {
            System.out.println("Student attends less than two classes: " + attendsLessTwoClasses);
        }

        //найти всех студентов, которые посещают занятие - программирование
        List<Student> attendsProgramming = new ArrayList<>();
        for (Student student: students) {
            if (student.getSubjects().contains(Classes.Programming)) {
                attendsProgramming.add(student);
            }
        }
        System.out.println("Attends Programming classes" + attendsProgramming);
    }
}

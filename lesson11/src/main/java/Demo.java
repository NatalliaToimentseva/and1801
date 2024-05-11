import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            students.add(new Student(
                    "Student" + i,
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    new Random().nextInt(18, 25),
                    new ArrayList<>()
            ));
        }
        for (Student student: students) {
            int numberOfSubjects = new Random().nextInt(0, 5);
            for (int i = 0; i <= numberOfSubjects; i++) {
                student.addSubject(Classes.values()[new Random().nextInt(Classes.values().length)]);
            }
        }
        System.out.println(students);

        for (Student student: students) {
            if (student.getSex() == Sex.Man) {
                System.out.println(student.getName() + " is man");
            }
        }
        System.out.println();

        for (Student student: students) {
            if (student.getAge() > 20) {
                System.out.println(student.getName() + " age more than 20");
            }
        }
        System.out.println();

        int count = 0;
        for (Student student: students) {
            if (student.getSubjects().size() < 2) {
                System.out.println(student.getName()  + " attends less than two classes");
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("No students attending less than two classes");
        }
        System.out.println();

        for (Student student: students) {
            if (student.getSubjects().contains(Classes.Programming)) {
                System.out.println(student.getName() + " attends Programming classes");
            }
        }
    }
}

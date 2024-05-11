import java.util.List;

public class Student {
    private final String name;
    private final Sex sex;
    private int age;
    private final List<Classes> subjects;
    public Student(String name, Sex sex, int age, List<Classes> subjects) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.subjects = subjects;
    }
    public String getName() {
        return name;
    }
    public Sex getSex() {
        return sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Classes> getSubjects() {
        return subjects;
    }
    public void addSubject(Classes subject) {
        this.subjects.add(subject);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }
}

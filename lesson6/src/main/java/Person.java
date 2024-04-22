import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private int age;
    private int salary;
    private Cat pet;
    public Person(String name, int age, int salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.pet = cat;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public Cat getPet() {
        return pet;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age > 0 && age < 110) {
            this.age = age;
        }
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setPet(Cat pet) {
        this.pet = pet;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
    @Override
    public String toString() {
        return "Person name: " + name + "\n" +
                "age: " + age + "\n" +
                "salary: " + salary + "\n" +
                "pet: " + pet;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
            Person clone = (Person) super.clone();
            clone.pet = pet.clone();
            return clone;
    }
}

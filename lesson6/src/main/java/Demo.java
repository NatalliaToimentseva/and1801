public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Bob", 28, 850, new Cat("Nikki"));
        Person clone = person.clone();
        clone.setName("Alex");

        System.out.println(person);
        System.out.println(clone);
        System.out.println(person.equals(clone));
    }
}

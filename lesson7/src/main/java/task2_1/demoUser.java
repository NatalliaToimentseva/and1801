package task2_1;

public class demoUser {
    public static void main(String[] args) {
        User director = new User("Alex", Profession.DIRECTOR, 6);
        System.out.println("Director's salary is " + director.getSalary());

        User worker = new User("Sam", Profession.WORKER, 3);
        System.out.println("Worker's salary is " + worker.getSalary());

        User hr = new User("Mary", Profession.HR, 1);
        System.out.println("HR's salary is " + hr.getSalary());

        System.out.println("Director's salary with bonus 1200 - " + director.getSalaryWithBonus(1200));
    }
}

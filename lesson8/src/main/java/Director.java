import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{
    private final List<Employee> subordinateEmployees;
    public Director(String name, String surname, int experience) {
        super(name, surname, experience, Position.DIRECTOR);
        this.subordinateEmployees = new ArrayList<>();
    }
    public List<Employee> getSubordinateEmployees() {
        return subordinateEmployees;
    }
    public void setSubordinateEmployee(Employee employee) {
        subordinateEmployees.add(employee);
    }
    @Override
    public String toString() {
        return super.toString() + ", has subordinateEmployees: " + '\n' + subordinateEmployees;
    }
}

import java.util.List;
import java.util.Objects;

public class ServiceSearchSubordinateEmployee {
    public static boolean searchSubordinateEmployeeByName(String name, Director director) {
        List<Employee> subordinateEmployees = director.getSubordinateEmployees();
        boolean hasThisEmployee = false;

        for (Employee employee: subordinateEmployees) {
            if (Objects.equals(employee.getName(), name)) {
                    hasThisEmployee = true;
                    break;
            } else if (employee instanceof Director && ((Director) employee).getSubordinateEmployees() != null) {
                    hasThisEmployee = searchSubordinateEmployeeByName(name,(Director) employee);
                    if (hasThisEmployee) break;
            }
        }
        return hasThisEmployee;
    }
}

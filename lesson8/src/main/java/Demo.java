public class Demo {
    public static void main(String[] args) {
        // 1
        Director director1 = new Director("Alex", "Black", 7,Position.DIRECTOR);

        Worker worker1 = new Worker("Bob", "Green", 4, Position.WORKER);
        System.out.println(worker1); //Employee name: Bob, surname: Green, experience: 4, position: WORKER

        Worker worker2 = new Worker("Ann", "Gray", 5, Position.WORKER);
        System.out.println(worker2); //Employee name: Ann, surname: Gray, experience: 5, position: WORKER

        Worker worker3 = new Worker("Tom", "Smith", 2, Position.WORKER);
        System.out.println(worker3); //Employee name: Tom, surname: Smith, experience: 2, position: WORKER

        // 2
        director1.setSubordinateEmployee(worker1);
        director1.setSubordinateEmployee(worker3);
        System.out.println(director1);
        /*Employee name: Alex, surname: Black, experience: 7, position: DIRECTOR, has subordinateEmployees:
          [Employee name: Bob, surname: Green, experience: 4, position: WORKER, Employee name: Tom, surname: Smith, experience: 2, position: WORKER]*/

        //3
        Director director2 = new Director("Mary", "Black", 4,Position.DIRECTOR);
        director2.setSubordinateEmployee(worker2);

        director1.setSubordinateEmployee(director2);

        //4
        System.out.println(director1);
        /* Employee name: Alex, surname: Black, experience: 7, position: DIRECTOR, has subordinateEmployees:
            [Employee name: Bob, surname: Green, experience: 4, position: WORKER, Employee name: Tom, surname: Smith, experience: 2, position: WORKER, Employee name: Mary, surname: Black, experience: 4, position: DIRECTOR, has subordinateEmployees:
            [Employee name: Ann, surname: Gray, experience: 5, position: WORKER]]*/

        //5
        boolean isDirectorHasEmployee = ServiceSearchSubordinateEmployee.searchSubordinateEmployeeByName("Ann", director1);
        if (isDirectorHasEmployee){
            System.out.println("Director " + director1.getName() + " has employee in subordination");
        } else {
            System.out.println("Director " + director1.getName() + " hasn't employee in subordination");
        }       //Director Alex has employee in subordination
     }
}

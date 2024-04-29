public class Demo {
    public static void main(String[] args) {
        // 1
        Director director1 = new Director("Alex", "Black", 7);

        Worker worker1 = new Worker("Bob", "Green", 4);
        System.out.println(worker1); //Employee name: Bob, surname: Green, experience: 4, position: WORKER

        Worker worker2 = new Worker("Ann", "Gray", 5;
        System.out.println(worker2); //Employee name: Ann, surname: Gray, experience: 5, position: WORKER

        Worker worker3 = new Worker("Tom", "Smith", 2);
        System.out.println(worker3); //Employee name: Tom, surname: Smith, experience: 2, position: WORKER

        // 2
        director1.setSubordinateEmployee(worker1);
        System.out.println(director1);
        /*Employee name: Alex, surname: Black, experience: 7, position: DIRECTOR, has subordinateEmployees:
          [Employee name: Bob, surname: Green, experience: 4, position: WORKER, Employee name: Tom, surname: Smith, experience: 2, position: WORKER]*/

        //3
        Director director2 = new Director("Jane", "Black", 4);
        director1.setSubordinateEmployee(director2);
        director2.setSubordinateEmployee(worker3);
        Director director3 = new Director("Mary", "Black", 4);
        director3.setSubordinateEmployee(worker2);

        director1.setSubordinateEmployee(director3);
        Worker worker4 = new Worker("Tim", "Smith", 2);
        director1.setSubordinateEmployee(worker4);

        //4
        System.out.println(director1);
        /* Employee name: Alex, surname: Black, experience: 7, position: DIRECTOR, has subordinateEmployees:
            [Employee name: Bob, surname: Green, experience: 4, position: WORKER, Employee name: Tom, surname: Smith, experience: 2, position: WORKER, Employee name: Mary, surname: Black, experience: 4, position: DIRECTOR, has subordinateEmployees:
            [Employee name: Ann, surname: Gray, experience: 5, position: WORKER]]*/

        //5
        boolean isDirectorHasEmployee = ServiceSearchSubordinateEmployee.searchSubordinateEmployeeByName("Tom", director1);
        if (isDirectorHasEmployee){
            System.out.println("Director " + director1.getName() + " has employee in subordination");
        } else {
            System.out.println("Director " + director1.getName() + " hasn't employee in subordination");
        }       //Director Alex has employee in subordination
     }
}

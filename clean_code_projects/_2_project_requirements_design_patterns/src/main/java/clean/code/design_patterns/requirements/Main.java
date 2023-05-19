package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<>();
        Employee e1 = new Employee.Builder("Rares", 1, 3500.45f, Function.Junior)
                .setDepartment(Department.Software)
                .setManagerID(2)
                .setAddress(new Address("Calea Victoriei", 2, "Bucharest"))
                .setMethod(new PayPal())
                .build();
        employeeList.add(e1);

        Employee e2 = new Employee.Builder("Andrei", 2, 10000, Function.Senior)
                .setDepartment(Department.Software)
                .setAddress(new Address("Gheorghe Sincai", 1, "Bucharest"))
                .setSentSalary(true)
                .build();
        employeeList.add(e2);

        Employee e3 = new Employee.Builder("Marius", 3, 7500.52f, Function.Mid)
                .setDepartment(Department.Hardware)
                .setManagerID(2)
                .build();
        employeeList.add(e3);

        Employee e4 = new Employee.Builder("Alex", 4, 3500, Function.Intern)
                .setDepartment(Department.Hardware)
                .setManagerID(3)
                .setAddress(new Address("Calea Decebal", 3, "Bucharest"))
                .setMethod(new PayPal())
                .build();
        employeeList.add(e4);

        Employee e5 = new Employee.Builder("Tudor", 5, 5500.83f, Function.Junior)
                .setDepartment(Department.Hardware)
                .setManagerID(3)
                .setSentSalary(true)
                .setMethod(new BankTransfer())
                .build();
        employeeList.add(e5);

        Employee e6 = new Employee.Builder("Ovidiu", 6, 20000, Function.Director)
                .build();
        employeeList.add(e6);

        Employee e7 = new Employee.Builder("George", 7, 7000, Function.Junior)
                .setDepartment(Department.Software)
                .setManagerID(2)
                .setSentSalary(true)
                .setMethod(new Post())
                .build();
        employeeList.add(e7);

        for(Employee e : employeeList){
            System.out.println(e);
        }

        for(Employee e : employeeList){
            e.receiveSalary();
        }

    }
}

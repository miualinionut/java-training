package clean.code.design_patterns.requirements.Composite;

import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{

        Scanner buffer = new Scanner(System.in);
        String bufferName;
        int bufferID;
        double bufferSalary;

        Employee manager = new Manager(1, "Mark Jacobs", 100000);
        Employee employee1 = new Programmer(2,"Rubina Rupa", 35000);
        Employee employee2 = new Programmer(3,"Leontyne Chimala", 30000);
        Employee employee3  = new Accountant(5,"Masha",15000);

        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);

        System.out.println("Employee situation before modification: \n");
        manager.printEmployeesData();

        System.out.println("Enter new employee's data: (id, name, salary)\n");
        try {

            bufferID = Integer.parseInt(buffer.nextLine());
            bufferName = buffer.nextLine();
            bufferSalary = Double.parseDouble(buffer.nextLine());

            Employee bufferEmployee = new Programmer(bufferID, bufferName, bufferSalary);
            System.out.println("Which employee do u want to modify?\n");
            int bufferNr = Integer.parseInt(buffer.nextLine());
            switch(bufferNr) {
                case 1: {
                    manager.modify(employee1, bufferEmployee);
                    break;
                }
                case 2: {
                    manager.modify(employee2, bufferEmployee);
                    break;
                }
                case 3: {
                    manager.modify(employee3, bufferEmployee);
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + bufferNr);
            }
            System.out.println("Employee situation after modification: \n");
            manager.printEmployeesData();
        }
        catch (Exception e)
        {
            System.out.println("Number format Exception");
        }


    }
}

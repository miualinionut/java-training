package clean.code.design_patterns.requirements.Composite;

import clean.code.design_patterns.requirements.Composite.Employee;

import java.util.*;
public class Manager implements Employee {

    private int ID;
    private String name;
    private double salary;

    public Manager(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<Employee>() ;

    @Override
    public void modify(Employee employee,Employee newEmployee)
    {
        employees.set(employees.indexOf(employee), newEmployee);
    }
    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getEmployeesName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void printEmployeesData() {
        for(Employee employee : employees)
        {
            System.out.println("------------------------------");
            System.out.println("ID: " + employee.getID());
            System.out.println("Name: " +  employee.getEmployeesName());
            System.out.println("Salary: "+ employee.getSalary());
            System.out.println("------------------------------");

        }
    }
}

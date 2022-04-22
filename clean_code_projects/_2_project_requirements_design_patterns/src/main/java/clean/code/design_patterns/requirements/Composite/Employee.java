package clean.code.design_patterns.requirements.Composite;

public interface Employee {
    int getID();
    String getEmployeesName();
    double getSalary();

    void modify(Employee employee,Employee newEmployee);
    void addEmployee(Employee newEmployee);
    void removeEmployee(Employee employee);
    Employee getChild(int i);

    void printEmployeesData();
}

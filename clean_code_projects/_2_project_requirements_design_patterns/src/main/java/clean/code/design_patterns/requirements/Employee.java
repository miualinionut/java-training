package clean.code.design_patterns.requirements;

public class Employee {
    private String name;
    private int ID;
    private Department department;
    private Function function;
    private float salary;
    private int managerID;
    private Address address;
    private boolean sentSalary;
    private PaymentMethod method;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.ID = builder.ID;
        this.department = builder.department;
        this.function = builder.function;
        this.salary = builder.salary;
        this.managerID = builder.managerID;
        this.address = builder.address;
        this.sentSalary = builder.sentSalary;
        this.method = builder.method;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public Department getDepartment() {
        return department;
    }

    public Function getFunction() {
        return function;
    }

    public float getSalary() {
        return salary;
    }

    public int getManagerID() {
        return managerID;
    }

    public Address getAddress() {
        return address;
    }

    public void receiveSalary() {
        if (method == null) {
            System.out.println("The employee" + ID + " didn't choose any payment method for his salary");
        } else if (!sentSalary) {
            sentSalary = true;
            method.paySalary(this.getSalary(), this);
        } else {
            System.out.println("Employee " + this.getID() + " has already received his salary this month");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee- ");
        sb.append(" Name: ").append(name);
        sb.append(" ID: ").append(ID);
        if (department != null) {
            sb.append(", Department: ").append(department);
        }
        if (function != null) {
            sb.append(", Function: ").append(function);
        }
        sb.append(", Salary: ").append(salary);

        return sb.toString();
    }

    public static class Builder {
        private String name;
        private int ID;
        private Department department;
        private Function function;
        private float salary;
        private int managerID;
        private Address address;
        private boolean sentSalary;
        private PaymentMethod method;

        public Builder(String name, int ID, float salary, Function function) {
            this.name = name;
            this.ID = ID;
            this.salary = salary;
            this.function = function;
        }

        public Builder setDepartment(Department department) {
            this.department = department;
            return this;
        }

        public Builder setFunction(Function function) {
            this.function = function;
            return this;
        }

        public Builder setSalary(float salary) {
            this.salary = salary;
            return this;
        }

        public Builder setManagerID(int managerID) {
            this.managerID = managerID;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setSentSalary(boolean sentSalary) {
            this.sentSalary = sentSalary;
            return this;
        }

        public Builder setMethod(PaymentMethod method) {
            this.method = method;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }


}

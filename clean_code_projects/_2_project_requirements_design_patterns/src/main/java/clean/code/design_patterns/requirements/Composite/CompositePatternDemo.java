public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("Hebristean Daniela","CEO", 30000);

        Employee headSales = new Employee("Iacob Natanael","Head Sales", 20000);

        Employee headMarketing = new Employee("Jurcsik Lado","Head Marketing", 20000);

        Employee clerk1 = new Employee("Criste Medeea","Marketing", 10000);
        Employee clerk2 = new Employee("Dascalciuc Teodor","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard Pop","Sales", 10000);
        Employee salesExecutive2 = new Employee("Roberta Bob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
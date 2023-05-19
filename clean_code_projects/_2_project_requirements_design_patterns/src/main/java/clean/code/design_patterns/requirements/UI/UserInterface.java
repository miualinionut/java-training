package clean.code.design_patterns.requirements.UI;
import clean.code.design_patterns.requirements.DoctorRepository.ICollectionIterator;
import clean.code.design_patterns.requirements.Domain.Doctor;
import clean.code.design_patterns.requirements.Service.Service;
import clean.code.design_patterns.requirements.SortingStrategy.SortByName;
import clean.code.design_patterns.requirements.SortingStrategy.SortBySalary;
import clean.code.design_patterns.requirements.SortingStrategy.SortBySpecialization;
import clean.code.design_patterns.requirements.Validate.ValidationException;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
    private final Service service;
    private final Scanner scanner;

    public UserInterface(Service service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    private void options(){

        System.out.println("1. Add doctor.");
        System.out.println("2. Delete doctor.");
        System.out.println("3. Update doctor's specialization.");
        System.out.println("4. Update doctor's salary");
        System.out.println("5. Update doctor's specialization and salary.");
        System.out.println("6. Display doctors.");
        System.out.println("7. Search for a doctor.");
        System.out.println("8. Filter doctors by specialization.");
        System.out.println("9. Sort doctors by name.");
        System.out.println("10. Sort doctors by specialization.");
        System.out.println("11. Sort doctors by salary.");
        System.out.println("x. Exit");
    }

    public void start(){
        this.service.addDoctor("John","Doe","Cardiologist",4000.0);
        this.service.addDoctor("Michael","Smith","Dermatologist",3000.0);
        this.service.addDoctor("Sarah","Johnson","Pediatrician",4000.0);
        this.service.addDoctor("Emily","Brown","Cardiologist",4500.0);
        this.service.addDoctor("Daniel","Miller","Orthopedic",5000.0);
        this.service.addDoctor("Olivia","Taylor","Neurologist",6000.0);
        this.service.addDoctor("David","Anderson","Orthopedic",10000.0);
        this.service.addDoctor("Emma","Wilson","Cardiologist",11000.0);
        this.service.addDoctor("James","Clark","Dermatologist",9500.0);
        this.service.addDoctor("Oliver","Hill","Orthopedic",3700.0);
        this.service.addDoctor("Sophia","Baker","Neurologist",4100.0);

        String option;
        options();
        while (true){

            System.out.println("Enter your choice: ");
            option = scanner.nextLine();
            switch (option){
                case "1" -> addDoctor();
                case "2" -> deleteDoctor();
                case "3" -> updateSpecialization();
                case "4" -> updateSalary();
                case "5" -> updateSpecializationSalary();
                case "6" -> displayDoctors();
                case "7" -> searchDoctor();
                case "8" -> filterBySpecialization();
                case "9" -> sortByName();
                case "10" -> sortBySpecialization();
                case "11" -> sortBySalary();
                case "x" -> {
                    return;
                }
                default -> System.out.println("Wrong option! Try again!");
            }
        }
    }

    private void sortBySalary() {
        try {
            List<Doctor> list = this.service.sortList(new SortBySalary());
            Stream<String> stream = list.stream().map((doctor) -> {return ""+doctor.getFirstName()+" "+doctor.getLastName()+" "+doctor.getSalary();});
            stream.forEach(System.out::println);
            System.out.println();
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void sortBySpecialization() {
        try {
            List<Doctor> list = this.service.sortList(new SortBySpecialization());
            Stream<String> stream = list.stream().map((doctor) -> {
                return "" + doctor.getFirstName() + " " + doctor.getLastName() + " " + doctor.getSpecialization();
            });
            stream.forEach(System.out::println);
            System.out.println();
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void sortByName() {
        try {
            List<Doctor> list = this.service.sortList(new SortByName());
            Stream<String> stream = list.stream().map((doctor) -> {
                return "" + doctor.getFirstName() + " " + doctor.getLastName();
            });
            stream.forEach(System.out::println);
            System.out.println();
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void filterBySpecialization() {
        try {
            String specialization;
            System.out.println("Specialization: ");
            specialization = scanner.nextLine();
            List<Doctor> list = this.service.filterBySpecialization(specialization);
            list.forEach(System.out::println);
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void searchDoctor() {
        try {
            String firstName, lastName;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            List<Doctor> list = this.service.filterByName(firstName, lastName);
            list.forEach(System.out::println);
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void displayDoctors() {
        ICollectionIterator iterator = this.service.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void updateSpecializationSalary() {
        try {
            String firstName, lastName, newSpecialization;
            String newSalary;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("New specialization: ");
            newSpecialization = scanner.nextLine();
            System.out.println("New salary: ");
            newSalary = scanner.nextLine();
            this.service.updateSpecializationAndSalary(firstName, lastName, newSpecialization, Double.parseDouble(newSalary));
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void updateSalary() {
        try {
            String firstName, lastName, specialization;
            String newSalary;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("Specialization: ");
            specialization = scanner.nextLine();
            System.out.println("New salary: ");
            newSalary = scanner.nextLine();
            this.service.salaryUpdate(firstName, lastName, specialization, Double.parseDouble(newSalary));
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void updateSpecialization() {
        try {
            String firstName, lastName, newSpecialization;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("New specialization: ");
            newSpecialization = scanner.nextLine();
            this.service.specializationUpdate(firstName, lastName, newSpecialization);
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void deleteDoctor() {
        try {
            String firstName, lastName;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            this.service.deleteDoctor(firstName, lastName);
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private void addDoctor() {
        try {
            String firstName, lastName, specialization;
            String salary;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("Specialization: ");
            specialization = scanner.nextLine();
            System.out.println("Salary: ");
            salary = scanner.nextLine();
            this.service.addDoctor(firstName, lastName, specialization, Double.parseDouble(salary));
        } catch (ValidationException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}


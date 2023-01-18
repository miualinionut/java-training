package clean.code.design_patterns.requirements.UI;

import clean.code.design_patterns.requirements.Domain.Angajat;
import clean.code.design_patterns.requirements.Service.Service;
import clean.code.design_patterns.requirements.Strategy.SortByFunction;
import clean.code.design_patterns.requirements.Strategy.SortByName;
import clean.code.design_patterns.requirements.Strategy.SortBySalary;
import clean.code.design_patterns.requirements.Validate.ValidationException;
import clean.code.design_patterns.requirements.Repository.CollectionIterator;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ui {
    private Service service;
    private Scanner scanner;

    public Ui(Service service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }
    
    private void options(){
        
        System.out.println("1. Adauga angajat.");
        System.out.println("2. Sterge angajat.");
        System.out.println("3. Update functie angajat.");
        System.out.println("4. Update salar angajat");
        System.out.println("5. Update functie + salar angajat.");
        System.out.println("6. Afisare angajati.");
        System.out.println("7. Cautare angajat.");
        System.out.println("8. Filtrare angajati dupa functie.");
        System.out.println("9. Sortare angajati dupa nume.");
        System.out.println("10.Sortare angajati dupa functie.");
        System.out.println("11.Sortare angajati dupa salariu.");
        System.out.println("x. Exit");
    }
    
    public void start(){
        this.service.addAngajat("Vlad","Mic","finante",4000.0);
        this.service.addAngajat("Andrei","Muresan","finante",3000.0);
        this.service.addAngajat("Maria","Anton","marketing",4000.0);
        this.service.addAngajat("Iasmina","Bostan","marketing",4500.0);
        this.service.addAngajat("Dan","Nechita","hr",5000.0);
        this.service.addAngajat("Radu","Lupusoru","hr",6000.0);
        this.service.addAngajat("Flaviu","Moghiroiu","programator",10000.0);
        this.service.addAngajat("Mihnea","Neagu","programator",11000.0);
        this.service.addAngajat("Sergiu","Neag","programator",9500.0);
        this.service.addAngajat("Alexandra","Mare","logistic",3700.0);
        this.service.addAngajat("Raluca","Enea","logistic",4100.0);

        String option;
        while (true){
            options();
            System.out.println("Introduceti optiunea: ");
            option = scanner.nextLine();
            switch (option){
                case "1" -> adaugaAngajat();
                case "2" -> stergereAngajat();
                case "3" -> updateFunctie();
                case "4" -> updateSalar();
                case "5" -> updateFunctieSalar();
                case "6" -> afisareAngajati();
                case "7" -> cautareAngajat();
                case "8" -> filtrareDupaFunctie();
                case "9" -> sortareDupaNume();
                case "10" ->sortareDupaFunctie();
                case "11" ->sortareDupaSalariu();
                case "x" -> {
                    return;
                }
                default -> System.out.println("Optiune gresita!Reincercati!");
            }
        }
    }

    private void sortareDupaSalariu() {
        try {
            List<Angajat> list = this.service.sortList(new SortBySalary());
            Stream<String> stream = list.stream().map((angajat) -> {return ""+angajat.getFirstName()+" "+angajat.getLastName()+" "+angajat.getSalary();});
            stream.forEach(System.out::println);
            System.out.println();
        }catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void sortareDupaFunctie() {
        try {
            List<Angajat> list = this.service.sortList(new SortByFunction());
            Stream<String> stream = list.stream().map((angajat) -> {return ""+angajat.getFirstName()+" "+angajat.getLastName()+" "+angajat.getFunction();});
            stream.forEach(System.out::println);
            System.out.println();
        }catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void sortareDupaNume() {
        try {
            List<Angajat> list = this.service.sortList(new SortByName());
            Stream<String> stream = list.stream().map((angajat) -> {return ""+angajat.getFirstName()+" "+angajat.getLastName();});
            stream.forEach(System.out::println);
            System.out.println();
        }catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void filtrareDupaFunctie() {
        try {
            String function;
            System.out.println("Funtion");
            function = scanner.nextLine();
            List<Angajat> list = this.service.filterByFunction(function);
            list.forEach(System.out::println);
        }catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void cautareAngajat() {
        try {
            String firstName, lastName;
            Double newSalary;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            List<Angajat> list = this.service.filterByName(firstName,lastName);
            list.forEach(System.out::println);
        } catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void afisareAngajati() {
        CollectionIterator iterator = this.service.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private void updateFunctieSalar() {
        try {
            String firstName, lastName,newFunction;
            String newSalary;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("New function: ");
            newFunction = scanner.nextLine();
            System.out.println("New salary: ");
            newSalary = scanner.nextLine();
            this.service.functionAndSalaryUpdate(firstName,lastName,newFunction,Double.parseDouble(newSalary));
        } catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void updateSalar() {
        try {
            String firstName, lastName,function;
            String newSalary;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("Function: ");
            function = scanner.nextLine();
            System.out.println("New salary:: ");
            newSalary = scanner.nextLine();
            this.service.salaryUpdate(firstName,lastName,function,Double.parseDouble(newSalary));
        } catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void updateFunctie() {
        try {
            String firstName, lastName, newFunction;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("New function: ");
            newFunction = scanner.nextLine();
            this.service.functionUpdate(firstName,lastName,newFunction);
        } catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void stergereAngajat() {
        try {
            String firstName, lastName;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            this.service.deleteAngajat(firstName,lastName);
        } catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void adaugaAngajat() {
        try {
            String firstName, lastName, function;
            String salary;
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("Function: ");
            function = scanner.nextLine();
            System.out.println("Salary: ");
            salary = scanner.nextLine();

            this.service.addAngajat(firstName,lastName,function,Double.parseDouble(salary));
        }
        catch (ValidationException | IllegalArgumentException e){
            System.out.println(e);
        }
    }
}

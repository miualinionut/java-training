package clean.code.design_patterns.requirements.Service;

import clean.code.design_patterns.requirements.Validate.AngajatValidator;
import clean.code.design_patterns.requirements.Domain.Angajat;
import clean.code.design_patterns.requirements.Repository.Repository;
import clean.code.design_patterns.requirements.Strategy.SortingStrategy;
import clean.code.design_patterns.requirements.Repository.CollectionIterator;

import java.util.List;
import java.util.Objects;

public class Service {
    private Repository repo;
    private AngajatValidator validator;

    public Service(Repository repo, AngajatValidator validator) {
        this.repo = repo;
        this.validator = validator;
    }

    public void addAngajat(String firstName, String lastName, String function, double salary){
        Angajat angajat = new Angajat(firstName,lastName,function,salary);
        validator.validate(angajat);
        repo.add(angajat);
    }

    public void deleteAngajat(String firstName, String lastName){
        CollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()){
            Angajat a = iterator.next();
            if(a.getFirstName().equals(firstName) && a.getLastName().equals(lastName)){
                repo.remove(a);
            }
        }
    }

    public void salaryUpdate(String firstName, String lastName, String function, double newSalary){
        Angajat angajat = new Angajat(firstName,lastName,function,newSalary);
        validator.validate(angajat);
        CollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()){
            Angajat a = iterator.currentPosition();
            if(a.getFirstName().equals(firstName) && a.getLastName().equals(lastName) && Objects.equals(a.getFunction(), function)){
                iterator.currentPosition().setSalary(newSalary);
            }
            iterator.next();
        }
    }

    public void functionUpdate(String firstName, String lastName, String newFunction){
        CollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()){
            Angajat a = iterator.currentPosition();
            if(a.getFirstName().equals(firstName) && a.getLastName().equals(lastName)){
                Angajat angajat = new Angajat(firstName,lastName,newFunction,iterator.currentPosition().getSalary());
                validator.validate(angajat);
                iterator.currentPosition().setFunction(newFunction);
            }
            iterator.next();
        }
    }

    public void functionAndSalaryUpdate(String firstName, String lastName, String newFunction, double newSalary){
        CollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()){
            Angajat a = iterator.currentPosition();
            if(a.getFirstName().equals(firstName) && a.getLastName().equals(lastName)){
                Angajat angajat = new Angajat(firstName,lastName,newFunction,newSalary);
                validator.validate(angajat);
                iterator.currentPosition().setFunction(newFunction);
                iterator.currentPosition().setSalary(newSalary);
            }
            iterator.next();
        }
    }
    public List<Angajat> filterByFunction(String function){
        return repo.getAll()
                .stream()
                .filter((angajat) -> {return angajat.getFunction().equals(function);})
                .toList();
    }

    public List<Angajat> filterByName(String firstName, String lastName){
        return repo.getAll().stream().filter((angajat) -> {return angajat.getFirstName().equals(firstName) && angajat.getLastName().equals(lastName);}).toList();
    }
    public List<Angajat> sortList(SortingStrategy strategy){
        return strategy.sort(repo.getAll());
    }

    public CollectionIterator getIterator(){
        return this.repo.iterator();
    }
}

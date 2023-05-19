package clean.code.design_patterns.requirements.Service;
import clean.code.design_patterns.requirements.DoctorRepository.DoctorRepository;
import clean.code.design_patterns.requirements.DoctorRepository.ICollectionIterator;
import clean.code.design_patterns.requirements.Domain.Doctor;
import clean.code.design_patterns.requirements.SortingStrategy.ISortingStrategy;
import clean.code.design_patterns.requirements.Validate.Validator;

import java.util.List;
import java.util.Objects;


public class Service {
    private DoctorRepository repo;
    private Validator validator;

    public Service(DoctorRepository repo, Validator validator) {
        this.repo = repo;
        this.validator = validator;
    }

    public void addDoctor(String firstName, String lastName, String specialization, double salary) {
        Doctor doctor = new Doctor(firstName, lastName, specialization, salary);
        validator.validate(doctor);
        repo.add(doctor);
    }

    public void deleteDoctor(String firstName, String lastName) {
        ICollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()) {
            Doctor doctor = iterator.next();
            if (doctor.getFirstName().equals(firstName) && doctor.getLastName().equals(lastName)) {
                repo.remove(doctor);
                break; // Exit the loop after removing the doctor
            }
        }
    }

    public void salaryUpdate(String firstName, String lastName, String specialization, double newSalary) {
        Doctor doctor = new Doctor(firstName, lastName, specialization, newSalary);
        validator.validate(doctor);
        ICollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()) {
            Doctor currentDoctor = iterator.currentPosition();
            if (currentDoctor.getFirstName().equals(firstName) && currentDoctor.getLastName().equals(lastName) && Objects.equals(currentDoctor.getSpecialization(), specialization)) {
                currentDoctor.setSalary(newSalary);
            }
            iterator.next();
        }
    }

    public void specializationUpdate(String firstName, String lastName, String newSpecialization) {
        ICollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()) {
            Doctor doctor = iterator.currentPosition();
            if (doctor.getFirstName().equals(firstName) && doctor.getLastName().equals(lastName)) {
                Doctor updatedDoctor = new Doctor(firstName, lastName, newSpecialization, doctor.getSalary());
                validator.validate(updatedDoctor);
                doctor.setSpecialization(newSpecialization);
            }
            iterator.next();
        }
    }

    public void updateSpecializationAndSalary(String firstName, String lastName, String newSpecialization, double newSalary) {
        ICollectionIterator iterator = repo.iterator();
        while (iterator.hasNext()) {
            Doctor doctor = iterator.currentPosition();
            if (doctor.getFirstName().equals(firstName) && doctor.getLastName().equals(lastName)) {
                Doctor updatedDoctor = new Doctor(firstName, lastName, newSpecialization, newSalary);
                validator.validate(updatedDoctor);
                doctor.setSpecialization(newSpecialization);
                doctor.setSalary(newSalary);
            }
            iterator.next();
        }
    }

    public List<Doctor> filterBySpecialization(String specialization) {
        return repo.getAll()
                .stream()
                .filter(doctor -> doctor.getSpecialization().equals(specialization))
                .toList();
    }

    public List<Doctor> filterByName(String firstName, String lastName) {
        return repo.getAll()
                .stream()
                .filter(doctor -> doctor.getFirstName().equals(firstName) && doctor.getLastName().equals(lastName))
                .toList();
    }

    public List<Doctor> sortList(ISortingStrategy strategy) {
        return strategy.sort(repo.getAll());
    }

    public ICollectionIterator getIterator() {
        return repo.iterator();
    }
}
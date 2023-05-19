package clean.code.design_patterns.requirements.DoctorRepository;
import clean.code.design_patterns.requirements.Domain.Doctor;

public interface ICollection {
    void add(Doctor doctor);
    void remove(Doctor doctor);
    ICollectionIterator iterator();
}

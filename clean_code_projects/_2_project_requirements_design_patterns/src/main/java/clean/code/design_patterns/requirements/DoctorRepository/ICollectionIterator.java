package clean.code.design_patterns.requirements.DoctorRepository;


import clean.code.design_patterns.requirements.Domain.Doctor;

public interface ICollectionIterator {
    boolean hasNext();
    Doctor next();
    Doctor currentPosition();
}

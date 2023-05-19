package clean.code.design_patterns.requirements.DoctorRepository;

import clean.code.design_patterns.requirements.Domain.Doctor;

import java.util.List;
import java.util.NoSuchElementException;

public class CollectionIterator implements ICollectionIterator {
    private List<Doctor> list;
    private int position;

    public CollectionIterator(List<Doctor> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Doctor next() {
        if (hasNext()) {
            Doctor nextDoctor = list.get(position);
            position++;
            return nextDoctor;
        }
        throw new NoSuchElementException("No more elements in the collection.");
    }

    @Override
    public Doctor currentPosition() {
        if (position >= 0 && position < list.size()) {
            return list.get(position);
        }
        throw new IllegalStateException("Iterator is not pointing to a valid position.");
    }
}

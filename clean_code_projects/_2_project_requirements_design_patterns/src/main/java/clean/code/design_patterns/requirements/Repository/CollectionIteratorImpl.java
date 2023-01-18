package clean.code.design_patterns.requirements.Repository;

import clean.code.design_patterns.requirements.Domain.Angajat;

import java.util.List;

public class CollectionIteratorImpl implements CollectionIterator {
    private List<Angajat> list;
    private int position;

    public CollectionIteratorImpl(List<Angajat> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return (position < list.size());
    }

    @Override
    public Angajat next() {
        return list.get(position++);
    }

    @Override
    public Angajat currentPosition() {
        return list.get(position);
    }
}

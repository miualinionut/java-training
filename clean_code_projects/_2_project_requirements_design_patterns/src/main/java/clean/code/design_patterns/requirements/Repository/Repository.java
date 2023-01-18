package clean.code.design_patterns.requirements.Repository;

import clean.code.design_patterns.requirements.Domain.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Repository implements Collection {
    private List<Angajat> repo;

    public Repository() {
        this.repo = new ArrayList<>();
    }

    @Override
    public void add(Angajat e) {
        this.repo.add(e);
    }

    @Override
    public void remove(Angajat e) {
        this.repo.remove(e);
    }

    @Override
    public CollectionIterator iterator() {
        return new CollectionIteratorImpl(this.repo);

    }
    public List<Angajat> getAll(){
        return this.repo;
    }
}

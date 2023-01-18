package clean.code.design_patterns.requirements.Repository;

import clean.code.design_patterns.requirements.Repository.CollectionIterator;
import clean.code.design_patterns.requirements.Domain.Angajat;

public interface Collection {
    void add(Angajat e);
    void remove(Angajat e);
    CollectionIterator iterator();
}

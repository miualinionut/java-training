package clean.code.design_patterns.requirements.Repository;

import clean.code.design_patterns.requirements.Domain.Angajat;

public interface CollectionIterator {
    public boolean hasNext();
    public Angajat next();
    public Angajat currentPosition();
}

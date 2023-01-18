package clean.code.design_patterns.requirements.Strategy;

import clean.code.design_patterns.requirements.Domain.Angajat;

import java.util.List;

public interface SortingStrategy {
    List<Angajat> sort(List<Angajat> list);
}

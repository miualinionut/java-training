package clean.code.design_patterns.requirements.Strategy;

import clean.code.design_patterns.requirements.Domain.Angajat;
import clean.code.design_patterns.requirements.Strategy.SortingStrategy;

import java.util.Comparator;
import java.util.List;

public class SortBySalary implements SortingStrategy {
    @Override
    public List<Angajat> sort(List<Angajat> list) {
        return list.stream().sorted(Comparator.comparing(Angajat::getSalary).reversed()).toList();
    }
}

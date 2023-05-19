package clean.code.design_patterns.requirements.SortingStrategy;
import clean.code.design_patterns.requirements.Domain.Doctor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByName implements ISortingStrategy {
    @Override
    public List<Doctor> sort(List<Doctor> list) {
        return list.stream()
                .sorted(Comparator.comparing(Doctor::getFirstName).thenComparing(Doctor::getLastName))
                .collect(Collectors.toList());
    }
}
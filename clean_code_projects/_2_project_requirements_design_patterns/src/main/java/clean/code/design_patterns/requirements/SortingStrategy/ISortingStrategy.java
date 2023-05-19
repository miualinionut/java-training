package clean.code.design_patterns.requirements.SortingStrategy;

import clean.code.design_patterns.requirements.Domain.Doctor;

import java.util.List;

public interface ISortingStrategy {
    List<Doctor> sort(List<Doctor> list);
}
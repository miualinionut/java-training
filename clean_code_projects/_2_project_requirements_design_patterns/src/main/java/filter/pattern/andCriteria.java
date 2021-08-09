package filter.pattern;

import java.util.List;

public class andCriteria  implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public andCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Students> meetCriteria(List<Students> students) {

        List<Students> firstCriteriaStudent = criteria.meetCriteria(students);
        return otherCriteria.meetCriteria(firstCriteriaStudent);
    }

}

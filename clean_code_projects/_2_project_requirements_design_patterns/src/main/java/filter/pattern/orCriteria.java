package filter.pattern;

import java.util.List;

public class orCriteria  implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public orCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Students> meetCriteria(List<Students> students) {
        List<Students> firstCriteriaItems = criteria.meetCriteria(students);
        List<Students> otherCriteriaItems = otherCriteria.meetCriteria(students);

        for (Students student : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(student)){
                firstCriteriaItems.add(student);
            }
        }
        return firstCriteriaItems;
    }
}

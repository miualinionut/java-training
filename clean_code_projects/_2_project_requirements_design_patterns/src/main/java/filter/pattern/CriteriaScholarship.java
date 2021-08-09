package filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaScholarship implements  Criteria{

    @Override
    public List<Students> meetCriteria (List<Students> students){
        List<Students> scholarship=new ArrayList<Students>();

        for (Students student : students){
            if (student.getScholarship().equalsIgnoreCase("with scholarship")){
                scholarship.add(student);
            }
        }
        return scholarship;
}
}

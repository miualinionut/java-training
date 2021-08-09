package filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriawithoutScholarship implements Criteria{
    @Override
    public List<Students> meetCriteria (List<Students> students){
        List<Students> scholarship=new ArrayList<Students>();

        for (Students student : students){
            if (student.getScholarship().equalsIgnoreCase("without scholarship")){
                scholarship.add(student);
            }
        }
        return scholarship;
    }
}

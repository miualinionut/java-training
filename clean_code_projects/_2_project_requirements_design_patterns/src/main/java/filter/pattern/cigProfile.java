package filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class cigProfile implements Criteria {

    @Override
    public List<Students> meetCriteria (List<Students> students){
        List<Students> cigStudent=new ArrayList<Students>();

        for (Students student : students){
            if (student.getProfile().equalsIgnoreCase("CIG")){
                cigStudent.add(student);
            }
        }
        return cigStudent;
    }
}

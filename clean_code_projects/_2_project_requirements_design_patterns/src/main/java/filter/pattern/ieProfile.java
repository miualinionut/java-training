package filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class ieProfile implements  Criteria{


    @Override
    public List<Students> meetCriteria (List<Students> students){
       List<Students> ieStudent=new ArrayList<Students>();

        for (Students student : students){
            if (student.getProfile().equalsIgnoreCase("IE")){
                ieStudent.add(student);
            }
        }
        return ieStudent;
    }
}

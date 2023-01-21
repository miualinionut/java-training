package clean.code.design_patterns.requirements;

public class UserFactory {
    public static User getUser(String type,String firstName,String lastName){
        if("Student".equals(type)){
            return new Student(firstName,lastName);
        }
        else if("Parent".equals(type)){
            return new Parent(firstName,lastName);
        }
        else if("Teacher".equals(type)){
            return new Teacher(firstName,lastName);
        }
        return null;
    }
}

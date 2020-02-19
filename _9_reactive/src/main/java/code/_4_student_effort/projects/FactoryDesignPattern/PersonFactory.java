package code._4_student_effort.projects.FactoryDesignPattern;

public class PersonFactory {
    public static Person getPerson(String personType){
        if(personType == null){
            return null;
        }
        if(personType.equalsIgnoreCase("Adult")){
            return new Adult();

        } else if(personType.equalsIgnoreCase("Children")){
            return new Children();

        } else if(personType.equalsIgnoreCase("Teenager")){
            return new Teenager();
        }
        else
        {
            System.out.println("Person type unknown!");
            return null;
        }
    }
}

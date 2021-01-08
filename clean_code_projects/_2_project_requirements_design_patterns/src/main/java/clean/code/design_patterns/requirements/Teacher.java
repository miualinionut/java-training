package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements IUser {

    private String FirstName;
    private String LastName;
    private String UserName;
    List<Classroom> TeachClassrooms;
    private Integer Age;

    private Teacher(Builder builder){
        TeachClassrooms = new ArrayList<>();
        this.UserName = builder.UserName;
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.Age = builder.Age;
    }

    @Override
    public void enrollTo(Classroom classroom) {
        TeachClassrooms.add(classroom);
    }

    @Override
    public void displayUserData() {
        System.out.println("Teacher: ");
        System.out.println(" •User Name: " + UserName);
        System.out.println(" •First Name: " + FirstName);
        System.out.println(" •Last Name: " + LastName);
        System.out.println(" •Age: " + LastName);
        System.out.print(" •Classrooms assigned: ");
        for(Classroom classroom: TeachClassrooms){
            System.out.print(classroom.getClassSubject() + " @ " + classroom.getClassID());
        }
        System.out.println();
    }

    public static class Builder{
        private String FirstName;
        private String LastName;
        List<String> TeachSubjects;
        private final String UserName;
        private Integer Age;

        public Builder(String UserName) {
            this.UserName = UserName;
            TeachSubjects = new ArrayList<>();
        }

        public Builder setFirstName(String FirstName){
            this.FirstName =  FirstName;
            return this;
        }

        public Builder setLastName(String LastName){
            this.LastName =  LastName;
            return this;
        }

        public Builder setAge(Integer Age){
            this.Age = Age;
            return this;
        }

        public Builder addTeachSubject(String Subject){
            TeachSubjects.add(Subject);
            return this;
        }

        public Teacher build(){
            return new Teacher(this);
        }
    }
}

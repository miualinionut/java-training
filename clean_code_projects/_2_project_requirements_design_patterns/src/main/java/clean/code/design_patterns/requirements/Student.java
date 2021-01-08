package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class Student implements IUser {
    private String FirstName;
    private String LastName;
    private String UserName;
    private Integer Age;
    private String Notification;
    List<Classroom> ClassroomsJoined;

    //Create a Pair - Class <-> Grades
    //Add guest option??

    private Student(Builder builder){
        this.UserName = builder.UserName;
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.Age = builder.Age;
        ClassroomsJoined = new ArrayList<>();
    }

    @Override
    public void enrollTo(Classroom classroom) {
        ClassroomsJoined.add(classroom);
    }

    @Override
    public void displayUserData() {
        System.out.println("Student: ");
        System.out.println(" •User Name: " + UserName);
        System.out.println(" •First Name: " + FirstName);
        System.out.println(" •Last Name: " + LastName);
        System.out.println(" •Age: " + Age);
        System.out.print(" •Classrooms assigned: ");
        for(Classroom classroom: ClassroomsJoined){
            System.out.print(classroom.getClassSubject() + " @ " + classroom.getClassID());
        }
        System.out.println();
    }

    public void update(String message){
        Notification = message;
        System.out.println(UserName + " was notified about " + message);
    }

    public static class Builder{
        private String FirstName;
        private String LastName;
        private final String UserName;
        private Integer Age;

        public Builder(String UserName) {
            this.UserName = UserName;
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

        public Student build(){
            return new Student(this);
        }
    }

}

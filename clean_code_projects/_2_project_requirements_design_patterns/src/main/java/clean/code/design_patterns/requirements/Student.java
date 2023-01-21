package clean.code.design_patterns.requirements;

public class Student extends User{
    private Parent mother;
    private Parent father;

    public Student(String firstName, String lastName) {

        super(firstName, lastName);
    }

    public void setMother(Parent mother){
        this.mother=mother;
    }
    public void setFather(Parent father){
        this.father=father;
    }

    public Parent getFather() {
        return father;
    }

    public Parent getMother() {
        return mother;
    }

    public boolean equals(User o) {
        return super.equals(o);
    }
}

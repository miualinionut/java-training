package clean.code.design_patterns.requirements;

public class Parent extends User implements Observer{
    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public boolean equals(User o) {
        return super.equals(o);
    }
    public void update(Notification notification){
        System.out.println("(Parintele: "+getFirstName()+" "+getLastName()+") "+notification);
    }
}
//"("+getFirstName()+" "+getLastName()+")"+
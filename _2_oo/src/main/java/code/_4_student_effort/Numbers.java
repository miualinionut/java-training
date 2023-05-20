package code._4_student_effort;

public enum Numbers {
    Number1("Hello 1"),Number2("Hello 2");

    String name;
    Numbers(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

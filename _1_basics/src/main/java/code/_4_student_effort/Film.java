package code._4_student_effort;

public class Film {
    Integer release;
    String name;
    Actor[] actors;
    public Film(String name, Integer release){
        this.release = release;
        this.name = name;
    }
    public Film(String name, Integer release, Actor[] actors){
        this.release = release;
        this.name = name;
        this.actors = actors;
    }
}

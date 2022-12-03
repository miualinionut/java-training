package code._4_student_effort.challenge_2;

public class Movie {
    private int relaseYear;
    private String movieName;
    private Actor[] actors;

    Movie(int relaseYear, String name, Actor[] actors) {
        this.relaseYear = relaseYear;
        this.movieName = name;
        this.actors = actors;
    }

    public String getMovieName() {
        return movieName;
    }

    public Actor[] getActors() {
        return actors;
    }
}

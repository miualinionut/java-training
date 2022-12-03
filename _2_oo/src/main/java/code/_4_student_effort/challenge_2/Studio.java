package code._4_student_effort.challenge_2;

public class Studio {
    private String studioName;
    private Movie[] movies;

    Studio(String studioName, Movie[] movies) {
        this.studioName = studioName;
        this.movies = movies;
    }

    public String getStudioName() {
        return studioName;
    }

    public Movie[] getMovies() {
        return movies;
    }
}

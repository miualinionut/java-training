package code._4_student_effort.challenge_2;

public class Main {
    public static Studio[] getSample() {    //Creare vector de studiouri
        Prize oscar1999 = new Prize("oscar", 1999);
        Prize oscar2000 = new Prize("oscar", 2000);
        Prize oscar2001 = new Prize("oscar", 2001);
        Prize oscar2002 = new Prize("oscar", 2002);

        Actor actor1 = new Actor("actor cu un oscar", 34, new Prize[]{oscar2000});
        Actor actor2 = new Actor("actor cu 2 oscaruri", 65, new Prize[]{oscar2000, oscar2002});
        Actor actor3 = new Actor("actor fara premii", 19, new Prize[]{});
        Actor actor4 = new Actor("actor cu 3 oscaruri", 73, new Prize[]{oscar1999, oscar2000, oscar2001});
        Actor actor5 = new Actor("actor cu un oscar", 26, new Prize[]{oscar2001});

        Movie movie1 = new Movie(2007, "film cu actori cu un oscar", new Actor[]{actor1, actor5});
        Movie movie2 = new Movie(2008, "film cu actori fara premii", new Actor[]{actor3});
        Movie movie3 = new Movie(2010, "film cu actori cu 2 si 3 oscaruri", new Actor[]{actor2, actor4});
        Movie movie4 = new Movie(2009, "film cu actori si cu premii si fara premi", new Actor[]{actor2, actor3});

        Studio studio1 = new Studio("Disney", new Movie[]{movie1, movie3, movie2});
        Studio studio2 = new Studio("Pixar", new Movie[]{movie2, movie4});
        Studio[] studios = new Studio[]{studio1, studio2};

        return studios;
    }

    public static void task1(Studio[] studios) {    //Stage 3 requirement 1
        System.out.println("The studios who published more than 2 movies are:");

        for(Studio studio:studios) {
            if(studio.getMovies().length > 2)
                System.out.print(studio.getStudioName() + " ");
        }

        System.out.println();
    }

    public static void task2(Studio[] studios) {    //Stage 3 requirement 2
        System.out.println("The studios in which plays the actor with the name actor cu 2 oscaruri are:");

        for(Studio studio:studios) {
            for(Movie movie:studio.getMovies()) {
                for(Actor actor: movie.getActors()){
                    if(actor.getActorName().equals("actor cu 2 oscaruri"))
                        System.out.print(studio.getStudioName() + " ");
                }
            }
        }
        System.out.println();
    }

    public static void task3(Studio[] studios) {    //Stage 3 requirement 3
        System.out.println("The movies in which plays at least an actor with the age above 50 are:");

        for(Studio studio:studios) {
            for(Movie movie:studio.getMovies()) {
                for(Actor actor:movie.getActors()) {
                    if(actor.getActorAge() > 50)
                        System.out.print(movie.getMovieName() + ", ");
                }
            }
        }

        System.out.println();
    }


    public static void main(String[] args) {
        Studio[] studios = getSample();

        task1(studios);
        task2(studios);
        task3(studios);
    }
}

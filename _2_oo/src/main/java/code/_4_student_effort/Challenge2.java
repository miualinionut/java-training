package code._4_student_effort;

public class Challenge2 {
    public static String[] getStudioNamesMovies(Studio[] v_database){
        String[] v_names;
        int n=0, index=0;
        for(int i=0; i<v_database.length; i++){
            if(v_database[i].filme.length>2){
                n++;
            }
        }
        v_names = new String[n];
        for(int i=0; i<v_database.length; i++){
            if(v_database[i].filme.length>2){
                v_names[index] = v_database[i].nume;
                index++;
            }
        }
        return v_names;
    }
    public static String[] getStudioNameActors(Studio[] v_databases){
        String[] v_names;
        int n=0, index=0;
        for(int i=0; i< v_databases.length; i++){
            for(int j=0; j<v_databases[i].filme.length; j++){
                for(int k=0; k<v_databases[i].filme[j].actori.length; k++){
                    if(v_databases[i].filme[j].actori[k].nume == "actor cu 2 oscaruri"){
                        n++;
                    }
                }
            }
        }
        v_names = new String[n];
        for(int i=0; i< v_databases.length; i++){
            for(int j=0; j<v_databases[i].filme.length; j++){
                for(int k=0; k<v_databases[i].filme[j].actori.length; k++){
                    if(v_databases[i].filme[j].actori[k].nume == "actor cu 2 oscaruri"){
                        v_names[index] = v_databases[i].nume;
                        index++;
                    }
                }
            }
        }
        return v_names;
    }
    public static String[] getMovieName(Film[] filme){
        String v_name[];
        int n=0, index=0;
        outer: for(int i=0; i< filme.length; i++){
             for(int j=0; j<filme[i].actori.length; j++){
                 if(filme[i].actori[j].varsta>50){
                     n++;
                     continue outer;
                 }
            }
        }
        v_name = new String[n];
        outer: for(int i=0; i< filme.length; i++){
            for(int j=0; j<filme[i].actori.length; j++){
                if(filme[i].actori[j].varsta>50){
                    v_name[index] = filme[i].nume;
                    index++;
                    continue outer;
                }
            }
        }
        return v_name;
    }
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar bun", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio studio3 = new Studio("Warner Bros.", new Film[]{film2, film3, film4});

        Studio[] studioDatabase = new Studio[]{studio1, studio2, studio3};
        String[] studioNamesMovies, studioNameActors, movieNames;
        studioNamesMovies = getStudioNamesMovies(studioDatabase);
        System.out.println("Numele studio-urilor cu mai mult de 2 filme sunt: ");
        for(int i=0; i< studioNamesMovies.length; i++){
            System.out.println("        " + studioNamesMovies[i]);
        }
        studioNameActors = getStudioNameActors(studioDatabase);
        System.out.println("Numele studio-urilor in care joaca actorul 'actor cu 2 oscaruri' sunt: ");
        for(int i=0; i< studioNameActors.length; i++){
            System.out.println("        " + studioNameActors[i]);
        }
        Film filme[] = new Film[]{film1, film2, film3, film4, film5};
        movieNames = getMovieName(filme);
        System.out.println("Numele filmelor cu actori peste 50 de ani sunt: ");
        for(int i=0; i<movieNames.length; i++){
            System.out.println("        " + movieNames[i]);
        }
    }
}

package code._4_student_effort.MovieDatabase;

public class Main {
    public static void main(String[] args) {

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]
                {oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new
                Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new
                Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new
                Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new
                Premiu[]{});
        Actor faraPremii03 = new Actor("actor fara oscar 02", 20 , new
                Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new
                Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new
                Actor[]{actorFaraPremii01, actorFaraPremii02});
        Film film3 = new Film(2018, "film cu actor de oscar", new
                Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});

        Studio studio1 = new Studio("MGM", new Film[]{film1});
        Studio studio2 = new Studio("Disney", new Film[]{film2, film3});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        // studio with 2 movies
        for(int i = 0; i< studioDatabase.length; i++){
            if(studioDatabase[i].getFilme().length >= 2){
                System.out.println(studioDatabase[i].getNume());
            }
        }


        //studio with movies that "actor cu 2 oscaruri" played
        for(int i = 0;i<studioDatabase.length; i++){
            for(int j = 0; j<studioDatabase[i].getFilme().length; j++){
                for(int k = 0; k<studioDatabase[i].getFilme()[j].getActori().length; k++){
                    if(studioDatabase[i].getFilme()[j].getActori()[k].getNume().equals("actor cu 2 oscaruri")){
                        System.out.println(studioDatabase[i].getNume());
                    }
                }
            }
        }

        // movie names in withc plays at least an actor with age above 50
        for(int i = 0;i<studioDatabase.length; i++){
            for(int j = 0; j<studioDatabase[i].getFilme().length; j++){
                for(int k = 0; k<studioDatabase[i].getFilme()[j].getActori().length; k++){
                    if(studioDatabase[i].getFilme()[j].getActori()[k].getVarsta() > 50){
                        System.out.println(studioDatabase[i].getFilme()[j].getNume());
                    }
                }
            }
        }


    }
}

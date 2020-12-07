package code._4_student_effort;

public class Studio{
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public void getName(){
        if (this.filme.length > 2){
            System.out.println(this.nume + " published more than 2 movies.");
        }
    }

    public void getStudioName(){
        for (int i = 0; i < this.filme.length; i++){
            for (int j = 0; j < this.filme[i].getActori().length; j++){
                if (this.filme[i].getActori()[j].getNume() == "actor cu 2 oscaruri"){
                    System.out.println(this.nume + " is the studio in which the actor plays.");
                }
            }
        }
    }

    public void getMovieName(){
        for (int i = 0; i < this.filme.length; i++){
            this.filme[i].movieName();
        }
    }



}

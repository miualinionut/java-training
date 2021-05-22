public class Film {
    private
       Integer anAparitie;
       String nume;
       Actor [] actori;


   public Film (Integer anAaparitie, String nume, Actor[] actor)
   {
       this.anAparitie = anAparitie;
       this.nume = nume;
       this.actori = actor;
   }

   public Integer getAnAparitie()
   {
       return anAparitie;
   }
   public String getNume()
   {
       return nume;
   }
   public Actor[] getActori()
   {
       return actori;
   }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
}

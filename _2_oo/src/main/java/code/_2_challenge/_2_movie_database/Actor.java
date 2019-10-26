package code._2_challenge._2_movie_database;

public class Actor {
  public String nume;
  public Integer varsta;
  public Premiu[] premii;

  public Actor(String nume, Integer varsta, Premiu[] premii) {
    this.nume = nume;
    this.varsta = varsta;
    this.premii = premii;
  }
}

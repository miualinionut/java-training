public class Main {
    
    public static void main(String args [])
    {
        Fighter f1 = new Fighter("Spiderman",100,35);
        Fighter f2 = new Fighter("Ironman",100,55);
        BoxingMatch m1 = new BoxingMatch(f1,f2);
        m1.fight(f1,f2);
    }
}

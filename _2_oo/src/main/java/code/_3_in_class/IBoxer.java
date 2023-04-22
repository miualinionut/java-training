package code._3_in_class;

public interface IBoxer {

    public void attack(IBoxer opponent);
    public int defend();
    public boolean isAlive();
    public void receiveAttack(int damage);
}

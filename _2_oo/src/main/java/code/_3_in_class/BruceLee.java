package code._3_in_class;

public class BruceLee extends Boxer {

    public BruceLee(String name, int health, int damagePerAttack){
        super(name,health,damagePerAttack);
    }

    public  BruceLee(String name){
        super(name);
    }

    void attack(Boxer opponent) {
        opponent.health = 0;
        System.out.println(this.name + " il ataca pe " + opponent.name +  '\n' +
                this.name + " health = " + this.health + " " + opponent.name + " health = " + opponent.health );
    }
}

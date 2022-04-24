package code._4_student_effort;


public class BoxingMatch {
    public Fighter firstFighter;
    public Fighter secondFighter;

    public BoxingMatch(Fighter firstFighter, Fighter secondFighter){
        this.firstFighter = firstFighter;
        this.secondFighter =secondFighter;
    }

    public String fight(){
        while(firstFighter.health > 0 && secondFighter.health > 0){
            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }
        if(firstFighter.health > secondFighter.health)
            return firstFighter.name;
        else if(firstFighter.health < secondFighter.health)
            return secondFighter.name;
        else return "It's a draw";
    }

    public static void main(String[] args) {
        Fighter firstFighter = new Fighter("Gabriel Helmis", 10, 1);
        Fighter secondFighter = new Fighter("Gabriel Dirleci", 1000, 69);
        BoxingMatch meciulDeBox = new BoxingMatch(firstFighter, secondFighter);
        System.out.print(meciulDeBox.fight());
        System.out.print(" l-a batut pe ");
        if(firstFighter.health > secondFighter.health)
            System.out.println(secondFighter.name);
        else
            System.out.println(firstFighter.name);

    }
}

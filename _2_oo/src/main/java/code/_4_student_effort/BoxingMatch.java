package code._4_student_effort;

public class BoxingMatch {
    Fighter playerOne;
    Fighter playerTwo;
    BoxingMatch(Fighter playerOne, Fighter playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    String fight() {
        while (playerOne.health > 0 && playerTwo.health > 0) {
            playerOne.attack(playerTwo);
            playerTwo.attack(playerOne);
        }
        if (playerOne.health == 0) {
            return playerTwo.name;
        } else {
            return playerOne.name;
        }
    }
}

package clean.code.chess.requirements;

public interface Movement {

    int checkMovement();
    boolean isValidNewX(int xPosition) ;
    boolean isValidNewY(int yPositon) ;
}

package clean.code.chess.requirements;

public class IllegalPawnMoveException extends IllegalArgumentException {
    public IllegalPawnMoveException(String message) {
        super(message);
    }
}

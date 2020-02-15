package clean.code.chess.requirements;

interface CheckPosition {

    boolean isInside(int position, int limit);
    boolean isValid(int xPosition, int yPosition);
    boolean isPieceRowValid(int xPosition,PieceColor color);
    boolean isFree(int xPosition, int yPosition);
    boolean isThere(int xPosition, int yPosition);
}

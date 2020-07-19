package clean.code.chess.requirements;

import clean.code.chess.requirements.PieceColor;

public class Pawn extends Piece {

    private PawnValidator pawnValidator;

    public Pawn(PieceColor color) {
        super(color);
        this.pawnValidator = new PawnValidator();
    }

    @Override
    public boolean isValidNewPosition(int newX, int newY) {
        return pawnValidator.isValidNewX(newX) && pawnValidator.isValidNewY(newY);
    }

    private class PawnValidator {

        private int getMovingDirection() {
            if (getColor() == PieceColor.BLACK) {
                return -1;
            }
            return +1;
        }

        public boolean isValidNewX(int newX) {
            return newX == getXCoordinate() + getMovingDirection() * 0 ||
                    newX == getXCoordinate() + getMovingDirection() * 1;
        }

        public boolean isValidNewY(int newY) {
            return newY == getYCoordinate() - 1 ||
                    newY == getYCoordinate() ||
                    newY == getYCoordinate() + 1;
        }
    }
}

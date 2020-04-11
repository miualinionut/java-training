package clean.code.chess.solution.pieces;

import clean.code.chess.solution.pieces.attributes.Color;

public class Pawn extends Piece {

    private PawnValidator pawnValidator;

    public Pawn(Color color) {
        super(color);
        this.pawnValidator = new PawnValidator();
    }

    @Override
    public boolean isValidNewPosition(int newX, int newY) {
        return pawnValidator.isValidNewX(newX) && pawnValidator.isValidNewY(newY);
    }

    private class PawnValidator {

        private int getMovingDirection() {
            if (getColor() == Color.BLACK) {
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

package clean.code.chess.requirements.pieces;

import clean.code.chess.requirements.pieces.attributes.Color;

import static java.awt.Color.getColor;

public class Pawn extends ChessPiece {

    private PawnValidator pawnValidator;

    public Pawn(Color color) {
        super(color);
        this.pawnValidator = new PawnValidator();
    }

    @Override
    public boolean isValidNewPosition(int newX, int newY) {
        return pawnValidator.isValidNewX(newX) && pawnValidator.isValidNewY(newY);
    }

    public void Move(Object move, int i, int i1) {
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

    public int getYCoordinate() {
        return 0;
    }

    public int getXCoordinate() {
        return 0;
    }

    public Color getColor() {
        return null;
    }
}
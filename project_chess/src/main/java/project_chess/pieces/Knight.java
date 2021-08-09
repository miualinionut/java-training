package project_chess.pieces;

import project_chess.Board;

public class Knight extends Piece {
    public Knight(Board board, int color, int xLoc, int yLoc) {
        super(board, color, xLoc, yLoc);
    }

    public boolean canMoveTo(int xPosition, int yPosition) {
        if(canMoveGenerics(xPosition,yPosition)) {
            return knightMovement(xPosition, yPosition);
        }
        return false;
    }

    private boolean knightMovement(int xPosition, int yPosition) {
        int xNewPositionAbsolute = Math.abs(this.getXLocation() - xPosition);
        int yNewPositionAbsolute = Math.abs(this.getYLocation() - yPosition);

        return xNewPositionAbsolute * yNewPositionAbsolute == 2;
    }
}

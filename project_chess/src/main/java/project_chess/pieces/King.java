package project_chess.pieces;

import project_chess.Board;

public class King extends Piece {
    public King(Board board, int color, int xLoc, int yLoc) {
        super(board, color, xLoc, yLoc);
    }

    public boolean canMoveTo(int xPosition, int yPosition) {
        if(canMoveGenerics(xPosition,yPosition)) {
            return kingMovement(xPosition, yPosition);
        }
        return false;
    }

    private boolean kingMovement(int xPosition, int yPosition) {
        int xNewPositionAbsolute = Math.abs(this.getXLocation() - xPosition);
        int yNewPositionAbsolute = Math.abs(this.getYLocation() - yPosition);

        if (xNewPositionAbsolute <= 1 && yNewPositionAbsolute <= 1) {
            return xNewPositionAbsolute != 0 || yNewPositionAbsolute != 0;
        }
        return false;
    }
}

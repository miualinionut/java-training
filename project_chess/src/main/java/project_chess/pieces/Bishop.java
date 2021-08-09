package project_chess.pieces;

import project_chess.Board;

public class Bishop extends Piece {
    public Bishop(Board board, int color, int xLoc, int yLoc) {
        super(board, color, xLoc, yLoc);
    }

    public boolean canMoveTo(int xPosition, int yPosition) {
        if(canMoveGenerics(xPosition,yPosition)) {
            return bishopMovement(xPosition, yPosition);
        }
        return false;
    }

    private boolean bishopMovement(int xPosition, int yPosition) {
        return isMovingDiagonal(xPosition, yPosition);
    }
}

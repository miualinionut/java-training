package project_chess.pieces;

import project_chess.Board;

public class Queen extends Piece {
    public Queen(Board board, int color, int xLoc, int yLoc) {
        super(board, color, xLoc, yLoc);
    }

    public boolean canMoveTo(int xPosition, int yPosition) {
        if(canMoveGenerics(xPosition,yPosition)) {
            return queenMovement(xPosition, yPosition);
        }
        return false;
    }

    private boolean queenMovement(int xPosition, int yPosition) {
        return isMovingStraight(xPosition, yPosition) || isMovingDiagonal(xPosition, yPosition);
    }
}

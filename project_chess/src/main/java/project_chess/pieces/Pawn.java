package project_chess.pieces;

import project_chess.Board;

import static project_chess.Game.BLACK;

public class Pawn extends Piece {
    public Pawn(Board board, int color, int xLoc, int yLoc) {
        super(board, color, xLoc, yLoc);
    }

    public boolean canMoveTo(int xPosition, int yPosition) {
        if(canMoveGenerics(xPosition,yPosition)) {
            return pawnMovement(xPosition, yPosition);
        }
        return false;
    }

    private boolean pawnMovement(int xPosition, int yPosition) {
        int one_step;
        int two_step;
        Piece target = chessBoard.pieceAt(xPosition, yPosition);

        if (this.getColor() == BLACK) {
            one_step = 1;
            two_step = 2;
        }
        else {
            one_step = -1;
            two_step = -2;
        }

        // Moving one step forward
        if (xPosition - this.getXLocation() == one_step) {
            // Straight
            if (yPosition == this.getYLocation() && target == null) {
                return true;
            }
            // Diagonally
            if (Math.abs(this.getYLocation() - yPosition) == 1 && target != null) {
                return true;
            }
        }
        // Two spaces
        else if (!hasMoved) {
            if (xPosition - this.getXLocation() == two_step) {
                if (yPosition == this.getYLocation() && target == null) {
                    return true;
                }
            }
        }
        return false;
    }
}

package project_chess.pieces;

import project_chess.Board;

public class Piece {
    private int xLocation;
    private int yLocation;
    private final int color;
    protected boolean hasMoved;
    protected Board chessBoard;

    public Piece(Board board, int color, int xLoc, int yLoc) {
        this.chessBoard = board;
        this.color = color;
        this.hasMoved = false;
        this.xLocation = xLoc;
        this.yLocation = yLoc;

        chessBoard.placePiece(this, xLoc, yLoc);
    }

    public boolean canMoveTo(int xPosition, int yPosition) {
        return canMoveGenerics(xPosition, yPosition);
    }

    protected boolean canMoveGenerics(int xPosition, int yPosition) {
        if (chessBoard.isInBounds(xPosition, yPosition)) {
            Piece location = chessBoard.pieceAt(xPosition, yPosition);

            if (location == null) {
                return true;
            }
            return location.getColor() != this.color;
        }
        return false;
    }

    public void moveTo(int xPosition, int yPosition) {
        if (chessBoard.pieceAt(xLocation, yLocation) == this) {
            chessBoard.removeFromBoard(this);
        }
        this.xLocation = xPosition;
        this.yLocation = yPosition;

        Piece target = chessBoard.pieceAt(xPosition, yPosition);
        if (target != null) {
            this.capturePiece(target);
        }

        chessBoard.placePiece(this, xPosition, yPosition);
        hasMoved = true;
    }

    public void removePiece() {
        chessBoard.removeFromBoard(this);
        xLocation = -1;
        yLocation = -1;
    }

    public void capturePiece(Piece capturedPiece) {
        capturedPiece.removePiece();
    }

    public int getXLocation() {
        return xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public int getColor() {
        return color;
    }

    protected boolean isMovingStraight(int xPosition, int yPosition) {
        int currX = this.getXLocation();
        int currY = this.getYLocation();

        int smallerVal;
        int largerVal;

        // Fixed X Position
        if (currX == xPosition) {
            if (currY > yPosition) {
                smallerVal = yPosition;
                largerVal = currY;
            }
            else if (yPosition > currY) {
                smallerVal = currY;
                largerVal = yPosition;
            }
            else return false;

            // Loop to determine if any piece is between target location and this piece.
            smallerVal++;
            for(; smallerVal < largerVal; smallerVal++) {
                if (chessBoard.pieceAt(currX, smallerVal) != null) {
                    return false;
                }
            }
            return true;
        }

        // Fixed Y Position
        if (currY == yPosition) {
            if (currX > xPosition) {
                smallerVal = xPosition;
                largerVal = currX;
            }
            else {
                smallerVal = currX;
                largerVal = xPosition;
            }

            // Loop to determine if any piece is between target location and this piece.
            smallerVal++;
            for(; smallerVal < largerVal; smallerVal++) {
                if (chessBoard.pieceAt(smallerVal, currY) != null) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    protected boolean isMovingDiagonal(int xPosition, int yPosition) {
        int xStart;
        int yStart;
        int xFinish;

        //Check if movement is diagonal
        int xTotal = Math.abs(xPosition - this.getXLocation());
        int yTotal = Math.abs(yPosition - this.getYLocation());

        if (xTotal == yTotal) {
            if (xPosition < this.getXLocation()) {
                xStart = xPosition;
                xFinish = this.getXLocation();
            }
            else if (xPosition > this.getXLocation()) {
                xStart = this.getXLocation();
                xFinish = xPosition;
            }
            else
                return false;

            if (yPosition < this.getYLocation()) {
                yStart = yPosition;
            }
            else if (yPosition > this.getYLocation()) {
                yStart = this.getYLocation();
            }
            else
                return false;

            xStart++;
            yStart++;

            // Loop to see if any piece is in between
            for(;xStart < xFinish; xStart++, yStart++) {
                if (chessBoard.pieceAt(xStart, yStart) != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

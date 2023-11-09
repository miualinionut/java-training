package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    private boolean isValidForwardMove(int newX, int newY) {
        int direction = (pieceColor == PieceColor.WHITE) ? 1 : -1;
        if (newX == xCoordinate + direction && newY == yCoordinate) {
            return chessBoard.isLegalBoardPosition(newX, newY) && chessBoard.getPiece(newX, newY) == null;
        }
        return false;
    }


    public void move(MovementType movementType, int newX, int newY) {
        if (movementType == MovementType.FORWARD) {
            if (isValidForwardMove(newX, newY)) {
                chessBoard.getPiece(xCoordinate, yCoordinate).setXCoordinate(newX);
                chessBoard.getPiece(xCoordinate, yCoordinate).setYCoordinate(newY);
                chessBoard.add(chessBoard.getPiece(xCoordinate, yCoordinate), newX, newY, pieceColor);
                chessBoard.add(null, xCoordinate, yCoordinate, null);
            }
        } else if (movementType == MovementType.CAPTURE) {
            if (isValidCaptureMove(newX, newY)) {
                chessBoard.add(null, newX, newY, null);
                chessBoard.getPiece(xCoordinate, yCoordinate).setXCoordinate(newX);
                chessBoard.getPiece(xCoordinate, yCoordinate).setYCoordinate(newY);
                chessBoard.add(chessBoard.getPiece(xCoordinate, yCoordinate), newX, newY, pieceColor);
                chessBoard.add(null, xCoordinate, yCoordinate, null);
            }
        }
    }

    private boolean isValidCaptureMove(int newX, int newY) {
        int direction = (pieceColor == PieceColor.WHITE) ? 1 : -1;
        if (newX == xCoordinate + direction && Math.abs(newY - yCoordinate) == 1) {
            return chessBoard.isLegalBoardPosition(newX, newY) && chessBoard.getPiece(newX, newY) != null &&
                    chessBoard.getPiece(newX, newY).getPieceColor() != pieceColor;
        }
        return false;
    }


    @Override
    public String toString() {
        return currentPositionAsString();
    }

    protected String currentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: %d%sCurrent Y: %d%sPiece Color: %s", xCoordinate, eol, yCoordinate, eol, pieceColor);
    }
}

package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    public void setPieceColor(PieceColor value) {
        this.pieceColor = value;
    }

    // Requests a Move command
    public void Move(MovementType movementType, int newX, int newY) {
        // throw new UnsupportedOperationException("Need to implement Pawn.Move()");
        if (movementType.equals(MovementType.MOVE)) {
            if (IsMoveValid(newX, newY)) {
                this.setXCoordinate(newX);
                this.setYCoordinate(newY);
            }
        }
    }

    // Verify if move is valid
    public boolean IsMoveValid(int newX, int newY) {
        if (newX != this.xCoordinate) {
            return false;
        }

        if (pieceColor.equals(PieceColor.WHITE)) {
            return newY == yCoordinate + 1;
        }
        else {
            return newY == yCoordinate - 1;
        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}

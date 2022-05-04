package main.java.clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
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

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public boolean isNewPositionValid(int xCoordinate, int yCoordinate) {
        return (xCoordinate >= 0 && yCoordinate >= 0 && xCoordinate < ChessBoard.MAX_BOARD_WIDTH &&
                yCoordinate < ChessBoard.MAX_BOARD_HEIGHT);
    }

    public void move(MovementType movementType, int newX, int newY) {
        if (movementType.equals(MovementType.MOVE) && isNewPositionValid(newX, newY)) {
            if (this.pieceColor.equals(PieceColor.WHITE)) {
                if (newY == yCoordinate + 1 && newY <= ChessBoard.MAX_BOARD_HEIGHT &&
                    newX == xCoordinate) {
                    this.setXCoordinate(newX);
                    this.setYCoordinate(newY);
                }
            } else {
                if (newY == yCoordinate - 1 && newY >= 0 && newX == xCoordinate) {
                    this.setXCoordinate(newX);
                    this.setYCoordinate(newY);
                }
            }
        }
    }

    @Override
    public String toString() {
        return currentPositionAsString();
    }

    protected String currentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}

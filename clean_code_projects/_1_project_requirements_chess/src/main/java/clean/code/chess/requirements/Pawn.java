package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
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

    public void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        if (movementType == MovementType.MOVE) {
            if (xCoordinate != newX) return;
            if (!chessBoard.IsLegalBoardPosition(newX, newY)) return;

            if (pieceColor.equals(PieceColor.WHITE)) {
                if (newY - yCoordinate == 1)
                    yCoordinate = newY;
                else if (newY - yCoordinate == 2 && yCoordinate == 1)
                    yCoordinate = newY;
            } else {
                if (newY - yCoordinate == -1)
                    yCoordinate = newY;
                else if (newY - yCoordinate == -2 && yCoordinate == 5)
                    yCoordinate = newY;
            }
        } else {
            if (chessBoard.IsNotEmptyPosition(newX, newY)) {
                if (pieceColor == PieceColor.WHITE) {
                    if ((newX == xCoordinate + 1 || newX == xCoordinate - 1) && newY == yCoordinate + 1) {
                        xCoordinate = newX;
                        yCoordinate = newY;
                    }
                } else {
                    if ((newX == xCoordinate + 1 || newX == xCoordinate - 1) && newY == yCoordinate - 1) {
                        xCoordinate = newX;
                        yCoordinate = newY;
                    }
                }
            }
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

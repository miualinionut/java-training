package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColo) {
        pieceColor = pieceColo;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoar) {
        chessBoard = chessBoar;
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
        return pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
            if(movementType.equals(MovementType.MOVE))
                if(pieceColor.equals(PieceColor.BLACK)) {
                    if (newX == xCoordinate - 1 && newX >= 0 && newY == yCoordinate)
                        this.setXCoordinate(newX);
                }else if (newX == xCoordinate + 1 && newX <= 7 && newY == yCoordinate)
                            this.setXCoordinate(newX);
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

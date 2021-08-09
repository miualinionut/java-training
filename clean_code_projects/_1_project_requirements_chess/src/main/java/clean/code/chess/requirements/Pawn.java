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
        if(movementType == MovementType.MOVE) {
            if (IsMoveLegal(newX, newY)) {
                this.setXCoordinate(newX);
                this.setYCoordinate(newY);
            }
        }
    }

    public boolean IsMoveLegal(int newX, int newY) {

        int oldX = getXCoordinate();
        int oldY = getYCoordinate();
        int direction;
        if (getPieceColor() == PieceColor.BLACK){
            direction = -1;
        } else {
            direction = 1;
        }

        if((newX == oldX || newX == oldX + direction) && (newY == oldY || newY == oldY + 1 || newY == oldY - 1))
            return true;

        return false;
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

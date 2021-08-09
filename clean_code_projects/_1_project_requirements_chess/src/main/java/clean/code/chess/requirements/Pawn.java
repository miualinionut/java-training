package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;
    private Pawn pawn;

    public boolean validMove(int x, int y) {
        //negru- verific daca e culoarea neagra, dupa verific daca noul y coincide cu y-ul actual
        // si daca x-ul nou e mai mic ca x-ul vechi cu 1(decrementez un rand)
        if (getPieceColor() == PieceColor.BLACK) {
            if ((x == getXCoordinate() - 1 && y==getYCoordinate()) )
                return true;
        }
        //alb
        else if(getPieceColor() == PieceColor.WHITE){
            if ((x == getXCoordinate() + 1 && y==getYCoordinate()) )
                return true;
        }
        return false;
    }

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

    void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        //throw new UnsupportedOperationException("Need to implement Pawn.Move()");
        if(movementType==movementType.Move) {
            if(validMove(newX, newY)) {
                pawn.setXCoordinate(newX);
                pawn.setXCoordinate(newY);
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

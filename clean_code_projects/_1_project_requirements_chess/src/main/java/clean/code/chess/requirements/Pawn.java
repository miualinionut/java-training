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

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        //throw new UnsupportedOperationException("Need to implement Pawn.Move()") ;
        switch(movementType) {
            case MOVE:
                if(newY == yCoordinate - 1)
                    yCoordinate--;
                break;
            case CAPTURE:
                if(newX == xCoordinate + 1 || newX == xCoordinate - 1)
                    if(newY == yCoordinate - 1){
                        xCoordinate = newX;
                        yCoordinate = newY;
                    }
                break;
    }

    @Override
   // public String toString() {
   //     return CurrentPositionAsString();
   // }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}

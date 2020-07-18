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
        // we call the function created in the class chessboard
        this.chessBoard.makeThePawnMove(this, movementType, newX, newY);
    }

    public boolean legalNewX(int newX){
        if(Math.abs(this.getXCoordinate() - newX )== 1)
            return true;
        return false;
    }

    public boolean legalNewY(int newY){
        if(Math.abs(this.getXCoordinate() - newY )== 1)
            return true;
        return false;
    }

    //to make sure that the future position is legal for a pawn(just one row forward, left, or right)
    public boolean isLegalNewPosition(int newX, int newY){
        if(Math.abs(this.getXCoordinate() - newX) == 1 && this.getYCoordinate() == newY) return true;
        if(Math.abs(this.getYCoordinate() - newY) == 1 && this.getXCoordinate() == newX) return true;
        if(Math.abs(this.getXCoordinate() - newX) == 1 && Math.abs(this.getYCoordinate() - newY) == 1) return true;
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

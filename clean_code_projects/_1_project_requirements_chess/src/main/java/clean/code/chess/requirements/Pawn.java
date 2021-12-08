package clean.code.chess.requirements;

import java.util.Objects;

public class Pawn{

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
        if(chessBoard.IsLegalBoardPosition(newX, newY)){
            if(new_x_validator(newX) && new_y_validator(newY)){
                setXCoordinate(newX);
                setYCoordinate(newY);
                chessBoard.Update(this,newX, newY);
            }
        }
    }

    public boolean new_x_validator(int new_x){
        if(new_x > this.getXCoordinate() && this.getPieceColor() == PieceColor.BLACK)
            return false;
        if(new_x < this.getXCoordinate() && this.getPieceColor() == PieceColor.WHITE)
            return false;
        if(Math.abs(new_x - this.getXCoordinate()) > 1)
            return false;
        return true;
    }

    public boolean new_y_validator(int new_y){
        if(new_y != this.getYCoordinate())
            return false;
        return true;}

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pawn pawn = (Pawn) o;
        return xCoordinate == pawn.xCoordinate && yCoordinate == pawn.yCoordinate && Objects.equals(chessBoard, pawn.chessBoard) && pieceColor == pawn.pieceColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chessBoard, xCoordinate, yCoordinate, pieceColor);
    }
}

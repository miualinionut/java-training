package clean.code.chess.requirements;
import java.math.*;
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
        if(chessBoard.IsLegalBoardPosition(newX,newY)==false)return;
        if(movementType==MovementType.MOVE) {
            if (pieceColor == PieceColor.BLACK && chessBoard.canMove(xCoordinate,yCoordinate-1)==true) {
                if(yCoordinate-1==newY)yCoordinate--;
                chessBoard.Move(this,xCoordinate,yCoordinate);
            }
            if (pieceColor == PieceColor.WHITE && chessBoard.canMove(xCoordinate,yCoordinate+1)==true) {
                if(yCoordinate+1==newY)yCoordinate++;
                chessBoard.Move(this,xCoordinate,yCoordinate);
            }
        }
        if(movementType==MovementType.CAPTURE){
            if (pieceColor == PieceColor.BLACK) {
                if(yCoordinate-1==newY && Math.abs(newX-xCoordinate)==1){
                    if(chessBoard.canCapture(newX,newY,pieceColor)==true) {
                        yCoordinate--;
                        xCoordinate = newX;
                        chessBoard.Move(this,xCoordinate,yCoordinate);
                    }
                }
            }
            if (pieceColor == PieceColor.WHITE) {
                if(yCoordinate+1==newY && Math.abs(newX-xCoordinate)==1){
                    if(chessBoard.canCapture(newX,newY,pieceColor)==true) {
                        yCoordinate++;
                        xCoordinate = newX;
                        chessBoard.Move(this, xCoordinate, yCoordinate);
                    }
                }
            }
        }
        //throw new UnsupportedOperationException("Need to implement Pawn.Move()") ;
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

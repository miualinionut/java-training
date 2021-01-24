package clean.code.chess.requirements;

import static clean.code.chess.requirements.MovementType.CAPTURE;
import static clean.code.chess.requirements.MovementType.MOVE;

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
        switch (movementType) {
            case MOVE:
                if(newX != getXCoordinate()) {
                    //don't move piece
                    break;
                }
                if(getPieceColor() == PieceColor.BLACK && newY < getYCoordinate())
                    setYCoordinate(newY);
                else if (getPieceColor() ==PieceColor.WHITE && newY > getYCoordinate())
                    setYCoordinate(newY);
                break;

            // don't need to implement yet, see requirements
            case CAPTURE:
                break;


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
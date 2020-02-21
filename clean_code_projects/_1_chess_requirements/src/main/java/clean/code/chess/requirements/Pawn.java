package clean.code.chess.requirements;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int MIN_BOARD_HEIGHT = 0;
    public static int MIN_BOARD_WIDTH = 0;

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

        if(IsLegalMove(newX, newY)) {
            if (movementType == MovementType.MOVE){
                if ((newX == xCoordinate - 1) && newY == yCoordinate) {
                    setXCoordinate(newX);
                    setYCoordinate(newY);
                }
                else
                    if ((newX == xCoordinate - 1) && ((newY == yCoordinate + 1) || (newY == yCoordinate - 1))) {
                        setXCoordinate(newX);
                        setYCoordinate(newY);

                }
            }
        }
    }

    private boolean IsLegalMove(int newX, int newY) {

        if(newX <= MAX_BOARD_WIDTH && newX >= MIN_BOARD_WIDTH && newY <= MAX_BOARD_HEIGHT && newY >= MIN_BOARD_HEIGHT)
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

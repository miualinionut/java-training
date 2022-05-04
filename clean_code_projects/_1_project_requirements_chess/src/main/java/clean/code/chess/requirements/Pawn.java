package clean.code.chess.requirements;

import static org.junit.Assert.assertEquals;

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

//    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove() {
//        chessBoard.Add(testSubject, 6, 3, PieceColor.BLACK);
//        testSubject.Move(MovementType.MOVE, 4, 3);
//        assertEquals(6, testSubject.getXCoordinate());
//        assertEquals(3, testSubject.getYCoordinate());
//    }

    public void Move(MovementType movementType, int newX, int newY) {
        //throw new UnsupportedOperationException("Need to implement Pawn.Move()");

        if(movementType == MovementType.MOVE && chessBoard.IsLegalBoardPosition(newX, newY)) {
            if(xCoordinate == newX) {
                 if(pieceColor == PieceColor.BLACK) {
                         chessBoard.pieces[getXCoordinate()][getYCoordinate()] = null;
                         setXCoordinate(newX);
                         setYCoordinate(newY);
                 }
            }
            else if (yCoordinate == newY && (xCoordinate - newX == 1)) {
                chessBoard.pieces[getXCoordinate()][getYCoordinate()] = null;
                setXCoordinate(newX);
                setYCoordinate(newX);}
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

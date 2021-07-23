package clean.code.chess.requirements.pieces;

import clean.code.chess.requirements.ChessBoard;
import clean.code.chess.requirements.attributes.MovementType;
import clean.code.chess.requirements.attributes.PieceColor;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChessBoard() {
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
        // throw new UnsupportedOperationException("Need to implement Pawn.Move()");
        switch (movementType) {
            case MOVE:
                if (ChessBoard.IsLegalBoardPosition(newX, newY)) {
                    if (xCoordinate == newX) {
                        if (yCoordinate == newY - 1 && pieceColor == PieceColor.WHITE) {
                            yCoordinate += 1;
                        }

                        if (yCoordinate == newY + 1 && pieceColor == PieceColor.BLACK) {
                            yCoordinate -= 1;
                        }
                    }
                }
                break;

            case CAPTURE: break;
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

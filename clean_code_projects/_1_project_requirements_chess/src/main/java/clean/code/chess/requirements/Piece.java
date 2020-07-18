package clean.code.chess.requirements;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    protected ChessBoard chessBoard;
    protected int xCoordinate;
    protected int yCoordinate;
    protected PieceColor pieceColor;
    protected boolean isCaptured;
    List<Coordinates> possibleMoves;

    public Piece() {
        possibleMoves = new ArrayList<>();
        isCaptured = false;
        this.xCoordinate = -1;
        this.yCoordinate = -1;
    }

    public Piece(ChessBoard chessBoard, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        this();
        this.chessBoard = chessBoard;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.pieceColor = pieceColor;

    }

    public Piece(PieceColor pieceColor) {
        this();
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

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    protected void setPieceOnChessBoard(ChessBoard chessBoard, int xCoordinate, int yCoordinate) {
        this.chessBoard = chessBoard;
        this.setXCoordinate(xCoordinate);
        this.setYCoordinate(yCoordinate);
    }

    protected abstract void generateMoves();

    public void Move(MovementType movementType, int newX, int newY) {
        generateMoves();
        Coordinates coordinate = new Coordinates(newX, newY);
        if (movementType == MovementType.MOVE &&
                possibleMoves.contains(coordinate) &&
                chessBoard.isFree(newX, newY)) {

            setXCoordinate(newX);
            setYCoordinate(newY);
            chessBoard.updatePieceOnBoard(this, newX, newY);
//            chessBoard.updateBoard(this, newX, newY);

        } else if (movementType == MovementType.CAPTURE &&
                possibleMoves.contains(coordinate) &&
                !chessBoard.isFree(newX, newY)) {

            setXCoordinate(newX);
            setYCoordinate(newY);
            chessBoard.updateBoard(this, newX, newY);

        }
    }

    @Override
    public String toString() {
        return xCoordinate + " " + yCoordinate + " " + pieceColor.toString();
    }

    public boolean specialCondition(PieceColor color, int x, int y) {
        return true;
    }
}

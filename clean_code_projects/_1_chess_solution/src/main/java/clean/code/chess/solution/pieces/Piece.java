package clean.code.chess.solution.pieces;

import clean.code.chess.solution.ChessBoard;
import clean.code.chess.solution.pieces.attributes.Color;

import java.util.logging.Logger;

public abstract class Piece {

    private final static Logger logger = Logger.getLogger(Piece.class.getName());

    protected ChessBoard chessBoard;
    protected final Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public void setPieceOnChessBoard(ChessBoard chessBoard, int xCoordinate, int yCoordinate) {
        this.chessBoard = chessBoard;
        this.chessBoard.updatePiecePositionOnChessBoard(this, xCoordinate, yCoordinate);
        logger.finest(toString());
    }

    public void move(int newX, int newY) {
        if (this.isValidNewPosition(newX, newY)) {
            this.chessBoard.updatePiecePositionOnChessBoard(this, newX, newY);
        }
        logger.finest(toString());
    }

    public void capture(int newX, int newY) {
        throw new UnsupportedOperationException("Need to implement Piece.capture()");
    }

    public abstract boolean isValidNewPosition(int newX, int newY);

    public int getXCoordinate() {
        return this.chessBoard.getPosition(this).getX();
    }

    public int getYCoordinate() {
        return this.chessBoard.getPosition(this).getY();
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return currentPositionAsString();
    }

    protected String currentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, getXCoordinate(), getYCoordinate(), color);
    }
}

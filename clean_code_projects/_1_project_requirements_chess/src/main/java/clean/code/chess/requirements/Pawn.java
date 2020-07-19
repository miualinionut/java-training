package clean.code.chess.requirements;

public class Pawn {

    protected ChessBoard chessBoard;
    protected PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;

    }

    public void Move(MovementType movementType, int newX, int newY) {
        if (isValidNewPosition(newX, newY)) {
            chessBoard.updatePawn(this, newX, newY);
        }

    }

    public boolean isValidNewPosition(int newX, int newY) {
        if (isNewXValid(newX) && isNewYValid(newY))
            return true;
        return false;
    }

    public boolean isNewXValid(int newX) {
        if (newX == getXCoordinate())
            return true;
        return false;
    }

    public boolean isNewYValid(int newY) {
        if (pieceColor == PieceColor.WHITE && newY == getYCoordinate() + 1)
            return true;
        else if (pieceColor == PieceColor.BLACK && newY == getYCoordinate() - 1)
            return true;
        return false;

    }

    public int getXCoordinate() {
        return chessBoard.getPosition(this).getX();
    }

    public int getYCoordinate() {
        return chessBoard.getPosition(this).getY();
    }

    public void setPawnOnBoard(ChessBoard chessBoard, int xCoordinate, int yCoordinate) {
        this.chessBoard = chessBoard;
        chessBoard.updatePawn(this, xCoordinate, yCoordinate);

    }


    @Override
    public String toString() {
        return currentPositionAsString();
    }

    protected String currentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, getXCoordinate(), getYCoordinate(), pieceColor);
    }


}

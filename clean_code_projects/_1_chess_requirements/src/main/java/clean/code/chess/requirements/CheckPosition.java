package main.java.clean.code.chess.requirements;

public class CheckPosition {

    private Piece piesa;
    private ChessBoard board;

    public boolean isInside(int position, int limit){
        return 0 <= position && position <= limit ;
    }
    public  boolean isValid(int xPosition, int yPosition){
        return isInside(xPosition,ChessBoard.MAX_BOARD_WIDTH) && isInside(yPosition,ChessBoard.MAX_BOARD_HEIGHT);
    }
    public boolean isPieceRowValid(int xPosition,PieceColor color){
        if(PieceColor.BLACK == color){
            return xPosition == ChessBoard.MAX_BOARD_WIDTH - 1 || xPosition == ChessBoard.MAX_BOARD_WIDTH;
        }
        return  xPosition == 0 || xPosition == 1;
    }
    public boolean isFree(int xPosition, int yPosition){
        return board.getPiece(new Position(xPosition,yPosition)) == null;
    }
    public boolean isThere(int xPosition, int yPosition){
        return board.getPiece(new Position(xPosition,yPosition)) != null;
    }
    public int checkMovement(){
        if(PieceColor.BLACK == piesa.getPieceColor()) {
            return -1;
        }
        return 1;
    }
    public boolean isValidNewMovementX(int newX) {

        return newX == piesa.getXCoordinate() + checkMovement()*0 ||
                newX == piesa.getXCoordinate() + checkMovement() * 1;
    }

    public boolean isValidNewMovementY(int newY) {
        return newY == piesa.getYCoordinate() - 1 ||
                newY == piesa.getYCoordinate() ||
                newY == piesa.getYCoordinate() + 1;
    }
}

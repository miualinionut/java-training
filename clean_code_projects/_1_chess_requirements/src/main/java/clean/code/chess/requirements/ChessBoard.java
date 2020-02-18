package clean.code.chess.requirements;

import java.util.*;

public class ChessBoard implements CheckPosition {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Map<Piece,Position> mapOfPiece;
    private Map<Position,Piece> mapOfPosition;

    public ChessBoard() {

        this.mapOfPiece = new HashMap<>(MAX_BOARD_HEIGHT * MAX_BOARD_WIDTH);
        this.mapOfPosition = new HashMap<>(MAX_BOARD_HEIGHT * MAX_BOARD_WIDTH);
    }

    @Override
    public boolean isPieceRowValid(int xPosition,PieceColor color){
        if (color == PieceColor.WHITE) {
            return xPosition == 0 || xPosition == 1;
        }
        return xPosition == MAX_BOARD_HEIGHT - 1 || xPosition == MAX_BOARD_HEIGHT;
    }
    @Override
    public boolean isInside(int position, int limit){
        return 0 <= position && position  < limit ;
    }
    @Override
    public  boolean isValid(int xPosition, int yPosition){
        return this.isInside(xPosition, MAX_BOARD_WIDTH) && this.isInside(yPosition, MAX_BOARD_HEIGHT);
    }
    @Override
    public boolean isFree(int xPosition, int yPosition){
        return getPiece(new Position(xPosition, yPosition)) == null;
    }
    @Override
    public boolean isThere(int xPosition, int yPosition){
        return getPiece(new Position(xPosition,yPosition)) != null;
    }

    public void Add(Piece piece, int xPosition, int yPosition,PieceColor pieceColor) {
        if (isPieceRowValid(xPosition, pieceColor)) {
            piece.setPieceOnBoard(this, xPosition, yPosition);
        }
    }

    public void updatePositionOnBoard(Piece piece, int xPosition, int yPosition) {
        Position local = getValidPosition(xPosition, yPosition);
        this.mapOfPiece.put(piece, local);
        this.mapOfPosition.put(local, piece);
    }

    private Position getValidPosition(int xPosition, int yPosition) {
        if (this.IsLegalBoardPosition(xPosition, yPosition)) {
            return new Position(xPosition, yPosition);
        } else {
            return new Position(-1, -1);
        }
    }

    public void isPlaceAt(Piece piece, int xPosition, int yPosition){
        Position local = new Position(xPosition,yPosition);
        if(isThere(xPosition,yPosition)  && IsLegalBoardPosition(xPosition,yPosition)){
            removePieceAt(piece,local);
        }

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return isValid(xCoordinate, yCoordinate) && isFree(xCoordinate, yCoordinate);
    }
    public Position getPositon(Piece piece){
        return this.mapOfPiece.get(piece);
    }
    public Piece getPiece(Position position){
        return this.mapOfPosition.get(position);
    }

    public void removePieceAt(Piece piece,Position position){
        mapOfPosition.remove(position);
        mapOfPiece.remove(piece);
    }
}




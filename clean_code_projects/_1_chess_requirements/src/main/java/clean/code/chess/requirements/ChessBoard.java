package main.java.clean.code.chess.requirements;

import java.util.*;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private CheckPosition checkPosition;
    private Map<Piece,Position> mapOfPiece;
    private Map<Position,Piece> mapOfPosition;

    public ChessBoard() {
        checkPosition = new CheckPosition();
        this.mapOfPiece = new HashMap<>(MAX_BOARD_HEIGHT * MAX_BOARD_WIDTH);
        this.mapOfPosition = new HashMap<>(MAX_BOARD_HEIGHT * MAX_BOARD_WIDTH);
    }

    public void updatePositionOnBoard(Piece piece,int xPosition, int yPosition){
        Position local = getValidPosition(xPosition,yPosition);
        mapOfPiece.put(piece,local);
        mapOfPosition.put(local, piece);

    }
    public void Add(Piece piece, int xPositon, int yPositon,PieceColor pieceColor) {
        if(checkPosition.isPieceRowValid(xPositon,pieceColor)){
            piece.setPieceOnBoard(this,xPositon,yPositon);
        }
    }
    public Position getValidPosition(int xPosition, int yPosition){
        if(IsLegalBoardPosition(xPosition,yPosition)){
            return new Position(xPosition,yPosition);
        }
        return new Position(-1,-1);
    }

    public void isPlaceAt(Piece piece, int xPosition, int yPosition){
        Position local = new Position(xPosition,yPosition);
        if(checkPosition.isThere(xPosition,yPosition)  && IsLegalBoardPosition(xPosition,yPosition)){
            removePieceAt(piece,local);
        }

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return checkPosition.isValid(xCoordinate,yCoordinate) && checkPosition.isFree(xCoordinate,yCoordinate);
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

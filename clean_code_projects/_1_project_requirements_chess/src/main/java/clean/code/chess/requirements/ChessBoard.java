package clean.code.chess.requirements;

import java.util.LinkedHashMap;

public class ChessBoard {

    public static final int MAX_BOARD_WIDTH = 7;
    public static final int MAX_BOARD_HEIGHT = 7;
    private LinkedHashMap<Pawn, Position> mapPawnAndPosition = new LinkedHashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
    private LinkedHashMap<Position, Pawn> mapPositionAndPawn = new LinkedHashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);


    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (isValidPawnPlacement(xCoordinate, pieceColor)) {
            pawn.setPawnOnBoard(this, xCoordinate, yCoordinate);
        }
    }

    public void updatePawn(Pawn pawn, int xCoordinate, int yCoordinate) {
        Position newPosition = getNewPawnPosition(xCoordinate, yCoordinate);
        mapPawnAndPosition.put(pawn, newPosition);
        mapPositionAndPawn.put(newPosition, pawn);
    }

    private Position getNewPawnPosition(int xCoordinate, int yCoordinate) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            return new Position(xCoordinate, yCoordinate);
        } else {
            return new Position(-1, -1);
        }
    }

    public Position getPosition(Pawn pawn) {
        return mapPawnAndPosition.get(pawn);
    }

    public Pawn getPawn(Position position) {
        return mapPositionAndPawn.get(position);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return isValidCoordinates(xCoordinate, yCoordinate) && isFreePosition(xCoordinate, yCoordinate);
    }


    public boolean isValidPawnPlacement(int yCoordinate, PieceColor pieceColor) {
        if ((pieceColor == PieceColor.WHITE) && (yCoordinate == 0 || yCoordinate == 1))
            return true;
        else if ((pieceColor == PieceColor.BLACK) && (yCoordinate == MAX_BOARD_HEIGHT - 1 || yCoordinate == MAX_BOARD_HEIGHT))
            return true;
        else return false;
    }

    public boolean isFreePosition(int xCoordinate, int yCoordinate) {
        return getPawn(new Position(xCoordinate, yCoordinate)) == null;
    }

    public boolean isValidCoordinates(int xCoordinate, int yCoordinate) {
        return CoordinateIsInsideTheTable(xCoordinate, MAX_BOARD_WIDTH) && CoordinateIsInsideTheTable(yCoordinate, MAX_BOARD_HEIGHT);
    }

    public boolean CoordinateIsInsideTheTable(int coordinate, int limit) {
        return 0 <= coordinate && coordinate < limit;

    }


}

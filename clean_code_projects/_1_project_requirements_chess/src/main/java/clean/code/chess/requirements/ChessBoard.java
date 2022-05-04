package clean.code.chess.requirements;

import clean.code.chess.requirements.pieces.Pawn;
import clean.code.chess.requirements.pieces.attributes.Color;
import clean.code.chess.requirements.pieces.attributes.Position;
import clean.code.chess.requirements.pieces.ChessPiece;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {

    public static final int MAX_BOARD_WIDTH = 7;
    public static final int MAX_BOARD_HEIGHT = 7;

    private Map<Position, ChessPiece> mapOfPositionAndPiece;
    private final Map<ChessPiece, Position> mapOfPieceAndPosition;
    private final ChessBoardValidator chessBoardValidator;

    public ChessBoard() {
        this.mapOfPieceAndPosition = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
        this.mapOfPositionAndPiece = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
        this.chessBoardValidator = new ChessBoardValidator();
    }

    public void addPieceOnChessBoard(ChessPiece piece, int xCoordinate, int yCoordinate) {
        if (chessBoardValidator.isValidPieceRow(xCoordinate, piece.getColor())) {
            piece.setPieceOnChessBoard(this, xCoordinate, yCoordinate);
        }
    }

    public void updatePiecePositionOnChessBoard(ChessPiece piece, int xCoordinate, int yCoordinate) {
        Position newPosition = getNewPiecePosition(xCoordinate, yCoordinate);
        this.mapOfPieceAndPosition.put(piece, newPosition);
        this.mapOfPositionAndPiece.put(newPosition, piece);
    }

    private Position getNewPiecePosition(int xCoordinate, int yCoordinate) {
        if (this.isLegalBoardPosition(xCoordinate, yCoordinate)) {
            return new Position(xCoordinate, yCoordinate);
        } else {
            return new Position(-1, -1);
        }
    }

    public Position getPosition(ChessPiece piece) {
        return this.mapOfPieceAndPosition.get(piece);
    }

    public ChessPiece getPiece(Position position) {
        return this.mapOfPositionAndPiece.get(position);
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return chessBoardValidator.isValidCoordinates(xCoordinate, yCoordinate) && chessBoardValidator.isFreePosition(xCoordinate, yCoordinate);
    }

    public void getPosition(ChessPiece.chessPiece chessPiece, int newX, int newY) {
    }

    public void Add(Pawn testSubject, int i, int i1, Color black) {
    }

    public ChessPiece getPiece(ChessPiece.chessPiece chessPiece) {
        return null;
    }

    private class ChessBoardValidator {

        public boolean isFreePosition(int xCoordinate, int yCoordinate) {
            return getPiece(new Position(xCoordinate, yCoordinate)) == null;
        }

        public boolean isValidCoordinates(int xCoordinate, int yCoordinate) {
            return this.isInsideTheTable(xCoordinate, MAX_BOARD_WIDTH) && this.isInsideTheTable(yCoordinate, MAX_BOARD_HEIGHT);
        }

        public boolean isInsideTheTable(int coordinate, int tableLimit) {
            return 0 <= coordinate && coordinate < tableLimit;
        }

        public boolean isValidPieceRow(int xCoordinate, Color color) {
            if (color == Color.WHITE) {
                return xCoordinate == 0 || xCoordinate == 1;
            }
            return xCoordinate == MAX_BOARD_HEIGHT - 1 || xCoordinate == MAX_BOARD_HEIGHT;
        }

    }
}

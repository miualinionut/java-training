package clean.code.chess.requirements;

public class Queen extends Piece implements Sliding, Diagonally {

    public Queen(ChessBoard chessBoard, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        super(chessBoard, xCoordinate, yCoordinate, pieceColor);
    }

    public Queen(PieceColor pieceColor) {
        super(pieceColor);
    }

    protected void generateMoves() {
        this.possibleMoves.clear();

        if (!isCaptured) {
            return;
        }
        possibleMoves = generateMovesSliding(chessBoard, new Coordinates(xCoordinate, yCoordinate));
        possibleMoves.addAll(generateMovesDiagonally(chessBoard, new Coordinates(xCoordinate, yCoordinate)));

    }

}

package clean.code.chess.requirements;

public class Bishop extends Piece implements Diagonally {

    public Bishop(ChessBoard chessBoard, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        super(chessBoard, xCoordinate, yCoordinate, pieceColor);
    }

    public Bishop(PieceColor pieceColor) {
        super(pieceColor);
    }

    protected void generateMoves() {
        this.possibleMoves.clear();

        if (!isCaptured) {
            return;
        }
        possibleMoves = generateMovesDiagonally(chessBoard, new Coordinates(xCoordinate, yCoordinate));
    }
}

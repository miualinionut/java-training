package clean.code.chess.requirements;

public class Rook extends Piece implements Sliding {

    public Rook(ChessBoard chessBoard, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        super(chessBoard, xCoordinate, yCoordinate, pieceColor);
    }

    public Rook(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    protected void generateMoves() {
        this.possibleMoves.clear();

        if (!isCaptured) {
            return;
        }
        possibleMoves = generateMovesSliding(chessBoard, new Coordinates(xCoordinate, yCoordinate));
    }

}

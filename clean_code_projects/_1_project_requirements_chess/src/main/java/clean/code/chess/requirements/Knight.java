package clean.code.chess.requirements;

public class Knight extends Piece {
    private final int[] xPositions = {2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] yPositions = {1, 2, 2, 1, -1, -2, -2, -1};

    public Knight(ChessBoard chessBoard, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        super(chessBoard, xCoordinate, yCoordinate, pieceColor);
    }

    public Knight(PieceColor pieceColor) {
        super(pieceColor);
    }

    protected void generateMoves() {
        int xTest, yTest;
        for (int i = 0; i < xPositions.length; i++) {
            xTest = this.getXCoordinate() + xPositions[i];
            yTest = this.getYCoordinate() + yPositions[i];

            if (chessBoard.IsLegalBoardPosition(xTest, yTest)) {
                possibleMoves.add(new Coordinates(xTest, yTest));
            }
        }
    }
}

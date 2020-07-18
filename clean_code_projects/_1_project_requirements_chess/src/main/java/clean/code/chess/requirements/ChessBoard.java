package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private final Piece[][] pieces;

    public ChessBoard() {
        pieces = new Piece[MAX_BOARD_WIDTH + 1][MAX_BOARD_HEIGHT + 1];
    }

    public void Add(Piece piece, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) &&
            piece.specialCondition(piece.getPieceColor(), xCoordinate, yCoordinate)) {
            pieces[xCoordinate][yCoordinate] = piece;
            piece.setPieceOnChessBoard(this, xCoordinate, yCoordinate);
        }
    }


    public void updatePieceOnBoard(Piece piece, int newX, int newY) {
        pieces[piece.getXCoordinate()][piece.getYCoordinate()] = null;
        pieces[newX][newY] = piece;
        piece.setPieceOnChessBoard(this, newX, newY);
    }

    public void updateBoard(Piece piece, int newX, int newY) {
        pieces[newX][newY] = pieces[piece.getXCoordinate()][piece.getYCoordinate()];
        pieces[piece.getXCoordinate()][piece.getYCoordinate()] = null;
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return ((xCoordinate >= 0 && xCoordinate <= MAX_BOARD_HEIGHT) &&
                (yCoordinate >= 0 && yCoordinate <= MAX_BOARD_WIDTH) &&
                pieces[xCoordinate][yCoordinate] == null);
    }

    public boolean IsLegalBoardPosition(Coordinates coordinate) {
        int xCoordinate = coordinate.x;
        int yCoordinate = coordinate.y;
        return xCoordinate >= 0 && xCoordinate <= MAX_BOARD_WIDTH && yCoordinate >= 0 && yCoordinate <= MAX_BOARD_HEIGHT;
    }

    public boolean isFree(int x, int y) {
        return pieces[x][y] == null;
    }
}

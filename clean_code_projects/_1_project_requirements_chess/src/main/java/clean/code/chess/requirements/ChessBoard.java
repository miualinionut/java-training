package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    boolean result = true;
    public ChessBoard[][] board;
    private Pawn[][] pieces;

    public ChessBoard() {
        board = new ChessBoard[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if ((pieceColor == PieceColor.WHITE) && (xCoordinate == 6) && (yCoordinate <= 7)){

        }else if (((pieceColor == PieceColor.BLACK) && (xCoordinate == 1) && (yCoordinate <= 7))){

        }else {
            System.out.println("This is not a valid place for the pawn");
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if ((xCoordinate <= MAX_BOARD_WIDTH && xCoordinate >= 0) && (yCoordinate <= MAX_BOARD_HEIGHT && yCoordinate >= 0)){
            return result = true;
        }else
            return result = false;
    }

    public static int getMaxBoardWidth() {
        return MAX_BOARD_WIDTH;
    }

    public static void setMaxBoardWidth(int maxBoardWidth) {
        MAX_BOARD_WIDTH = maxBoardWidth;
    }

    public static int getMaxBoardHeight() {
        return MAX_BOARD_HEIGHT;
    }

    public static void setMaxBoardHeight(int maxBoardHeight) {
        MAX_BOARD_HEIGHT = maxBoardHeight;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public ChessBoard[][] getBoard() {
        return board;
    }

    public void setBoard(ChessBoard[][] board) {
        this.board = board;
    }

    public Pawn[][] getPieces() {
        return pieces;
    }

    public void setPieces(Pawn[][] pieces) {
        this.pieces = pieces;
    }
}
package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (VerifyIfSpaceIsValid(xCoordinate, yCoordinate)) {
            if (IsLegalColorPosition(xCoordinate, pieceColor)) {
                pawn.setChessBoard(this);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pawn.setPieceColor(pieceColor);
                pieces[xCoordinate][yCoordinate] = pawn;
            }
            else {
                System.out.println("Invalid position relative to colors.");
            }
        }
        else {
            pawn.setChessBoard(this);
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
            pawn.setPieceColor(pieceColor);
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return ((xCoordinate >= 0 && xCoordinate < MAX_BOARD_HEIGHT) && (yCoordinate >= 0 && yCoordinate < MAX_BOARD_WIDTH));
    }

    public boolean IsLegalColorPosition(int xCoordinate, PieceColor pieceColor) {
        if (pieceColor.equals(PieceColor.WHITE)) {
            return (xCoordinate == 0 || xCoordinate == 1);
        }
        else {
            return (xCoordinate == MAX_BOARD_HEIGHT - 1 || xCoordinate == MAX_BOARD_HEIGHT);
        }
    }

    public boolean VerifyIfSpaceIsValid(int xCoordinate, int yCoordinate) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            return pieces[xCoordinate][yCoordinate] == null;
        }
        return false;
    }
}

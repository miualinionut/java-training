package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public boolean isPositionFree(int xCoordinate, int yCoordinate) {
        try {
            if (pieces[xCoordinate][yCoordinate] == null) {
                return true;
            } else return false;
        } catch(ArrayIndexOutOfBoundsException e)
        {
            return false;
        }
    }

    public boolean checkValidCoordinates(int xCoordinate, int yCoordinate) {
        return IsLegalXPosition(xCoordinate) && IsLegalYPosition(yCoordinate);
    }

    public boolean validatePositionForColors(int xCoordinate, PieceColor color) {
        if (color == PieceColor.WHITE) {
            return xCoordinate == 0 || xCoordinate == 1;
        }
        return xCoordinate == MAX_BOARD_HEIGHT - 1 || xCoordinate == MAX_BOARD_HEIGHT;
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            if (validatePositionForColors(xCoordinate, pawn.getPieceColor())) {
                pawn.setChessBoard(this);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pawn.setPieceColor(pieceColor);
                pieces[xCoordinate][yCoordinate] = pawn;
            } else {
                setUnexistingCoordinates(pawn);
            }
        } else {
            setUnexistingCoordinates(pawn);
        }
    }

    public void setUnexistingCoordinates(Pawn pawn) {
        pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
    }

    public void Move(Pawn pawn, int xCoordinate, int yCoordinate) {
        if(IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            int oldX = pawn.getXCoordinate();
            int oldY = pawn.getYCoordinate();

            pieces[oldX][oldY] = null;
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        }
        else
        {
            setUnexistingCoordinates(pawn);
        }
    }

    public boolean IsLegalXPosition(int x) {
        return 0 <= x && x <= MAX_BOARD_HEIGHT;
    }

    public boolean IsLegalYPosition(int y) {
        return 0 <= y && y <= MAX_BOARD_WIDTH;
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(checkValidCoordinates(xCoordinate, yCoordinate)) {
            return isPositionFree(xCoordinate, yCoordinate);
        }
        else return false;
    }
}

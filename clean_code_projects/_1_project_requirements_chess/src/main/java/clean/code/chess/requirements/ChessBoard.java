package clean.code.chess.requirements;

import clean.code.chess.requirements.enums.PieceColor;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }


    public void Add(Pawn pawn, int x, int y, PieceColor pieceColor) {
        if (IsLegalBoardPosition(x, y)) {
            if (validatePositionForColors(x, pawn.getPieceColor())) {
                pawn.setChessBoard(this);
                pawn.setXCoordinate(x);
                pawn.setYCoordinate(y);
                pawn.setPieceColor(pieceColor);
                pieces[x][y] = pawn;
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

    public void Move(Pawn pawn, int x, int y) {
        if(IsLegalBoardPosition(x, y)) {
            int oldX = pawn.getXCoordinate();
            int oldY = pawn.getYCoordinate();

            pieces[oldX][oldY] = null;
            pawn.setXCoordinate(x);
            pawn.setYCoordinate(y);
            pieces[x][y] = pawn;
        }
    }

    public boolean IsLegalXPosition(int x) {
        return 0 <= x && x <= MAX_BOARD_HEIGHT;
    }

    public boolean IsLegalYPosition(int y) {
        return 0 <= y && y <= MAX_BOARD_WIDTH;
    }

    public boolean IsLegalBoardPosition(int x, int y) {
        if(checkValidCoordinates(x, y)) {
            return isPositionFree(x, y);
        }
        else return false;
    }

    public boolean isPositionFree(int x, int y) {
        try {
            if (pieces[x][y] == null) {
                return true;
            } else return false;
        } catch(ArrayIndexOutOfBoundsException e)
        {
            return false;
        }
    }

    public boolean checkValidCoordinates(int x, int y) {
        return IsLegalXPosition(x) && IsLegalYPosition(y);
    }

    public boolean validatePositionForColors(int x, PieceColor color) {
        if (color == PieceColor.WHITE) {
            return x == 0 || x == 1;
        }
        return x == MAX_BOARD_HEIGHT - 1 || x == MAX_BOARD_HEIGHT;
    }
}

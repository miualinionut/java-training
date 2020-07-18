package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;
    private PointsManager whiteTeam;
    private PointsManager blackTeam;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
        blackTeam = PointsManager.getInstance(PieceColor.BLACK);
        whiteTeam = PointsManager.getInstance(PieceColor.WHITE);
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) == true) {
            if (pieces[xCoordinate][yCoordinate] == null) {
                pawn.setChessBoard(this);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pieces[xCoordinate][yCoordinate] = pawn;
            } else {
                pawn.setXCoordinate(-1);
                pawn.setYCoordinate(-1);
            }
        }
        else{
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
    }

    public boolean areOpponents(Pawn pawn1, Pawn pawn2) {
        //two pawns are opponents only if their colors are different
        if (pawn1.getPieceColor().toString().compareTo(pawn2.getPieceColor().toString()) != 0)
            return true;
        return false;
    }

    public void moveToNewPosition(Pawn pawn, int newX, int newY) {
        if (pawn.isLegalNewPosition(newX, newY)) {
            pieces[pawn.getXCoordinate()][pawn.getYCoordinate()] = null; //the last position is now free
            pieces[newX][newY] = pawn; // the new position is now occupied by the pawn
            pawn.setXCoordinate(newX); //update the new coordonates for the pawn
            pawn.setYCoordinate(newY);
        }
    }

    public boolean isEmpty(int x, int y) {
        if (pieces[x][y] == null)
            return true;
        return false;
    }


    public void capture(Pawn attacker, Pawn taken) {
        pieces[attacker.getXCoordinate()][attacker.getYCoordinate()] = null;
        pieces[taken.getXCoordinate()][taken.getYCoordinate()] = attacker;
        attacker.setXCoordinate(taken.getXCoordinate());
        attacker.setYCoordinate(taken.getYCoordinate());

        //if one player captures a pawn of another color, wew add 1 point to their total of points
        if (attacker.getPieceColor().toString().compareTo("BLACK") == 0)
            blackTeam.addPoints();
        else
            whiteTeam.addPoints();
    }

    public void makeThePawnMove(Pawn pawn, MovementType movementType, int newX, int newY) {
        if (movementType.toString().compareTo("MOVE") == 0) {
            if (IsLegalBoardPosition(newX, newY) && isEmpty(newX, newY)) {
                moveToNewPosition(pawn, newX, newY);
            }
        } else {
            if (IsLegalBoardPosition(newX, newY) && areOpponents(pawn, pieces[newX][newY]))
                // a capture is possible only if the two pawns are opponents
                capture(pawn, pieces[newX][newY]);
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if ((xCoordinate <= 6 && xCoordinate >= 0) && (yCoordinate <= 6 && yCoordinate >= 0)) return true;
        return false;
    }

}
package clean.code.chess.requirements;

import java.awt.*;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(IsLegalBoardPosition(xCoordinate,yCoordinate)){
            if(isValidColorOnPosition(xCoordinate,pawn.getPieceColor())){
                pawn.setChessBoard(this);
                pawn.setYCoordinate(yCoordinate);
                pawn.setXCoordinate(xCoordinate);
                pawn.setPieceColor(pieceColor);
                pieces[xCoordinate][yCoordinate] = pawn;
            }
            else{
                pawn.setXCoordinate(-1);
                pawn.setYCoordinate(-1);
            }
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return isValidCoordinates(xCoordinate,yCoordinate) && isPositionFree(xCoordinate,yCoordinate);
    }

    public void updateMove(Pawn pawn, int x, int y) {
        if(IsLegalBoardPosition(x,y)){
            int oldX = pawn.getXCoordinate();
            int oldY = pawn.getYCoordinate();
            pieces[oldX][oldY] = null;
            pawn.setYCoordinate(y);
            pawn.setXCoordinate(x);
            pieces[x][y] = pawn;


        }
    }

    //------------------VALIDATIONS------------------------------------------

    public boolean isValidCoordinates(int x,int y){
        return (0 <= x && x < MAX_BOARD_WIDTH) && (0 <= y && y < MAX_BOARD_HEIGHT);

    }

    public boolean isPositionFree(int x,int y) {

        try {
                return pieces[x][y] == null;
        }catch (IndexOutOfBoundsException e){
            return false;
        }

    }

    public boolean isValidColorOnPosition(int x, PieceColor color){
        if(color == PieceColor.WHITE){
            return (x == 0 || x == 1);
        }

        return (x == MAX_BOARD_HEIGHT || x == MAX_BOARD_HEIGHT-1);

    }

    // -----------------------------------------------------------------------------

}

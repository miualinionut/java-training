package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        if(IsLegalBoardPosition(xCoordinate,yCoordinate)){
            if(positionValidationByColor(xCoordinate, pawn.getPieceColor())){
                pawn.setChessBoard(this);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pawn.setPieceColor(pieceColor);
                pieces[xCoordinate][yCoordinate] = pawn;
            }
            else{
                eliminatePawn(pawn);
            }
        }
        else{
            eliminatePawn(pawn);
        }
        /*throw new UnsupportedOperationException("Need to implement ChessBoard.add()");*/
    }

    public void Move(Pawn pawn, int x, int y){
        if(IsLegalBoardPosition(x,y)){
            int previousX = pawn.getXCoordinate();
            int previousY = pawn.getYCoordinate();
            pieces[previousX][previousY] = null;
            pawn.setXCoordinate(x);
            pawn.setYCoordinate(y);
            pieces[x][y] = pawn;
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(CoordinatesValidator(xCoordinate,yCoordinate))
            return isPositionFree(xCoordinate,yCoordinate);
        else return false;
    }


    public boolean CoordinatesValidator(int x, int y){
        return (0<=x)&&(x<=MAX_BOARD_WIDTH)&&(0<=y)&&(y<=MAX_BOARD_HEIGHT);
    }

    public boolean positionValidationByColor(int y, PieceColor color){
        switch (color){
            case WHITE: return y==0 || y == 1;
        }
        return y==MAX_BOARD_HEIGHT || y==MAX_BOARD_HEIGHT-1;
    }

    public boolean isPositionFree(int x, int y){
        try{
            if(pieces[x][y] == null){
                return true;
            }
            else
                return false;
        }catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }

    public void eliminatePawn(Pawn pawn){
        pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
    }
}

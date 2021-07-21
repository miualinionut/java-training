package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private int[][] pieces;

    public ChessBoard() {
        pieces = new int[MAX_BOARD_WIDTH+1][MAX_BOARD_HEIGHT+1];
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                pieces[i][j]=0;
            }
        }

    }
    public boolean IsInRangeX(int xCoordinate){
        return (xCoordinate<=7 && xCoordinate >=0);
    }
    public boolean IsInRangey(int yCoordinate){
        return (yCoordinate<=7 && yCoordinate >=0);
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
        if(this.IsInRangeX(xCoordinate ) && this.IsInRangeX(yCoordinate) && this.pieces[xCoordinate][yCoordinate]!=1) {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            this.pieces[xCoordinate][yCoordinate]=1;
        }
        else{
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
            this.pieces[xCoordinate][yCoordinate]=0;
        }

        pawn.setPieceColor(pieceColor);
        //backup2


    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        //throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
        if(this.IsInRangeX(xCoordinate) && this.IsInRangey(yCoordinate)){
            return true;
        }
        return false;
    }
}

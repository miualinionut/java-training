package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    private int numbl,numwh;
    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
        numbl=0;
        numwh=0;
    }
    public boolean canCapture(int xCoordinate, int yCoordinate, PieceColor pieceColor){
        if(pieces[xCoordinate][yCoordinate]==null)return false;
        if(pieces[xCoordinate][yCoordinate].getPieceColor()==pieceColor)return false;
        return true;
    }
    public boolean canMove(int xCoordinate, int yCoordinate){
        if(pieces[xCoordinate][yCoordinate]!=null)return false;
        else return true;
    }
    public void Move(Pawn p,int xCoordinate,int yCoordinate){
        pieces[xCoordinate][yCoordinate]=p;
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(pieceColor==PieceColor.BLACK){
            if(numbl<MAX_BOARD_WIDTH) {
                numbl++;
            }
            else{
                pawn.setXCoordinate(-1);
                pawn.setYCoordinate(-1);
                return;
            }
        }
        else {
            if(numwh<MAX_BOARD_WIDTH) {
                numwh++;
            }
            else{
                pawn.setXCoordinate(-1);
                pawn.setYCoordinate(-1);
                return;
            }
        }
        if(IsLegalBoardPosition(xCoordinate,yCoordinate)==false)
        {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
            return;
        }
        if(pieces[xCoordinate][yCoordinate]==null) {
            pawn.setChessBoard(this);
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }

        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate<0 || yCoordinate<0 || xCoordinate>MAX_BOARD_WIDTH || yCoordinate>MAX_BOARD_HEIGHT)return false;
        else return true;
        //throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
}

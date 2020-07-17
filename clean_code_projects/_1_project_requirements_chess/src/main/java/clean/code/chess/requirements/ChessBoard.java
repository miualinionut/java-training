package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
      //  throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
          if (IsLegalBoardPosition(xCoordinate,yCoordinate)){
              if(pieces[xCoordinate][yCoordinate]==null){
                  pawn.setXCoordinate(xCoordinate);
                  pawn.setYCoordinate(yCoordinate);
                  pawn.setPieceColor(pieceColor);
                  pawn.setChessBoard(this);
                  this.pieces[xCoordinate][yCoordinate]=pawn;
              }
          }
          else{
              pawn.setXCoordinate(-1);
              pawn.setYCoordinate(-1);
          }

    }

    public void MovePawn(Pawn pawn, MovementType movement, int x, int y){
        if(movement.toString().equals("MOVE")){
            if(PawnCanMove(pawn,x,y) && pieces[x][y]==null){
                pieces[pawn.getXCoordinate()][pawn.getYCoordinate()]=null;
                pawn.setXCoordinate(x);
                pawn.setYCoordinate(y);
                pieces[x][y]=pawn;

            }
        }
        else if(movement.toString().equals("CAPTURE")){
            if(PawnCanMove(pawn,x,y) && pieces[x][y]!=null && !pieces[x][y].getPieceColor().equals(pawn.getPieceColor())){

                pieces[pawn.getXCoordinate()][pawn.getYCoordinate()]=null;
                pawn.setXCoordinate(x);
                pawn.setYCoordinate(y);
                pieces[x][y]=pawn;
            }
        }
    }

    public boolean PawnCanMove(Pawn pawn,int xCoordinate,int yCoordinate){
        if(pawn.getPieceColor().toString().equals("WHITE")){

            if(pawn.getYCoordinate()-yCoordinate==-1 && pawn.getXCoordinate()==xCoordinate) return true;
            if( pawn.getYCoordinate()-yCoordinate==-1 && Math.abs(pawn.getXCoordinate()-xCoordinate)==1) return true;
        }
        if(pawn.getPieceColor().toString().equals("BLACK")){
            if(pawn.getYCoordinate()-yCoordinate==1 && pawn.getXCoordinate()==xCoordinate) return true;
            if( pawn.getYCoordinate()-yCoordinate==1 && Math.abs(pawn.getXCoordinate()-xCoordinate)==1) return true;
        }
        return false;


    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
       // throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");

        return 0 <= xCoordinate && xCoordinate < MAX_BOARD_WIDTH && 0 <= yCoordinate && yCoordinate < MAX_BOARD_HEIGHT;
    }
}

package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    //public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
      //  if(pawn.validMove(xCoordinate,yCoordinate)==true) {
      //  pawn.setXCoordinate(xCoordinate);
       // }
     //   throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    //}
    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
       // if(pawn.validMove(xCoordinate,yCoordinate)){
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setPieceColor(pieceColor);
            pawn.setChessBoard(this);
//            pieces[xCoordinate][yCoordinate]=pawn;
      //  }
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }
    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate>=0 && xCoordinate<=MAX_BOARD_HEIGHT && yCoordinate>=0 && yCoordinate<=MAX_BOARD_WIDTH &&pieces[xCoordinate][yCoordinate]==null)
            return true;
        else
            return false;

        //throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");

}}

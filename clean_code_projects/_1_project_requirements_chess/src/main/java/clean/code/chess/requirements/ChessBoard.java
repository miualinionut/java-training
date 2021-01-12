package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }
    public int getNumberOfPawns(PieceColor pieceColor){
        int nr = 0;
        for(int i = 0 ; i < 7 ; i++)
            for(int j = 0 ; j < 7 ; j++)
                if(pieces[i][j] != null && pieces[i][j].getPieceColor().equals(pieceColor))
                    nr++;
        return nr;
    }
    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
            if(this.IsLegalBoardPosition(xCoordinate,yCoordinate) && getNumberOfPawns(pieceColor) < 8){
                if (pieceColor.equals(PieceColor.BLACK)){
                    if (xCoordinate == 6 && yCoordinate <= 7 && yCoordinate >= 0) {
                        if (pieces[xCoordinate][yCoordinate] == null) {
                            this.pieces[xCoordinate][yCoordinate] = pawn;
                            pawn.setXCoordinate(xCoordinate);
                            pawn.setYCoordinate(yCoordinate);
                        } else {
                            pawn.setXCoordinate(-1);
                            pawn.setYCoordinate(-1);
                        }
                    }else {
                        pawn.setXCoordinate(-1);
                        pawn.setYCoordinate(-1);
                    }
                } else if (xCoordinate == 1 && yCoordinate <= 7 && yCoordinate >= 0) {
                    if (pieces[xCoordinate][yCoordinate] == null) {
                        this.pieces[xCoordinate][yCoordinate] = pawn;
                        pawn.setXCoordinate(xCoordinate);
                        pawn.setYCoordinate(yCoordinate);
                    } else {
                        pawn.setXCoordinate(-1);
                        pawn.setYCoordinate(-1);
                    }
                }else {
                    pawn.setXCoordinate(-1);
                    pawn.setYCoordinate(-1);
                }
            }else {
                pawn.setYCoordinate(-1);
                pawn.setXCoordinate(-1);
            }




    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if((xCoordinate <= 7 && xCoordinate >= 0) && (yCoordinate >= 0 && yCoordinate <= 7))
            return true;
        return false;
    }
}

package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        switch (pieceColor){
            case WHITE:
                try{
                    if((xCoordinate == 0 || xCoordinate == 1) && (yCoordinate >= 0 && yCoordinate <= 7)){
                        pawn.setYCoordinate(yCoordinate);
                        pawn.setXCoordinate(xCoordinate);
                        pieces[xCoordinate][yCoordinate] = pawn;
                    }
                }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                    pawn.setXCoordinate(-1);
                    pawn.setYCoordinate(-1);
                }
                break;
            case BLACK:
                try{
                    if((xCoordinate == 6 || xCoordinate == 7) && (yCoordinate >= 0 && yCoordinate <= 7)){
                        pawn.setYCoordinate(yCoordinate);
                        pawn.setXCoordinate(xCoordinate);
                        pieces[xCoordinate][yCoordinate] = pawn;
                    }
                }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                    pawn.setXCoordinate(-1);
                    pawn.setYCoordinate(-1);
                }
                break;
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if((xCoordinate >= 0 && xCoordinate <= 7) && (yCoordinate >=0 && yCoordinate <= 7))
            return true;
        else
            return false;
    }
}

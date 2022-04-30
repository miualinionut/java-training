package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        //implement ChessBoard.add()
        try{
            pawn.setPieceColor(pieceColor);
        }catch (UnsupportedOperationException e){
            System.out.println("Color invalid");
        }

        try{
            pawn.setChessBoard(this);
            pawn.setYCoordinate(yCoordinate);
            pawn.setXCoordinate(xCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;

        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            pawn.setYCoordinate(-1);
            pawn.setXCoordinate(-1);
        }

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        //implement ChessBoard.IsLegalBoardPosition()
        boolean t;
        t = xCoordinate >= 0 && xCoordinate <= MAX_BOARD_WIDTH && yCoordinate >= 0 && yCoordinate <= MAX_BOARD_HEIGHT;
        return t;
    }
}

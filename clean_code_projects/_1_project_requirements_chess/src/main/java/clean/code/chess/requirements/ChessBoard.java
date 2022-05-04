package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        if(this.IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            pawn.setPieceColor(pieceColor);
            if (this.pieces[xCoordinate][yCoordinate] == null) {
                this.addPawn(xCoordinate, yCoordinate, pawn);
            } else {
                this.setPawnDuplicate(pawn);
            }
        }else{
            System.out.println("Out of bounds");
        }
    }

    private void setPawnDuplicate(Pawn pawn){
        pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
        pawn.setChessBoard(this);
    }

    private void addPawn(int x, int y, Pawn pawn){
        pawn.setChessBoard(this);
        pawn.setPieceColor(PieceColor.BLACK);
        pawn.setXCoordinate(x);
        pawn.setYCoordinate(y);
        this.pieces[x][y] = pawn;
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return xCoordinate >= 0 && xCoordinate<8 && yCoordinate >= 0 && yCoordinate<8;
    }
}

package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    public Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

//    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove() {
//        chessBoard.Add(testSubject, 6, 3, PieceColor.BLACK);
//        testSubject.Move(MovementType.MOVE, 4, 3);
//        assertEquals(6, testSubject.getXCoordinate());
//        assertEquals(3, testSubject.getYCoordinate());

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        //Need to implement ChessBoard.add()
        pawn.setPieceColor(pieceColor);
        if(IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setChessBoard(this);
            pieces[xCoordinate][yCoordinate]=pawn;
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }

    }



    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        //verificam daca pozitia este in interiorul tablei si daca spatiul este liber
        return xCoordinate >= 0 && xCoordinate < MAX_BOARD_WIDTH && yCoordinate >= 0 && yCoordinate < MAX_BOARD_HEIGHT && pieces[xCoordinate][yCoordinate] == null;
    }


}

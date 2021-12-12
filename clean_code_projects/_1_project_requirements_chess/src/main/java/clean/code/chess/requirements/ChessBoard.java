package clean.code.chess.requirements;

import org.hamcrest.core.Is;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        //pentru o pozitie valida
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {

            if (pieceColor == PieceColor.WHITE)
                try {
                    //formez si amplasez un pion alb la respectivele coordonate
                    if ((xCoordinate == 0 || xCoordinate == 1) && (yCoordinate >= 0 && yCoordinate <= 7)) {
                        pawn.setYCoordinate(yCoordinate);
                        pawn.setXCoordinate(xCoordinate);
                        pieces[xCoordinate][yCoordinate] = pawn;
                    }

                    //eroare pentru o pozitie invalida (inafara lungimii permise)
                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    pawn.setXCoordinate(-1);
                    pawn.setYCoordinate(-1);
                }

            if (pieceColor == PieceColor.BLACK)
                try {
                    //formez si amplasez un pion negru la respectivele coordonate
                    if ((xCoordinate == 6 || xCoordinate == 7) && (yCoordinate >= 0 && yCoordinate <= 7)) {
                        pawn.setYCoordinate(yCoordinate);
                        pawn.setXCoordinate(xCoordinate);
                        pieces[xCoordinate][yCoordinate] = pawn;
                    }

                    //eroare pentru o pozitie invalida (inafara lungimii permise)
                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    pawn.setXCoordinate(-1);
                    pawn.setYCoordinate(-1);
                }
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {

        //Verific daca toate pozitiile au coordonatele in intervalul [0,7]
        return xCoordinate >= 0 && xCoordinate <= 7 && yCoordinate >= 0 && yCoordinate <= 7;
    }
}

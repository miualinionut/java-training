package clean.code.chess.requirements;

import clean.code.chess.requirements.pieces.Pawn;
import clean.code.chess.requirements.pieces.attributes.Color;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessBoardTest {

    private ChessBoard testSubject;

    @Before
    public void setUp() {
        testSubject = new ChessBoard();
    }

    @Test
    public void testHas_MaxBoardWidth_of_7() {
        Assert.assertEquals(7, ChessBoard.MAX_BOARD_HEIGHT);
    }

    @Test
    public void testHas_MaxBoardHeight_of_7() {
        Assert.assertEquals(7, ChessBoard.MAX_BOARD_HEIGHT);
    }

    @Test
    public void testIsLegalBoardPosition_True_X_equals_0_Y_equals_0() {
        boolean isValidPosition = testSubject.isLegalBoardPosition(0, 0);
        Assert.assertTrue(isValidPosition);
    }

    @Test
    public void testIsLegalBoardPosition_True_X_equals_5_Y_equals_5() {
        boolean isValidPosition = testSubject.isLegalBoardPosition(5, 5);
        Assert.assertTrue(isValidPosition);
    }

    @Test
    public void testIsLegalBoardPosition_False_X_equals_11_Y_equals_5() {
        boolean isValidPosition = testSubject.isLegalBoardPosition(11, 5);
        Assert.assertFalse(isValidPosition);
    }

    @Test
    public void testIsLegalBoardPosition_False_X_equals_0_Y_equals_9() {
        boolean isValidPosition = testSubject.isLegalBoardPosition(0, 9);
        Assert.assertFalse(isValidPosition);
    }

    @Test
    public void testIsLegalBoardPosition_False_X_equals_11_Y_equals_0() {
        boolean isValidPosition = testSubject.isLegalBoardPosition(11, 0);
        Assert.assertFalse(isValidPosition);
    }

    @Test
    public void testIsLegalBoardPosition_False_For_Negative_Y_Values() {
        boolean isValidPosition = testSubject.isLegalBoardPosition(5, -1);
        Assert.assertFalse(isValidPosition);
    }

    @Test
    public void Avoids_Duplicate_Positioning() {
        Pawn firstPawn = new Pawn(Color.BLACK);
        Pawn secondPawn = new Pawn(Color.BLACK);
        testSubject.addPieceOnChessBoard(firstPawn, 6, 3);
        testSubject.addPieceOnChessBoard(secondPawn, 6, 3);


    }

    @Test
    public void testLimits_The_Number_Of_Pawns() {
        for (int i = 0; i < 10; i++) {
            Pawn pawn = new Pawn(Color.BLACK);
            int row = i / ChessBoard.MAX_BOARD_WIDTH;
            testSubject.addPieceOnChessBoard(pawn, 6 + row, i % ChessBoard.MAX_BOARD_WIDTH);
            if (row < 1); {

            }
        }
    }
}
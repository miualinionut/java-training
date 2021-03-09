package clean.code.chess.solution;

import clean.code.chess.solution.pieces.Pawn;
import clean.code.chess.solution.pieces.attributes.Color;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PawnTest {

    private ChessBoard chessBoard;
    private Pawn testSubject;
    private Pawn testSubject2;

    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
        this.testSubject = new Pawn(Color.BLACK);
        this.testSubject2 = new Pawn(Color.WHITE);
    }

    @Test
    public void testChessBoard_Add_Sets_XCoordinate_BLACK_COLOR() {
        this.chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        assertEquals(6, testSubject.getXCoordinate());
    }

    @Test
    public void testChessBoard_Add_Sets_XCoordinate_WHITE_COLOR() {
        this.chessBoard.addPieceOnChessBoard(testSubject2, 6, 3);
        assertEquals(6, testSubject2.getXCoordinate());
    }

    @Test
    public void testChessBoard_Add_Sets_YCoordinate_BLACK_COLOR() {
        this.chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testChessBoard_Add_Sets_YCoordinate_WHITE_COLOR() {
        this.chessBoard.addPieceOnChessBoard(testSubject2, 6, 3);
        assertEquals(3, testSubject2.getYCoordinate());
    }


    @Test
    public void testPawn_Move_IllegalCoordinates_Right_DoesNotMove_BLACK_COLOR() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        testSubject.move(7, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Right_DoesNotMove_WHITE_COLOR() {
        chessBoard.addPieceOnChessBoard(testSubject2, 6, 3);
        testSubject2.move(7, 3);
        assertEquals(6, testSubject2.getXCoordinate());
        assertEquals(3, testSubject2.getYCoordinate());
    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove_BLACK_COLOR() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        testSubject.move(4, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove_WHITE_COLOR() {
        chessBoard.addPieceOnChessBoard(testSubject2, 6, 3);
        testSubject2.move(4, 3);
        assertEquals(6, testSubject2.getXCoordinate());
        assertEquals(3, testSubject2.getYCoordinate());
    }

    @Test
    public void testPawn_Move_LegalCoordinates_Forward_UpdatesCoordinates_BLACK_COLOR() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3);
        testSubject.move(6, 2);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_LegalCoordinates_Forward_UpdatesCoordinates_WHITE_COLOR() {
        chessBoard.addPieceOnChessBoard(testSubject2, 6, 3);
        testSubject2.move(6, 2);
        assertEquals(6, testSubject2.getXCoordinate());
        assertEquals(2, testSubject2.getYCoordinate());
    }

    @Test
	public void testPawnMovements(){

		chessBoard.addPieceOnChessBoard(testSubject2, 3, 3);
        //One step
        testSubject2.move(2,3);
        assertEquals(2, testSubject2.getXCoordinate());
        assertEquals(3, testSubject2.getYCoordinate());
        
        //Two step first move
        testSubject2.move(1,3);
        assertEquals(1, testSubject2.getXCoordinate());
        assertEquals(3, testSubject2.getYCoordinate());

        //Three step
        testSubject2.move(0,3);
        assertEquals(0, testSubject2.getXCoordinate());
        assertEquals(3, testSubject2.getYCoordinate());

        //Back step
        testSubject2.move(4,3);
        assertEquals(4, testSubject2.getXCoordinate());
        assertEquals(3, testSubject2.getYCoordinate());
		
        // Diagonal without enemies
        testSubject2.move(2,2);
        assertEquals(2, testSubject2.getXCoordinate());
        assertEquals(2, testSubject2.getYCoordinate());
		
		// Diagonal with enemies
		chessBoard.addPieceOnChessBoard(testSubject2, 2, 2);
		testSubject.move(2,2);
        assertEquals(2, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
		
		// One step, black
		testSubject.move(3,2);
        assertEquals(3, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
		// back step, black
		testSubject.move(1,2);
        assertEquals(1, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
		
		//Invalid move, out-of-bounds
		testSubject.move(1,1);
        assertEquals(1, testSubject.getXCoordinate());
        assertEquals(1, testSubject.getYCoordinate());
		
		// Invalid move, partner in front
		testSubject.move(1,1);
		chessBoard.addPieceOnChessBoard(testSubject2, 2, 3);;
		assertEquals(2, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
		
		// Two step, already moved
		testSubject.move(5,5);
		assertEquals(3, testSubject.getXCoordinate());
        assertEquals(5, testSubject.getYCoordinate());
	}

}
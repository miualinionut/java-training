package clean.code.chess.requirements;

import clean.code.chess.requirements.pieces.attributes.Color;
import clean.code.chess.requirements.pieces.attributes.Position;
import clean.code.chess.requirements.pieces.Pawn;
import org.junit.Before;
import org.junit.Test;



public class PawnTest {

    private ChessBoard chessBoard;
    private Pawn testSubject;

    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
        this.testSubject = new Pawn(Color.BLACK);
    }

    @Test
    public void testChessBoard_Add_Sets_XCoordinate() {
        this.chessBoard.Add(testSubject, 6, 3, Color.BLACK);

    }

    @Test
    public void testChessBoard_Add_Sets_YCoordinate() {
        this.chessBoard.Add(testSubject, 6, 3, Color.BLACK);

    }


    @Test
    public void testPawn_Move_IllegalCoordinates_Right_DoesNotMove() {
        chessBoard.Add(testSubject, 6, 3, Color.BLACK);
        testSubject.Move(Position.MOVE, 7, 3);


    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove() {
        chessBoard.Add(testSubject, 6, 3, Color.BLACK);
        testSubject.Move(Position.MOVE, 4, 3);

    }

    @Test
    public void testPawn_Move_LegalCoordinates_Forward_UpdatesCoordinates() {
        chessBoard.Add(testSubject, 6, 3, Color.BLACK);
        testSubject.Move(Position.MOVE, 6, 2);

    }

}
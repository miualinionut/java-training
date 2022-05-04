package clean.code.chess.requirements;

public class Main {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        Pawn pawn = new Pawn(PieceColor.BLACK);
        Pawn pawn1 = new Pawn(PieceColor.BLACK);

        chessBoard.Add(pawn, 6, 3, PieceColor.BLACK);
        chessBoard.Add(pawn1, 6, 3, PieceColor.BLACK);

        System.out.println(pawn.getXCoordinate()+" "+ pawn.getYCoordinate());
        System.out.println(pawn1.getXCoordinate()+" "+ pawn1.getYCoordinate());

        pawn.Move(MovementType.MOVE, 6, 2);

        System.out.println(chessBoard.IsLegalBoardPosition(8, 8));


    }

}

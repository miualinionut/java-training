package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard()
    {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) //TODO
    {
        // daca nu iese de pe tabla
        if ((0 <= xCoordinate && xCoordinate <= MAX_BOARD_HEIGHT) && (0 <= yCoordinate && yCoordinate <= MAX_BOARD_WIDTH))
        {
            // daca are loc
            try 
            {
                return pieces[xCoordinate][yCoordinate] == null;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean rightColorPosition(int xCoordinate, PieceColor pieceColor) //TODO
    {
        if (pieceColor == PieceColor.BLACK)
        {
            return xCoordinate == MAX_BOARD_HEIGHT - 1 || xCoordinate == MAX_BOARD_HEIGHT;
        }
        return xCoordinate == 0 || xCoordinate == 1;
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) //TODO
    {

        if (rightColorPosition(xCoordinate, pieceColor))
        {
            if (IsLegalBoardPosition(xCoordinate, yCoordinate))
            {
                pawn.setChessBoard(this);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pawn.setPieceColor(pieceColor);
                pieces[xCoordinate][yCoordinate] = pawn;
            }
            else
            {
                pawn.setXCoordinate(-1);
                pawn.setYCoordinate(-1);
            }
        }
        else
        {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
    }

    public void Move(Pawn pawn, int xCoordinate, int yCoordinate) //TODO
    {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate))
        {
            int oldXCoordinate = pawn.getXCoordinate();
            int oldYCoordinate = pawn.getYCoordinate();

            pieces[oldXCoordinate][oldYCoordinate] = null;
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        }
    }
}

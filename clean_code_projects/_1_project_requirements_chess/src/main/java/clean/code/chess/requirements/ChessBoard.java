package clean.code.chess.requirements;


import static clean.code.chess.requirements.PieceColor.*;

public class ChessBoard {

    public static final int MAX_BOARD_WIDTH = 7;
    public static final int MAX_BOARD_HEIGHT = 7;

    protected Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        if(IsLegalBoardPosition(xCoordinate, yCoordinate))
        {
            switch(pieceColor)
            {
                case BLACK:
                    if(xCoordinate == MAX_BOARD_HEIGHT || xCoordinate == MAX_BOARD_HEIGHT - 1)
                    {
                        pawn.setChessBoard(this);
                        pawn.setXCoordinate(xCoordinate);
                        pawn.setYCoordinate(yCoordinate);
                        pieces[xCoordinate][yCoordinate] = pawn;
                    }
                    else
                    {   pawn.setChessBoard(this);
                        pawn.setXCoordinate(-1);
                        pawn.setYCoordinate(-1);
                        pieces[xCoordinate][yCoordinate] = pawn;

                    }
                    break;
                case WHITE:
                    if(xCoordinate == 0 || xCoordinate == 1)
                    {
                        pawn.setChessBoard(this);
                        pawn.setXCoordinate(xCoordinate);
                        pawn.setYCoordinate(yCoordinate);
                        pieces[xCoordinate][yCoordinate] = pawn;

                    }else
                    {
                        pawn.setChessBoard(this);
                        pawn.setXCoordinate(-1);
                        pawn.setYCoordinate(-1);
                        pieces[xCoordinate][yCoordinate] = pawn;

                    }
                    break;

            }
        }

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {

        return isInsideTable(xCoordinate, MAX_BOARD_WIDTH) && isInsideTable(yCoordinate, MAX_BOARD_HEIGHT) && isFree(xCoordinate,yCoordinate);

    }
    public boolean isInsideTable(int pos, int limit)
    {
        return 0 <= pos && pos < limit;
    }
    public boolean isFree(int x, int y)
    {
        return pieces[x][y] ==  null;
    }

}
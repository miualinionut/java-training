package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {


            if(!chessBoard.IsLegalBoardPosition(newX, newY))
                return;

            if(pieceColor.equals(PieceColor.WHITE)) {

                if (movementType.equals(MovementType.MOVE)) {
                    if (xCoordinate == newX) {

                        if(newY == yCoordinate + 1) {
                            chessBoard.MoveChess(this, newX, newY);
                            setXCoordinate(newX);
                            setYCoordinate(newY);
                        }
                        else
                            if (newY == yCoordinate + 2 && yCoordinate == 0) {
                                chessBoard.MoveChess(this, newX, newY);
                                setXCoordinate(newX);
                                setYCoordinate(newY);
                            }
                    }
                }

                if (movementType.equals(MovementType.CAPTURE)) {
                    if (xCoordinate == newX - 1 || xCoordinate == newX + 1) {
                        if (newY == yCoordinate + 1) {
                            chessBoard.MoveChess(this, newX, newY);
                            setXCoordinate(newX);
                            setYCoordinate(newY);
                        }
                    }
                }
            }

        if(pieceColor.equals(PieceColor.BLACK)) {

            if (movementType.equals(MovementType.MOVE)) {
                if (xCoordinate == newX) {

                    if(newY == yCoordinate - 1) {
                        chessBoard.MoveChess(this, newX, newY);
                        setXCoordinate(newX);
                        setYCoordinate(newY);
                    }
                    else
                    if (newY == yCoordinate - 2 && yCoordinate == 7) {
                        chessBoard.MoveChess(this, newX, newY);
                        setXCoordinate(newX);
                        setYCoordinate(newY);
                    }

                }
            }

            if (movementType.equals(MovementType.CAPTURE)) {
                if (xCoordinate == newX - 1 || xCoordinate == newX + 1) {
                    if (newY == yCoordinate - 1) {
                        chessBoard.MoveChess(this, newX, newY);
                        setXCoordinate(newX);
                        setYCoordinate(newY);
                    }
                }
            }
        }

    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}

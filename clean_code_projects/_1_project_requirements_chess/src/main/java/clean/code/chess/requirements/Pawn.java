package clean.code.chess.requirements;

public class Pawn {

    protected ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private  PieceColor pieceColor;
    private boolean isMoved;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        this.isMoved = false;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }
    public int getXCoordinate() {
        return xCoordinate;
    }
    public int getYCoordinate() {
        return yCoordinate;
    }
    public PieceColor getPieceColor() {
        return this.pieceColor;
    }
    public void setChessBoard(ChessBoard chessBoard) {this.chessBoard = chessBoard;}
    public void setXCoordinate(int value) {this.xCoordinate = value;}
    public void setYCoordinate(int value) {this.yCoordinate = value;}
    private void setPieceColor(PieceColor value) { pieceColor = value;}

    public void Move(MovementType movementType, int newX, int newY) {

        if(movementType == MovementType.MOVE)
            if(chessBoard.isFree(newX, newY))
            {
                if(this.isXValid(newX) && this.isYValid(newY))
                {

                    chessBoard.pieces[this.getXCoordinate()][this.getYCoordinate()] = null;
                    this.setXCoordinate(newX);
                    this.setYCoordinate(newY);
                    chessBoard.pieces[newX][newY] =  this;
                    if(!isMoved)
                        isMoved = true;
                }
            }
    }
    public boolean isXValid(int newX)
    {
        if(newX < ChessBoard.MAX_BOARD_WIDTH)
            return newX == this.getXCoordinate();
        else
            return false;
    }
    public boolean isYValid(int newY)
    {
        if(!this.isMoved)
        {
            return  newY == this.getYCoordinate() || newY == this.getYCoordinate() + 1 || newY == this.getYCoordinate() + 2 || newY == this.getYCoordinate() - 1;
        }
        else
            return newY == this.getYCoordinate() + 1 ||  newY == this.getYCoordinate()|| newY == this.getYCoordinate() - 1;
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


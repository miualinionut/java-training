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

    public void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {

        if(movementType==MovementType.MOVE){
            if(IsMoveLegal(newX,newY)) {
                this.chessBoard.Move(this,newX,newY);
            }
        }

    }

    public boolean IsMoveLegal(int newX, int newY)
    {
        int pastX = getXCoordinate();
        int pastY=getYCoordinate();
        int movingDirection= getMovingDirection();
        if ((newX==pastX || newX==pastX+ movingDirection) && (newY==pastY || newY ==pastY-1 || newY==pastY+1)){
            return true;
        }
        else {
            return false;
        }

    }

    public int getMovingDirection(){
        if (getPieceColor()==PieceColor.BLACK){
            return -1;
        }
        else {
            return 1;
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

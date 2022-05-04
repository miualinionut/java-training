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
        return this.chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        this.pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        if(movementType == MovementType.MOVE){
            if(this.getPieceColor() == PieceColor.BLACK){
                if(this.getXCoordinate() == newX && (this.getYCoordinate() -1) == newY){
                    this.setYCoordinate(newY);
                }
            }
        } else if(this.getXCoordinate() == newX && (this.getYCoordinate()+1) == newY){
            this.setYCoordinate(newY);
        }
        //throw new UnsupportedOperationException("Need to implement Pawn.Move()");
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

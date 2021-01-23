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
        if(movementType.equals(MovementType.MOVE) &
                chessBoard.IsLegalBoardPosition(newX, newY)){ //Should we check if the move goes to a free position
            if(this.xCoordinate == newX){                     //if we know it's a MOVE type of move and not a CAPTURE?
                if(this.pieceColor == PieceColor.BLACK &
                        (this.yCoordinate - newY == 1 || ((this.yCoordinate == 1 || this.yCoordinate == 6) & this.yCoordinate - newY == 2))) {
                    this.yCoordinate = newY;
                }
                else if(this.pieceColor == PieceColor.WHITE &
                        (newY - this.yCoordinate == 1 || ((this.yCoordinate == 1 || this.yCoordinate == 6) & newY - this.yCoordinate == 2))) {
                    this.yCoordinate = newY;
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

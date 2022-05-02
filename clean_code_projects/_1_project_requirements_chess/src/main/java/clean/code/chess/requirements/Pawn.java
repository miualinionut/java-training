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
        if(movementType.equals(MovementType.MOVE) && chessBoard.IsLegalBoardPosition(newX, newY)){
            if(this.xCoordinate == newX){
                validatePositionAndMovePiece(newX,newY);
            }
        }
        else if(movementType.equals(MovementType.CAPTURE)){
            if(chessBoard.isInBounds(newX, newY) && !chessBoard.isOccupied(xCoordinate,yCoordinate)){
                if(Math.abs(this.xCoordinate - newX) == 1){
                    validatePositionAndMovePiece(newX,newY);
                }
            }
        }
    }

    private void validatePositionAndMovePiece(int newX, int newY){
        if(this.pieceColor == PieceColor.BLACK){
            if(this.yCoordinate - newY > 0){
                Pawn[][] pieces = chessBoard.getPieces();
                pieces[newX][newY] = null;
                this.yCoordinate = newY;
            }
        }
        else if(this.pieceColor == PieceColor.WHITE){
            if(this.yCoordinate - newY < 0){
                Pawn[][] pieces = chessBoard.getPieces();
                pieces[newX][newY] = null;
                this.yCoordinate = newY;
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

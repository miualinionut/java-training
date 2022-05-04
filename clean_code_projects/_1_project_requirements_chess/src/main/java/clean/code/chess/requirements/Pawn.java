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

        this.xCoordinate=newX;
        this.yCoordinate=newY;

        if(movementType.equals(MovementType.MOVE)){
            this.chessBoard.Add(this, this.xCoordinate, this.yCoordinate, this.pieceColor);
        }else if(movementType.equals(MovementType.CAPTURE)){
            if(this.pieceColor.equals(PieceColor.WHITE)){
                this.yCoordinate++;
                this.xCoordinate++;
                if(this.chessBoard.IsLegalBoardPosition(this.xCoordinate, this.yCoordinate))
                    System.out.println("Finished the check board");
            }else if(this.pieceColor.equals(PieceColor.BLACK)){
                this.yCoordinate--;
                this.xCoordinate--;
                if(this.chessBoard.IsLegalBoardPosition(this.xCoordinate, this.yCoordinate)){
                    System.out.println("Finished the check board");
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Pawn{" +
                "chessBoard=" + chessBoard +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", pieceColor=" + pieceColor +
                '}';
    }

}

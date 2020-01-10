package main.java.clean.code.chess.requirements;

public abstract  class Piece {

    protected ChessBoard chessBoard;
    protected PieceColor pieceColor;

    public Piece(PieceColor pieceColor){
        this.pieceColor = pieceColor;
    }

    public void setPieceOnBoard(ChessBoard chessBoard, int xPositon, int yPosition ){
        this.chessBoard = chessBoard;
        this.chessBoard.updatePositionOnBoard(this,xPositon,yPosition);
    }
    public void move(int xPosition, int yPosition){
        if(this.isValidNewPosition(xPosition,yPosition)){
            chessBoard.updatePositionOnBoard(this,xPosition,yPosition);
        }
    }
    public void capture(int xPosition, int yPosition) {
        if(this.isValidNewPosition(xPosition,yPosition)){
            chessBoard.isPlaceAt(this,xPosition,yPosition);
            chessBoard.updatePositionOnBoard(this,xPosition,yPosition);
        }

    }
    public abstract boolean isValidNewPosition(int newX, int newY);
    public int getXCoordinate() {
        return this.chessBoard.getPositon(this).getX();
    }

    public  int getYCoordinate() {
        return this.chessBoard.getPositon(this).getY();
    }

    public  PieceColor getPieceColor(){
        return pieceColor;
    }

}

package main.java.clean.code.chess.requirements;

public class Pawn extends Piece{


    private CheckPosition checkPosition;
    private int movement;

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
        checkPosition = new CheckPosition();
    }

    public void Move(MovementType movementType, int newX, int newY) {
        if(movementType == MovementType.MOVE){
            move(newX,newY);
        }else if(movementType == MovementType.CAPTURE){
            capture(newX,newY);
        }

    }
    @Override
    public boolean isValidNewPosition(int xPosition,int yPosition){
        return checkPosition.isValidNewMovementX(xPosition) || checkPosition.isValidNewMovementY(yPosition);
    }



}

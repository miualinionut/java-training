package clean.code.chess.requirements;

public class Pawn extends Piece implements Movement{

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);

    }
    @Override
    public int checkMovement(){
        if(PieceColor.BLACK == getPieceColor()) {
            return -1;
        }
        return 1;
    }
    @Override
    public boolean isValidNewX(int xPosition) {

        return xPosition == getXCoordinate() + checkMovement()*0 || xPosition == getXCoordinate() + checkMovement() * 1;
    }
    @Override
    public boolean isValidNewY(int yPositon) {
        return yPositon == getYCoordinate() - 1 || yPositon == getYCoordinate() || yPositon == getYCoordinate() + 1;
    }

    public void Move(MovementType movementType, int newX, int newY) {
            if(movementType == MovementType.MOVE){
                move(newX,newY);
            }
            else if(movementType == MovementType.CAPTURE){
                capture(newX,newY);
            }


    }
    @Override
    public boolean isValidNewPosition(int xPosition,int yPosition){
        return isValidNewX(xPosition) && isValidNewY(yPosition);
    }



}

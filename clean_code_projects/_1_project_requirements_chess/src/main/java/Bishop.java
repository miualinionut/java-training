public class Bishop extends Piece{

    public Bishop(boolean available, int x, int y) {
        super(available, x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        if(toX - fromX == toY - fromY)
            return true;

        return false;
    }

}
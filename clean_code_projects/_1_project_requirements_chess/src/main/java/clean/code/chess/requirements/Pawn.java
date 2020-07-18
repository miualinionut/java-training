package clean.code.chess.requirements;

public class Pawn extends Piece {

    public Pawn(ChessBoard chessBoard, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        super(chessBoard, xCoordinate, yCoordinate, pieceColor);
    }

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    public boolean specialCondition(PieceColor color, int x, int y) {
        return (color == PieceColor.WHITE && x >= 1 || color == PieceColor.BLACK && x <= 6);
    }

    boolean checkTwoPositions(int color) {
        if ((color > 0 && this.getXCoordinate() != 1) || (color < 0 && this.getXCoordinate() != 6)) {
            return false;
        }
        return chessBoard.isFree(getXCoordinate() + 1 * color, getYCoordinate()) &&
                chessBoard.isFree(getXCoordinate() + 2 * color, getYCoordinate());
    }

    /**
     * Pawn has maximum 4 valid moves
     */
    @Override
    protected void generateMoves() {
        if (isCaptured) {
            return;
        }

        this.possibleMoves.clear();
        int color = (pieceColor == PieceColor.WHITE) ? 1 : -1;

        // check if can move 2 positions or at least one
        if (checkTwoPositions(color)) {
            this.possibleMoves.add(new Coordinates(getXCoordinate() + 2 * color, getYCoordinate()));
            this.possibleMoves.add(new Coordinates(getXCoordinate() + 1 * color, getYCoordinate()));

        } else if (chessBoard.isFree(getXCoordinate() + 1 * color, getYCoordinate())) {
            this.possibleMoves.add(new Coordinates(getXCoordinate() + 1 * color, getYCoordinate()));
        }

        if (!chessBoard.isFree(getXCoordinate() + 1 * color, getYCoordinate() + 1)) {
            this.possibleMoves.add(new Coordinates(getXCoordinate() + 1 * color, getYCoordinate() + 1));
        }

        if (!chessBoard.isFree(getXCoordinate() + 1 * color, getYCoordinate() - 1)) {
            this.possibleMoves.add(new Coordinates(getXCoordinate() + 1 * color, getYCoordinate() - 1));
        }
        // System.out.println(possibleMoves);
    }

    // manual verification if the move is valid
//    public void Move(MovementType movementType, int newX, int newY) {
//
//        int color = (pieceColor == PieceColor.WHITE) ? 1 : -1;
//
//        if (chessBoard.IsLegalBoardPosition(newX, newY)) {
//            if (movementType == MovementType.MOVE &&
//                    this.getYCoordinate() == newY &&
//                    chessBoard.isFree(newX, newY)) {
//
//                int testMove = (newX - getXCoordinate()) * color;
//                switch (testMove) {
//                    case 1:
//                        this.setXCoordinate(newX);
//                        break;
//                    case 2:
//                        if (chessBoard.isFree(getXCoordinate() + 1, getYCoordinate()) &&
//                                (this.getXCoordinate() == 1 && pieceColor == PieceColor.WHITE) ||
//                                this.getXCoordinate() == 6 && pieceColor == PieceColor.BLACK) {
//
//                            this.setXCoordinate(newX);
//                        }
//                        break;
//                    default:
//                        //  throw new IllegalPawnMoveException("Pawn can't be moved more than 2 positions and less than 1");
//                }
//            } else if (movementType == MovementType.CAPTURE &&
//                    (newY == this.getYCoordinate() - 1 || newY == this.getYCoordinate() + 1) &&
//                    newX == getXCoordinate() + color &&
//                    !chessBoard.isFree(newX, newY)) {
//
//                this.setXCoordinate(newX);
//                this.setYCoordinate(newY);
//            }
//        }
//    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
//        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
        return "Current X: " + xCoordinate + " Current Y: " + yCoordinate + " Piece Color: " + pieceColor.toString();
    }
}

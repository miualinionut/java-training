package clean.code.chess.requirements;

import java.util.ArrayList;
import java.util.List;

public interface Diagonally {

    default List<Coordinates> generateMovesDiagonally(ChessBoard chessBoard, Coordinates coordinates) {
        List<Coordinates> possibleMoves = new ArrayList<>();

        Coordinates testMoveUpRight = coordinates;
        Coordinates testMoveUpLeft = coordinates;
        Coordinates testMoveDownRight = coordinates;
        Coordinates testMoveDownLeft = coordinates;
        boolean isDoneUpRight = false;
        boolean isDoneUpLeft = false;
        boolean isDoneDownRight = false;
        boolean isDoneDownLeft = false;

        do {
            testMoveUpRight.setXY(testMoveUpRight.getX() - 1, testMoveUpRight.getY() + 1);
            testMoveUpLeft.setXY(testMoveUpLeft.getX() - 1, testMoveUpLeft.getY() - 1);
            testMoveDownRight.setXY(testMoveDownRight.getX() + 1, testMoveDownRight.getY() + 1);
            testMoveDownLeft.setXY(testMoveDownLeft.getX() + 1, testMoveDownLeft.getY() - 1);

            if (!chessBoard.IsLegalBoardPosition(testMoveUpRight)) {
                isDoneUpRight = true;
            } else {
                possibleMoves.add(testMoveUpRight);
            }
            if (!chessBoard.IsLegalBoardPosition(testMoveUpLeft)) {
                isDoneUpLeft = true;
            } else {
                possibleMoves.add(testMoveUpLeft);
            }
            if (!chessBoard.IsLegalBoardPosition(testMoveDownRight)) {
                isDoneDownRight = true;
            } else {
                possibleMoves.add(testMoveDownRight);
            }
            if (!chessBoard.IsLegalBoardPosition(testMoveDownLeft)) {
                isDoneDownLeft = true;
            } else {
                possibleMoves.add(testMoveDownLeft);
            }

//            if (!isDoneUpRight) {
//                isDoneUpRight = checkPath();
//            }
//            if (!isDoneUpLeft) {
//                isDoneUpLeft = checkPath();
//            }
//
//            if (!isDoneDownRight) {
//                isDoneDownRight = checkPath();
//            }
//
//            if (!isDoneDownLeft) {
//                isDoneDownLeft = checkPath();
//            }

        } while (!isDoneUpRight || !isDoneUpLeft || !isDoneDownRight || !isDoneDownLeft);
        return possibleMoves;
    }

//    default boolean checkPath() {
//
//        return true;
//    }
}

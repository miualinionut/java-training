package clean.code.chess.requirements;

import java.util.ArrayList;
import java.util.List;

public interface Sliding {

    default List<Coordinates> generateMovesSliding(ChessBoard chessBoard, Coordinates coordinates) {
        List<Coordinates> possibleMoves = new ArrayList<>();

        Coordinates testMoveUp = coordinates;
        Coordinates testMoveDown = coordinates;
        Coordinates testMoveLeft = coordinates;
        Coordinates testMoveRight = coordinates;
        boolean isDoneUp = false;
        boolean isDoneDown = false;
        boolean isDoneLeft = false;
        boolean isDoneRight = false;

        do {
            testMoveUp.setXY(testMoveUp.getX() - 1, testMoveUp.getY());
            testMoveDown.setXY(testMoveDown.getX() + 1, testMoveDown.getY());
            testMoveLeft.setXY(testMoveLeft.getX(), testMoveLeft.getY() - 1);
            testMoveRight.setXY(testMoveRight.getX(), testMoveRight.getY() + 1);

            if (!chessBoard.IsLegalBoardPosition(testMoveUp)) {
                isDoneUp = true;
            } else {
                possibleMoves.add(testMoveUp);
            }
            if (!chessBoard.IsLegalBoardPosition(testMoveDown)) {
                isDoneDown = true;
            } else {
                possibleMoves.add(testMoveDown);
            }
            if (!chessBoard.IsLegalBoardPosition(testMoveLeft)) {
                isDoneLeft = true;
            } else {
                possibleMoves.add(testMoveLeft);
            }
            if (!chessBoard.IsLegalBoardPosition(testMoveRight)) {
                isDoneRight = true;
            } else {
                possibleMoves.add(testMoveRight);
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

        } while (!isDoneUp || !isDoneDown || !isDoneLeft || !isDoneRight);
        return possibleMoves;
    }

//    default boolean checkPath() {
//
//        return true;
//    }
}

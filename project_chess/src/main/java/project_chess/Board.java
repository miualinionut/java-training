package project_chess;

import project_chess.pieces.*;

public class Board {
    private static final int BLACK = 0;
    private static final int WHITE = 1;

    private final Piece[][] chessBoard;

    public Board(int xDimension, int yDimension) {
        chessBoard = new Piece[xDimension][yDimension];
    }

    public boolean isInBounds(int xPosition, int yPosition) {
        return xPosition < getXDimension() && xPosition >= 0 && yPosition < getYDimension() && yPosition >= 0;
    }

    public Piece pieceAt(int xPosition, int yPosition) {
        if (isInBounds(xPosition, yPosition)) {
            return chessBoard[xPosition][yPosition];
        }
        return null;
    }

    public void displayBoard() {
        System.out.format("%20s", "BLACK\n");
        for (int xBoard = -1; xBoard < getXDimension(); xBoard++) {
            for (int yBoard = -1; yBoard < getYDimension(); yBoard++) {
                if (xBoard == -1 && yBoard == -1) {
                    System.out.print("   ");
                }
                else if (xBoard == -1 ) {
                    if (yBoard == 0) {
                        System.out.print(" １ ");
                    }
                    else if (yBoard == 1) {
                        System.out.print(" ２ ");
                    }
                    else if (yBoard == 2) {
                        System.out.print(" ３ ");
                    }
                    else if (yBoard == 3) {
                        System.out.print(" ４ ");
                    }
                    else if (yBoard == 4) {
                        System.out.print(" ５ ");
                    }
                    else if (yBoard == 5) {
                        System.out.print(" ６ ");
                    }
                    else if (yBoard == 6) {
                        System.out.print(" ７ ");
                    }
                    else if (yBoard == 7) {
                        System.out.print(" ８ ");
                    }
                }
                else if (yBoard == -1) {
                    if (xBoard == 0) {
                        System.out.print(" １ ");
                    }
                    else if (xBoard == 1) {
                        System.out.print(" ２ ");
                    }
                    else if (xBoard == 2) {
                        System.out.print(" ３ ");
                    }
                    else if (xBoard == 3) {
                        System.out.print(" ４ ");
                    }
                    else if (xBoard == 4) {
                        System.out.print(" ５ ");
                    }
                    else if (xBoard == 5) {
                        System.out.print(" ６ ");
                    }
                    else if (xBoard == 6) {
                        System.out.print(" ７ ");
                    }
                    else if (xBoard == 7) {
                        System.out.print(" ８ ");
                    }
                }
                else if (chessBoard[xBoard][yBoard] == null) {
                    System.out.print("   ");
                }
                else if (chessBoard[xBoard][yBoard].getColor() == BLACK) {
                    if (chessBoard[xBoard][yBoard] instanceof Pawn) {
                        System.out.print(" ♟ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Knight) {
                        System.out.print(" ♞ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Queen) {
                        System.out.print(" ♛ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof King) {
                        System.out.print(" ♚ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Rook) {
                        System.out.print(" ♜ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Bishop) {
                        System.out.print(" ♝ ");
                    }
                    else
                        System.out.print(" X ");
                }
                else if (chessBoard[xBoard][yBoard].getColor() == WHITE) {
                    if (chessBoard[xBoard][yBoard] instanceof Pawn) {
                        System.out.print(" ♙ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Knight) {
                        System.out.print(" ♘ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Queen) {
                        System.out.print(" ♕ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof King) {
                        System.out.print(" ♔ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Rook) {
                        System.out.print(" ♖ ");
                    }
                    else if (chessBoard[xBoard][yBoard] instanceof Bishop) {
                        System.out.print(" ♗ ");
                    }
                    else
                        System.out.print(" X ");
                }
            }
            System.out.println();
        }
        System.out.format("%20s", "WHITE\n");
        System.out.println();
    }

    public int getXDimension() {
        return chessBoard[0].length;
    }

    public int getYDimension() {
        return chessBoard[1].length;
    }

    public void removeFromBoard(Piece removePiece) {
        int oldXLocation = removePiece.getXLocation();
        int oldYLocation = removePiece.getYLocation();

        chessBoard[oldXLocation][oldYLocation] = null;
    }

    public void placePiece(Piece chessPiece, int xPosition, int yPosition) {
        if (isInBounds(xPosition, yPosition)) {
            chessBoard[xPosition][yPosition] = chessPiece;
        }
    }
}

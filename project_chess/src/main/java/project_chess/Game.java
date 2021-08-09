package project_chess;

import project_chess.pieces.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static final int BLACK = 0;
    public static final int WHITE = 1;
    Scanner userInput = new Scanner(System.in);
    boolean continueGame = true;

    private int currentPlayer;
    private final Board chessBoard;
    private King blackKing;
    private King whiteKing;

    public Game() {
        chessBoard = new Board(8,8);
    }

    public void initialSetup() {
        // Black pieces
        this.addRook(BLACK, 0, 0);
        this.addKnight(BLACK, 0, 1);
        this.addBishop(BLACK, 0, 2);
        this.addQueen(BLACK, 0, 3);
        this.addKing(BLACK, 0, 4);
        this.addBishop(BLACK, 0, 5);
        this.addKnight(BLACK, 0, 6);
        this.addRook(BLACK, 0, 7);
//        this.addPawn(BLACK, 1, 0);
//        this.addPawn(BLACK, 1, 1);
//        this.addPawn(BLACK, 1, 2);
//        this.addPawn(BLACK, 1, 3);
//        this.addPawn(BLACK, 1, 4);
//        this.addPawn(BLACK, 1, 5);
//        this.addPawn(BLACK, 1, 6);
//        this.addPawn(BLACK, 1, 7);

        // White pieces
        this.addRook(WHITE, 7, 0);
        this.addKnight(WHITE, 7, 1);
        this.addBishop(WHITE, 7, 2);
        this.addQueen(WHITE, 7, 3);
        this.addKing(WHITE, 7, 4);
        this.addBishop(WHITE, 7, 5);
        this.addKnight(WHITE, 7, 6);
        this.addRook(WHITE, 7, 7);
//        this.addPawn(WHITE, 6, 0);
//        this.addPawn(WHITE, 6, 1);
//        this.addPawn(WHITE, 6, 2);
//        this.addPawn(WHITE, 6, 3);
//        this.addPawn(WHITE, 6, 4);
//        this.addPawn(WHITE, 6, 5);
//        this.addPawn(WHITE, 6, 6);
//        this.addPawn(WHITE, 6, 7);
    }

    public void gameLoop() {
        initialSetup();

        System.out.println("Choose your color:");
        System.out.println("1 - BLACK");
        System.out.println("2 - WHITE");
        System.out.print("");
        int playerChoice = userInput.nextInt();

        if (playerChoice == 1) {
            setPlayer(BLACK);
        }
        else if (playerChoice == 2){
            setPlayer(WHITE);
        }
        else {
            System.out.println("Invalid Input\n");
            gameLoop();
        }

        while(continueGame) {
            chessBoard.displayBoard();

            try {
                System.out.println("Which piece to move? " + getPlayerTurn() + " TURN");
                System.out.print("X: ");
                int nextX = userInput.nextInt() - 1;
                System.out.print("Y: ");
                int nextY = userInput.nextInt() - 1;

                Piece target = chessBoard.pieceAt(nextX, nextY);
                if (target == null) {
                    System.out.println("That location is invalid!\n");
                } else if (target.getColor() != currentPlayer) {
                    System.out.println("That is not your piece!\n");
                } else {
                    System.out.println("Where to move this piece?");
                    System.out.print("X: ");
                    nextX = userInput.nextInt() - 1;
                    System.out.print("Y: ");
                    nextY = userInput.nextInt() - 1;

                    if (target.canMoveTo(nextX, nextY)) {
                        if (chessBoard.pieceAt(nextX, nextY) == whiteKing || chessBoard.pieceAt(nextX, nextY) == blackKing) {
                            System.out.println("CHECKMATE");
                            System.out.println(getPlayerTurn() + " IS THE WINNER!");
                            break;
                        }

                        target.moveTo(nextX, nextY);
                        switchPlayerTurn();
                    } else {
                        System.out.println("Cannot move there!\n");
                    }
                }
            } catch (InputMismatchException err) {
                if (userInput.next().equalsIgnoreCase("exit")) {
                    continueGame = false;
                    System.out.println("EXIT GAME");
                }
                else {
                    System.out.println("Invalid input!\n");
                }
            }
        }
    }

    public void switchPlayerTurn() {
        if (currentPlayer == WHITE)
            currentPlayer = BLACK;
        else currentPlayer = WHITE;
    }

    public void addKing(int color, int xLocation, int yLocation) {
        King king = new King(chessBoard, color, xLocation, yLocation);
        if (color == BLACK)
            blackKing = king;
        else
            whiteKing = king;
    }

    public void addQueen(int color, int xLocation, int yLocation) {
        new Queen(chessBoard, color, xLocation, yLocation);
    }

    public void addKnight(int color, int xLocation, int yLocation) {
        new Knight(chessBoard, color, xLocation, yLocation);
    }

    public void addRook(int color, int xLocation, int yLocation) {
        new Rook(chessBoard, color, xLocation, yLocation);
    }

    public void addBishop(int color, int xLocation, int yLocation ) {
        new Bishop(chessBoard, color, xLocation, yLocation);
    }

    public void addPawn(int color, int xLocation, int yLocation) {
        new Pawn(chessBoard, color, xLocation, yLocation);
    }

    public String getPlayerTurn() {
        if (currentPlayer == BLACK)
            return "BLACK";
        else
            return "WHITE";
    }

    public void setPlayer(int player) {
        currentPlayer = player;
    }
}

import clean.code.chess.solution.pieces.Pawn;

import java.util.ArrayList;

public class Player {
    public final int PAWNS = 8;
    public final int BISHOPS = 2;
    public final int ROOKS = 2;
    public boolean white;

    private List<Piece> pieces = new ArrayList<>();

    public Player(boolean white) {
        super();
        this.white = white;
    }

    public List<Piece> getPieces() {
        return pieces;
    }


    public void initializePieces(){
        if(this.white == true){
            for(int i=0; i<PAWNS; i++){ // draw pawns
                pieces.add(new Pawn(true,i,2));
            }
            pieces.add(new Rook(true, 0, 0));
            pieces.add(new Rook(true, 7, 0));
            pieces.add(new Bishop(true, 2, 0));
            pieces.add(new Bishop(true, 5, 0));
            pieces.add(new Knight(true, 1, 0));
            pieces.add(new Knight(true, 6, 0));
            pieces.add(new Queen(true, 3, 0));
            pieces.add(new King(true, 4, 0));
        }
        else{
            for(int i=0; i<PAWNS; i++){ // draw pawns
                pieces.add(new Pawn(true,i,6));
            }
            pieces.add(new Rook(true, 0, 7));
            pieces.add(new Rook(true, 7, 7));
            pieces.add(new Bishop(true, 2, 7));
            pieces.add(new Bishop(true, 5, 7));
            pieces.add(new Knight(true, 1, 7));
            pieces.add(new Knight(true, 6, 7));
            pieces.add(new Queen(true, 3, 7));
            pieces.add(new King(true, 4, 7));
        }

    }
}
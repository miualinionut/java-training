package clean.code.chess.requirements;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    private  Validator Validator;
    private  Map<Pozitie, Pawn> dict_poz_piesa;
    private  Map<Pawn, Pozitie> dict_piesa_poz;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
        this.Validator = new Validator();
        this.dict_piesa_poz = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);
        this.dict_poz_piesa = new HashMap<>(MAX_BOARD_WIDTH * MAX_BOARD_HEIGHT);

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(Validator.rand_valid_pawn(xCoordinate, pawn.getPieceColor())){
            Pozitie pozitie_noua = this.creeaza_pozitie_noua(xCoordinate, yCoordinate);


            this.dict_poz_piesa.put(pozitie_noua, pawn);
            this.dict_piesa_poz.put(pawn, pozitie_noua);

            pawn.setChessBoard(ChessBoard.this);

            pawn.setXCoordinate(pozitie_noua.getCoordonata_x());
            pawn.setYCoordinate(pozitie_noua.getCoordonata_y());
        }
        else{
            Pozitie pozitie_noua = this.creeaza_pozitie_noua(-1, -1);

            this.dict_poz_piesa.put(pozitie_noua, pawn);
            this.dict_piesa_poz.put(pawn, pozitie_noua);

            pawn.setXCoordinate(pozitie_noua.getCoordonata_x());
            pawn.setYCoordinate(pozitie_noua.getCoordonata_y());

        }
    }

    public void Update(Pawn pawn, int coordonata_x, int coordonata_y){
        Pozitie pozitie_veche = this.dict_piesa_poz.get(pawn);
        this.dict_poz_piesa.put(pozitie_veche, null);
        Pozitie pozitie_noua = new Pozitie(coordonata_x, coordonata_y);
        this.dict_poz_piesa.put(pozitie_noua, pawn);
        this.dict_piesa_poz.put(pawn, pozitie_noua);

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(!Validator.valideaza_pozitii(xCoordinate, yCoordinate))
            return false;
        return Validator.validare_pozitii_libere(xCoordinate, yCoordinate);
    }

    private Pozitie creeaza_pozitie_noua(int coordonata_x, int coordonata_y){
        if(Validator.validare_pozitii_libere(coordonata_x, coordonata_y)){
            return new Pozitie(coordonata_x, coordonata_y);
        }
        return new Pozitie(-1, -1);

    }

    private class Validator{
        public  boolean valideaza_pozitii(int coordonata_X, int coordonataa_y){
            if(coordonata_X > 7 || coordonata_X < 0)
                return false;
            return coordonataa_y <= 7 && coordonataa_y >= 0;
        }

        public boolean validare_pozitii_libere(int coordonata_x, int coordonata_y){
            return dict_poz_piesa.get(new Pozitie(coordonata_x, coordonata_y)) == null;
        }
        public boolean rand_valid_pawn(int coordonata_x, PieceColor color){
            if(color == PieceColor.BLACK){
                return coordonata_x == 6;
            }
            else if(color == PieceColor.WHITE){
                return coordonata_x == 1;
            }
            return false;
        }

}
}

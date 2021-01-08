package factory;

import cards.Card;
import cards.CardBCR;
import cards.CardBRD;
import cards.CardING;
import cards.CardRaiffaisen;

public class CardFactory {

    public static CardFactory instance = null;

    public CardFactory() { }

    public static CardFactory getInstance() {
        if(instance == null) {
            instance = new CardFactory();
        }

        return instance;
    }

    public Card getCard(String bankName, String ownerName, String password) {

        if(bankName.equals("BCR"))
            return new CardBCR(ownerName, password);

        if(bankName.equals("BRD"))
            return new CardBRD(ownerName, password);

        if(bankName.equals("ING"))
            return new CardING(ownerName, password);

        if(bankName.equals("Raiffaisen"))
            return new CardRaiffaisen(ownerName, password);


        return null;
    }

}

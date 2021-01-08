package profile;

import cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Card> cardList = new ArrayList<>();
    private String ownerName;
    private String birthDate;
    private String gender;
    public int id;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    public void removeCard(Card card) {
        cardList.remove(card);
    }

    public Card getCard(int id) {

        return cardList.get(id);

    }

    public int size() {
        return cardList.size();
    }

    public void show() {
        System.out.println("Account #" + id);
        System.out.println();
        System.out.println("Owner: " + ownerName);
        System.out.println("BirthDate: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println();
        cardList.forEach(System.out::println);
    }
}

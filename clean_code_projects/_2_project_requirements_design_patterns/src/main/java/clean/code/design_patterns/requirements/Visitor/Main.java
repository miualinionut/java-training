package clean.code.design_patterns.requirements.Visitor;

import java.util.ArrayList;

public class Main {

    // Design pattern-ul VISITOR este unul de tip Behavioral, care ne permite sa efectuam operatii pe mai multe obiecte dintr-o structura de date, fara ca noi sa schimbam clasele pe care vrem sa facem operatii(doar adaugam functia accept)
    // Sunt 3 tipuri de obiecte care pot fi "vizitate"(vazute in cazul de aici) de clientul nostru: carti, jocuri si DVD-uri
    // Cartile au reducere doar daca sunt scrie de autorul Trian Tracy
    // Dvd-urile au reducere de 5% doar daca sunt mai scumpe de 100 de lei
    // Jocurile au reducere de 5% doar daca e perioada de reduceri
    // cand un vizitator(client) viiziteaza un obiect, acesta primeste detalii referitoare la produsul respectiv, precum si daca e la reducere sau nu

    public static void main(String[] args) {
        Book book1 = new Book("Start with what you don't like!","Brian Tracy",30);
        Book book2 = new Book("Franey and Zooey","J. Salinger",28);
        Boardgame boardgame1 = new Boardgame("Catan",7,120);
        Boardgame boardgame2 = new Boardgame("Monopoly",8,200);
        boardgame2.setDiscountPeriod(true);
        DVD dvd1 = new DVD("Traveling in Europe","travel",89);
        DVD dvd2 = new DVD("Learn Spanish in 7 days","learning",123);

        ArrayList<Element> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(boardgame1);
        list.add(boardgame2);
        list.add(dvd1);
        list.add(dvd2);

        Buyer buyer = new Buyer();

        for(Element item : list){
            item.accept(buyer);
        }

    }
}

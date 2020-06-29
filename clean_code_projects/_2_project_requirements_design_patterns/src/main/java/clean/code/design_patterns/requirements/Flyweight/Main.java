package clean.code.design_patterns.requirements.Flyweight;

public class Main {

    public static void main(String[] args) {

        // Avem de plantat o multime de flori de mai multe tipuri si culori la anumite locatii, (x,y).
        // Ei bine, e clar ca in descrierea fiecarei flori pe care o vom stoca se vor repeta atributele culoare si tip,
        // pe cand celelalte 2 atribute x si y vor fi diferite de la floare la floare, ceea ce va ocupa foarte multa memorie in cazul in care trebuie sa plantam multe flori.
        // Asa ca, design pattern-ul FLYWEIGHT are rolul de a eficientiza modul cum alocam memoria pt aceste flori:
        // Am salvat intr-o clasa imutabila "flyweight" campurile culoare si tip, pe care le vom reutiliza pentru a crea noi flori.
        // Daca floarea pe care vrem sa o creem are deja tipul si culoarea stocate in FlowerFactory, atunci le vom reutiliza, iar daca nu, le vom salva si pe ele noi


        FlowerFactory.create("lalea","roz");
        FlowerFactory.create("trandafir","rosu");
        FlowerFactory.create("lalea","alba");

        SpecificFlower flower1 = new SpecificFlower(FlowerFactory.flowersCache.get(0),  12,3); //obtinem o lalea roz la pozitia (12,3)
        SpecificFlower flower2 = new SpecificFlower(FlowerFactory.flowersCache.get(1), 15,32); // obtinem un trandafir rosu la pozitia(15,32)

        flower1.plant();
        flower2.plant();

        Garden garden = new Garden();
        garden.plantFlower("crin","portocaliu",34,56);
        garden.plantFlower("ghiocel","alb",67,87);

    }
}

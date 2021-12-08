package clean.code.chess.requirements;

import java.util.Objects;

public class Pozitie {
    public int getCoordonata_x() {
        return coordonata_x;
    }

    private final int coordonata_x;

    public int getCoordonata_y() {
        return coordonata_y;
    }

    private final int coordonata_y;

    public Pozitie(int coordonata_x, int coordonata_y) {
        this.coordonata_x = coordonata_x;
        this.coordonata_y = coordonata_y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pozitie pozitie = (Pozitie) o;
        return coordonata_x == pozitie.coordonata_x && coordonata_y == pozitie.coordonata_y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordonata_x, coordonata_y);
    }
}

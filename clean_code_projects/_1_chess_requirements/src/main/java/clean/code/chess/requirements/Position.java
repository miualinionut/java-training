package clean.code.chess.requirements;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Position) {
            Position l = (Position) o;
            return (x == l.getX() &&
                    y == l.getY());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

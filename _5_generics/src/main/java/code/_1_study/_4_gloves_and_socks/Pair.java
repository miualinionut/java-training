package code._1_study._4_gloves_and_socks;

public class Pair<T extends ClothingItem> {
    T left;
    T right;

    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
        match(left, right);
    }

    private void match(T left, T right) {
        if (left.getSize() != right.getSize()) throw new PairDoesNotMatch("sizes do not match");
        if (!left.getColor().equalsIgnoreCase(right.getColor())) throw new PairDoesNotMatch("colors do not match");
    }
}
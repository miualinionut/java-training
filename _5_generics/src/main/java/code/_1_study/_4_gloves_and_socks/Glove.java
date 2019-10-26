package code._1_study._4_gloves_and_socks;

public class Glove implements ClothingItem {
        private int size;
        private String color;

        public Glove(int size, String color) {
            this.size = size;
            this.color = color;
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Glove{" +
                    "size=" + size +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
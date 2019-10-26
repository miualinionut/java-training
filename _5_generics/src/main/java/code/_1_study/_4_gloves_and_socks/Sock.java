package code._1_study._4_gloves_and_socks;

public class Sock implements ClothingItem {
        private int size;
        private String color;

        public Sock(int size, String color) {
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
            return "Sock{" +
                    "size=" + size +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
package code._4_student_effort._4_generic_iterator;

public class ArrayIterator<T> implements IArrayIterator<T> {
        private T[] arr;
        private int currentIndex = 0;
        public ArrayIterator(T[] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < arr.length;
        }

        @Override
        public T next() {
            return arr[currentIndex++];
        }
    }
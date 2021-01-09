package clean.code.design_patterns.requirements;

public class Iterator<T> {
    private T[] arr;
    private int currIndex = 0;

    /**Constructor for the iterator
     *
     * @param arr a generic array, used in the iteration process
     */

    public Iterator(T[] arr){
        this.arr = arr;
    }

    /**Checking if the array has a next element
     *
     * @return a boolean, telling us if the array has reached its end or not
     */

    public boolean hasNext(){
        return currIndex < arr.length;
    }

    /**Getting the next element of the array of the iterator
     *
     * @return the next element in the iterator array
     */

    public T next(){
        return arr[currIndex++];
    }
}

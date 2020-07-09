package code._4_student_effort.Challenge9;

import java.util.Arrays;

public class MySetImpl<T> implements MySet<T> {
    private  Object[] array;
    private int nrOfElements;

    public MySetImpl(int dimension){
        array = new Object[dimension];
        nrOfElements = 0;
    }

    public MySetImpl() {
        array = new Object[1];
        nrOfElements = 0;
    }

    @Override
    public void add(T e) {
       if(!this.contains(e)){
           if(nrOfElements == array.length)
               array = Arrays.copyOf(array, array.length * 2);
           array[nrOfElements++] = e;
       }
    }

    @Override
    public void remove(T e) {
        int index = -1;
        int j = 0;
        Object[] listaNoua = new Object[array.length - 1];
        for(int i = 0; i < nrOfElements; i++){
            if(e.equals(array[i]))
                index = i;
            else {
                listaNoua[j++] = array[i];
            }

        }
        if(index == -1) System.out.println("Nu exista elementul cu valoarea " + e + "in lista!");

        array = listaNoua;
        nrOfElements = j;
    }

    @Override
    public T get(int index) {
        try {
            if(index > nrOfElements) throw new Exception("Indexul " + index + " nu este in limita valorilor acceptate");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)array[index];
    }

    @Override
    public void set(int index, T e) {
        if(!contains(e)){
            if(index < nrOfElements) array[index] = e;
            else System.out.println("Indexul " + index + " nu este in limita valorilor acceptate");
        }
    }

    @Override
    public int size() {
        return nrOfElements;
    }

    @Override
    public boolean contains(T e) {
        for(int i = 0; i < nrOfElements; i++){
            if(e.equals(array[i]))
                return true;
        }
        return false;
    }
}

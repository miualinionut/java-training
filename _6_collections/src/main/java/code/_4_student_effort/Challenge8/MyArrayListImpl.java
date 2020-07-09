package code._4_student_effort.Challenge8;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList <T>{
    private  Object[] array = new Object[0];
    private int nrOfElements;

    public MyArrayListImpl(int dimension){
        array = new Object[dimension];
        nrOfElements = 0;
    }

    @Override
    public void add(T e) {
        if(nrOfElements == array.length)
            array = Arrays.copyOf(array, array.length * 2);
        array[nrOfElements++] = e;
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
        if(index < nrOfElements) array[index] = e;
        else System.out.println("Indexul " + index + " nu este in limita valorilor acceptate");
    }

    @Override
    public int size() {
        return nrOfElements;
    }
}

package code._3_in_class.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Integer> list=new ArrayList<>();

        System.out.print("Integer[] = ");
        Integer [] intregi =new Integer[]{1,2,3,};

        for(Integer intreg:intregi){
            System.out.print(intreg + " ");
        }

        System.out.print("\nMyIterableCollection = ");
        MyIterableCollection myIterableCollectiontion= new MyIterableCollection(intregi);
        for(Object intreg:myIterableCollectiontion){

            System.out.print(intreg + " ");
        }

        MyIterator myIterator =new MyIterator(intregi);
        while(myIterator.hasNext()){

            Object currentElement=myIterator.next();
            System.out.println(currentElement);

        }

    }

      static class MyIterableCollection implements Iterable{
         private Integer[] intregi;

          public MyIterableCollection(Integer[] intregi) {
              this.intregi = intregi;
          }
          @Override
          public Iterator iterator() {
              return new MyIterator(this.intregi);
          }
      }
      static class MyIterator implements Iterator {

        private static Integer[] intregi =new Integer[]{};
        private static Integer currentIndex =0;

          public MyIterator(Integer[] intregi) {
              this.intregi = intregi;
          }

          @Override
        public boolean hasNext() {
            return intregi.length>currentIndex;
        }
        @Override
        public  Object next() {
            return intregi[currentIndex++];
        }
    }
}

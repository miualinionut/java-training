package code._3_in_class;

import java.util.Stack;

public class Sample<E> {
    Stack<E> ob=new Stack<E>();
    public void push(E obj){
        ob.push(obj);
    }
    public E pop(){
        E obj=ob.pop();
        return obj;
    }
}

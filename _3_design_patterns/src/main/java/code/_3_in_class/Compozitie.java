package code._3_in_class;

import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;

public class Compozitie {

    public static void main(String[] args) {
        Bunic bunic = new Bunic();
        Visitable[] arrIterator = bunic.toArray();
        Visitor consoleVisitor = new ConsoleVisitorToUpperCase();
        for(Visitable o: arrIterator) {
            consoleVisitor.visit(o);
        }
    }

}

class ConsoleVisitorToUpperCase implements Visitor {

    @Override
    public void visit(Visitable visitable) {
        System.out.println(visitable.toString().toUpperCase());
    }
}

class ConsoleVisitor implements Visitor {

    @Override
    public void visit(Visitable visitable) {
        System.out.println(visitable.toString());
    }
}

interface Visitable {
    default void accept(Visitor visitor){
        this.accept(visitor);
    }
}
interface Visitor {
    void visit(Visitable visitable);
}

class Bunic {
    Parinte parinte = new Parinte();
    Visitable[] toArray() {
        Visitable[] arr = new Visitable[3];
//        arr[0]= this;
//        arr[1]= this.parinte;
//        arr[2] = this.parinte.copil;
        return arr;
    }

    @Override
    public String toString() {
        return "Bunic";
    }
}
class Parinte {
    Copil copil = new Copil();
    @Override
    public String toString() {
        return "Parinte";
    }
}
class Copil {
    @Override
    public String toString() {
        return "Copil";
    }
}
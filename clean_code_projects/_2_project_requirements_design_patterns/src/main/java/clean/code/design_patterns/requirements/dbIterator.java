package clean.code.design_patterns.requirements;

import java.util.Iterator;
import java.util.List;

public class dbIterator implements Iterator<jucatorFotbal> {
    private List<jucatorFotbal> list;
    private int currentIndex;

    public dbIterator(List<jucatorFotbal> listJucatori) {
        this.list = listJucatori;
        this.currentIndex = 0;
    }
    public boolean hasNext() { return this.currentIndex < list.size(); }

    public jucatorFotbal next() {
        jucatorFotbal jucator =  this.list.get(currentIndex);
        this.currentIndex += 1;
        return jucator;
    }
}

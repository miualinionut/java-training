package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi {
    private List<Cafea> cafeaList;

    public CosCumparaturi() {
        this.cafeaList = new ArrayList<>();
    }

    public List<Cafea> getCafeaList() {
        return cafeaList;
    }

    public void setCafeaList(List<Cafea> cafeaList) {
        this.cafeaList = cafeaList;
    }

    public void adaugaProdusDeCumparat(Cafea cafeaDeCumparat) {
        this.cafeaList.add(cafeaDeCumparat);
    }

    @Override
    public String toString() {
        return "CosCumparaturi{" +
                "cafeaList=" + cafeaList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CosCumparaturi that = (CosCumparaturi) o;

        return cafeaList != null ? cafeaList.equals(that.cafeaList) : that.cafeaList == null;
    }

    @Override
    public int hashCode() {
        return cafeaList != null ? cafeaList.hashCode() : 0;
    }
}

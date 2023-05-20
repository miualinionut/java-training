package clean.code.design_patterns.requirements;

public class SortDescendent implements ISortOrder{
    @Override
    public boolean isAscending(Autobuz a01, Autobuz a02) {
        return a01.getOra_start_tura().compareTo(a02.getOra_start_tura())<=0;
    }
}

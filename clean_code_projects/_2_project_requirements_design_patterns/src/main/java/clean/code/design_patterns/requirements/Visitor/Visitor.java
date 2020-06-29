package clean.code.design_patterns.requirements.Visitor;

public interface Visitor {
    void visit(Book book);
    void visit(DVD dvd);
    void visit(Boardgame boardgame);
}

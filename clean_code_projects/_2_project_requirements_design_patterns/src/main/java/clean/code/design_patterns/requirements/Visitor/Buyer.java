package clean.code.design_patterns.requirements.Visitor;

public class Buyer implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println("Book title: " + book.getTitle() + " |author: "+ book.getAuthor()+ " |price:"+ book.getRealPrice());
    }

    @Override
    public void visit(DVD dvd) {
        System.out.println("DVD title: " + dvd.getTitle()+ " |DVD type:  " + dvd.getType()+ " |price: " + dvd.getRealPrice());
    }

    @Override
    public void visit(Boardgame boardgame) {
        if(boardgame.getIsDiscountPeriod())
            System.out.println("Discounts for every boardgame! Just present this item at the cash register to get a 5% discount!");

        System.out.println("Boardgame title : "+ boardgame.getTitle()+ " |minim age to play: "+ boardgame.getMinimAge()+ " |price: "+ boardgame.getPrice());
    }
}

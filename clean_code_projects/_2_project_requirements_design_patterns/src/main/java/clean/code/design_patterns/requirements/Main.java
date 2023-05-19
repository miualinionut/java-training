package clean.code.design_patterns.requirements;


public class Main {

    public static void main(String[] args) {

        ShoppingList shoppingList=new ShoppingListBuilder()
                .addProduct("oua",1.09,5)
                .addProduct("lapte",10.99,2)
                .addProduct("iaurt",4.59,6)
                .addProduct("mere",6.99,20)
                .addProduct("pere",8.59,6)
                .addProduct("periuta de dinti",8.99,2)
                .build();

        System.out.println("Lista de cumparaturi initiala:");
        viewShoppingList(shoppingList);

        //remove products from list by name
        shoppingList.removeProduct("lapte");
        shoppingList.removeProduct("pere");
        System.out.println();


        System.out.println("Lista de cumparaturi actualizata:");
        viewShoppingList(shoppingList);


    }


    public static void viewShoppingList(ShoppingList shoppingList){
        MyIterator it=shoppingList.iterator();
        while (it.hasNext()){
            Product p=it.next();
            System.out.println("Produs: "+p.getName()+", Cantitate: "+p.getQuantity()+", Pret: "+p.getPrice()+" lei.");
        }


    }


}

package com.codeofDiane;

public class Main {

    public static void main(String[] args) {
	  FinalProductsBuilder productsBuilder = new FinalProductsBuilder();

      Product computerPC = productsBuilder.prepareProductPC();
        System.out.println("This is your PC");
        System.out.println("Total cost: " + computerPC.getFinalCost());

        Product laptop = productsBuilder.prepareProductLaptop();
        System.out.println("This is your laptop");
        System.out.println("Total cost: " + laptop.getFinalCost());
    }
}

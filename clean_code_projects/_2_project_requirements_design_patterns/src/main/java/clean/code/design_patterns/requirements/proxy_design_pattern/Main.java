package clean.code.design_patterns.requirements.proxy_design_pattern;

import clean.code.design_patterns.requirements.builder_design_pattern.Tax;

public class Main {

    public static void main(String[] args){
        Tax tax1 = new Tax.Builder(
                200,
                "intretinere",
                "10.10.2020",
                "10.11.2020")
                .isPaid(false)
                .additionalInfo("A se plati la caserie, miercurea intre orele 17 si 19")
                .build();

        Tax tax2 = new Tax.Builder(
                100,
                "intretinere",
                "10.10.2020",
                "10.11.2020")
                .isPaid(false)
                .additionalInfo("A se plati la caserie, miercurea intre orele 17 si 19")
                .build();

        Tax tax3 = new Tax.Builder(
                500,
                "intretinere",
                "10.10.2020",
                "10.11.2020")
                .isPaid(false)
                .additionalInfo("A se plati la caserie, miercurea intre orele 17 si 19")
                .build();


        ProxyUserRights proxy = new ProxyUserRights();
        proxy.addTax(tax1);
        proxy.addTax(tax2);
        proxy.addTax(tax3);


        User user1 = new User("Marcel", false);
        User admin = new User("Administrator", true);

        Tax[] taxes = proxy.getTaxes();
        for (Tax tax: taxes){
            System.out.println(tax.getSum());
        }

        proxy.changeValueOfTax(admin,tax1,1000);

        System.out.println("\n_______________________\n");


        for (Tax tax: taxes){
            System.out.println(tax.getSum());
        }

        System.out.println("\n_______________________\n");

        proxy.changeValueOfTax(user1,tax1,1000);


    }
}

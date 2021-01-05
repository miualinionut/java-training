package clean.code.design_patterns.requirements.NullObjectPattern;

public class OmMain {

    public static void main(String[] args) {

        OmAbstract customer1 = OmService.getOm("Cristi");
        OmAbstract customer2 = OmService.getOm("Bobita");
        OmAbstract customer3 = OmService.getOm("Ionut");
        OmAbstract customer4 = OmService.getOm("Joita");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}

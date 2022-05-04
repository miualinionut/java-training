package clean.code.design_patterns.requirements.decorator;

public class Main {
    public static void main(String[] args) {
        Mancare pizza = new Pizza();
        CondimenteMancare busuioc = new Busuioc(pizza);
        Mancare ananas = new Ananas(busuioc);

        System.out.println(ananas.getPret());
        System.out.println(ananas.getDescriere());

        Shaorma shaorma = new Shaorma();
        Ardei ardei = new Ardei(shaorma);
        Busuioc busuioc2 = new Busuioc(ardei);
        System.out.println(busuioc2.getPret());
        System.out.println(busuioc2.getDescriere());
    }
}

package clean.code.design_patterns.requirements;

    public class FactoryPatternDemo {

        public static void main(String[] args) {
            CakeFactory cakeFactory = new CakeFactory();

            //get an object of Circle and call its draw method.
            Cake cake1 = cakeFactory.getCake("ChocolateCake");


            cake1.make();

            Cake cake2 = cakeFactory.getCake("VanillaCake");


            cake2.make();

            //get an object of Square and call its draw method.
            Cake cake3 = cakeFactory.getCake("StrawberryCake");


            cake3.make();
        }
    }

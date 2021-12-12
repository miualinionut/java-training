package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        FastFood KFCBuzau = new KFC();
        KFCBuzau.buildfastfood();

        FastFood McDonaldsBuzau = new McDonalds();
        McDonaldsBuzau.buildfastfood();

        FastFood McDondaldsShoppingCityBuzau = new McDonalds();
        McDondaldsShoppingCityBuzau.buildfastfood();
    }
}

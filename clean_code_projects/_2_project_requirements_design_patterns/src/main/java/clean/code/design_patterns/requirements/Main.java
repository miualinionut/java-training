package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        FastFood KFCBuzau = new KFC();
        KFCBuzau.buildfastfood();

        FastFood McDonaldsBuzau = new McDonalds();
        McDonaldsBuzau.buildfastfood();

        FastFood McDondaldsShoppingCityBuzau = new McDonalds();
        McDondaldsShoppingCityBuzau.buildfastfood();


        Comanda comanda1 = new Comanda.UserBuilder(1,"13/12/2021" )

                .numeCasier("Turcuman George")
                .pachet(true)
                .pret(40)
                .meniu("2 * McFlurry, Chicken McGrill, Portie mica cartofi prajiti, sos dulce-acrisor, Cola mare")
                .build();
        comanda1.afisareBon();

        System.out.println(comanda1);

        Comanda comanda2 = new Comanda.UserBuilder(2, "14/12/2021")
                .numeCasier("Iancu Paloma")
                .pachet(false)
                .meniu("Smart Meniu, Dublu hot buster, tarta ciocolota, Sprite mediu")
                .pret(56)
                .build();
        comanda2.afisareBon();

        System.out.println(comanda2);

    }
}

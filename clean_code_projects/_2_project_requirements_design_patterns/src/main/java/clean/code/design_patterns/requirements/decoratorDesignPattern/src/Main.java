public class Main {
    public static void main(String[] args) {
        coffee cafeaSimpla = new cafeaSimpla();
        System.out.println("Pretul pentru o cafea simpla este: " + cafeaSimpla.getPrice() + " lei");

        coffee cafeaLapte = new cafeaLapte(new cafeaSimpla());
        System.out.println("Pretul pentru o cafea cu lapte este: " + cafeaLapte.getPrice()+ " lei");

        coffee cafeaFrisca = new cafeaFrisca(new cafeaSimpla());
        System.out.println("Pretul pentru o cafea cu frisca este: " + cafeaFrisca.getPrice()+ " lei");

        coffee cafeaOreo = new cafeaOreo(new cafeaSimpla());
        System.out.println("Pretul pentru o cafea cu oreo este: " + cafeaOreo.getPrice()+ " lei\n");

        coffee cafeaLapteFrisca = new cafeaLapte(new cafeaFrisca(new cafeaSimpla()));
        System.out.println("Pretul pentru o cafea cu lapte si frisca este de: " + cafeaLapteFrisca.getPrice()+ " lei");

        coffee cafeaLapteOreo = new cafeaLapte(new cafeaOreo(new cafeaSimpla()));
        System.out.println("Pretul pentru o cafea cu lapte si oreo este de: " + cafeaLapteOreo.getPrice()+ " lei");

        coffee cafeaFriscaOreo = new cafeaFrisca(new cafeaOreo(new cafeaSimpla()));
        System.out.println("Pretul pentru o cafea cu frisca si oreo este de: " + cafeaFriscaOreo.getPrice()+ " lei\n");

        coffee cafeaLapteFriscaOreo = new cafeaLapte(new cafeaFrisca(new cafeaOreo(new cafeaSimpla())));
        System.out.println("Pretul pentru o cafea cu lapte, frisca si oreo este de: " + cafeaLapteFriscaOreo.getPrice()+ " lei");
    }

}

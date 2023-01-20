package clean.code.design_patterns.requirements;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class Main {

    public static void main(String[] args) {
        Outfit outfit = new OutfitBuilder()
                .buildTop("white t-shirt")
                .buildBottoms("black skirt")
                .buildShoes("sneakers")
                .buildAccessories("red purse")
                .buildRating(8.75F)
                .build();

        System.out.println("Top : " + outfit.getTop());
        System.out.println("Bottoms : " + outfit.getBottoms());
        System.out.println("Shoes : " + outfit.getShoes());
        System.out.println("Accessories : " + outfit.getAccessories());
        System.out.println("Rating : " + outfit.getOutfitRating());




}

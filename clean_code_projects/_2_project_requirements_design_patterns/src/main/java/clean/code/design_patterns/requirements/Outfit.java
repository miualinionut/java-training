package clean.code.design_patterns.requirements;

public class Outfit {
    public String top;
    public String bottoms;
    public String shoes;
    public String accessories;
    public  Float outfitRating;

    public Outfit(OutfitBuilder buildAnOutfit)
    {
        this.top = buildAnOutfit.top;
        this.bottoms = buildAnOutfit.bottoms;
        this.shoes = buildAnOutfit.shoes;
        this.accessories = buildAnOutfit.accessories;
        this.outfitRating = buildAnOutfit.outfitRating;

    }

    public String getTop() {
        return this.top;

    }

    public String getBottoms() {
        return this.bottoms;
    }

    public String getShoes() {
        return this.shoes;
    }


    public String getAccessories() {
        return this.accessories;
    }

    public Float getOutfitRating() {
        return this.outfitRating;
    }
}

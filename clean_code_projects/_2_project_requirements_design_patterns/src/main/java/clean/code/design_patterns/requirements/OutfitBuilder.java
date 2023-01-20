package clean.code.design_patterns.requirements;

public class OutfitBuilder {

    public String top;
    public String bottoms;
    public String shoes;
    public String accessories;
    public Float outfitRating;

    public OutfitBuilder buildTop(String top) {
        this.top = top;
        return this;
    }

    public OutfitBuilder buildBottoms(String bottoms) {
        this.bottoms = bottoms;
        return this;

    }

    public OutfitBuilder buildShoes(String shoes) {
        this.shoes = shoes;
        return this;
    }

    public OutfitBuilder buildAccessories(String accessories) {
        this.accessories = accessories;
        return this;
    }

    public OutfitBuilder buildRating(Float outfitRating) {
        this.outfitRating = outfitRating;
        return this;
    }

    public Outfit build()
    {
        if(this.top == null)
        {
            throw new IllegalArgumentException("Top has not been selected.");
        }
        else if(this.bottoms == null)
        {
            throw new IllegalArgumentException("Bottoms have not been selected.");

        }
        else if(this.shoes == null)
        {
            throw new IllegalArgumentException("Shoes have not been selected.");

        }
        else if(this.accessories == null)
        {
            throw new IllegalArgumentException("Accessories have not been selected.");

        }
        if(this.outfitRating == null)
        {
            throw new IllegalArgumentException("Rating has not been awarded.");
        }

        return new Outfit(this);
    }
}

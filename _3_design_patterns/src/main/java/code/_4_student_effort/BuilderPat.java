package code._4_student_effort;

public class BuilderPat {
    static class Tea
    {
        private Tea(Builder builder)
        {
           this.type = builder.type;
           this.ice = builder.ice;
           this.lemon = builder.lemon;
           this.size = builder.size;
           this.servings = builder.servings;
        }
        private String type;
        private boolean ice;
        private boolean lemon;
        private String size;
        private int servings;
            public static class Builder
            {
                private String type;
                private boolean ice;
                private boolean lemon;
                private String size;
                private int servings;
                public Builder(String type)
                {
                    this.type = type;
                }
                public Builder ice(boolean value)
                {
                    this.ice = value;
                    return this;
                }
                public Builder lemon(boolean value)
                {
                    this.lemon = value;
                    return this;
                }
                public Builder size(String value)
                {
                    this.size = value;
                    return this;
                }
                public Builder servings(int value)
                {
                    this.servings = value;
                    return this;
                }
                public Tea build()
                {
                    return new Tea(this);
                }
            }
            @Override
            public String toString()
            {
                return String.format("Tea [type=%s, ice=%s, lemon=%s, size=%s, servings=%s]", this.type, ice, lemon, size, servings);
            }
    }

    public static void main(String[] args)
    {
        Tea ceai = new BuilderPat.Tea.Builder("Green tea").ice(true).lemon(false).size("Med").servings(2).build();
        System.out.println("Your tea is: " + ceai.type);
        System.out.println("Ice added: " + ceai.ice);
        System.out.println("Lemon added: " + ceai.lemon);
        System.out.println("Your selected size: " + ceai.size);
        System.out.println("No. of servings: " + ceai.servings);
    }
}



package clean.code.design_patterns.requirements;

public class Phone {

    private String brand; //required
    private String OS; //optional
    private Integer storage; //optional
    private Integer RAM; //optional
    private boolean facialRecognition; //optional

    private Phone(Phone.Builder builder) {
        this.brand = builder.brand;
        this.OS = builder.OS;
        this.storage = builder.storage;
        this.RAM = builder.RAM;
        this.facialRecognition = builder.facialRecognition;
    }

    public static class Builder {
        private String brand;
        private String OS;
        private Integer storage;
        private Integer RAM;
        private boolean facialRecognition;

        public Builder(String brand) {
            this.brand = brand;
        }

        public Phone.Builder OS(String OS) {
            this.OS = OS;
            return this;
        }

        public Phone.Builder storage(Integer storage) {
            this.storage = storage;
            return this;
        }

        public Phone.Builder RAM(Integer RAM) {
            this.RAM = RAM;
            return this;
        }

        public Phone.Builder facialRecognition(boolean facialRecognition) {
            this.facialRecognition = facialRecognition;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

        }

    public String getOS(){
        return this.OS;
    }

    @Override
    public String toString() {
        String s = "My phone is " + this.brand + ", it has " + this.OS + " operating system, "
                + this.RAM + " GB RAM, " + this.storage + " GB storage. It is " + this.facialRecognition +
                " that he has facial recognition.";
        return s;
    }

}

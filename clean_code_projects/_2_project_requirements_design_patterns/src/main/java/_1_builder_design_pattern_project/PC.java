package _1_builder_design_pattern_project;

public class PC {
    private String name;
    private String Motherboard;
    private String CPU;
    private String PSU;
    private String RAM;
    private String Storage;
    private String GPU;
    private String Extras;

    public PC(Builder builder) {
        this.name = builder.name;
        this.Motherboard = builder.Motherboard;
        this.CPU = builder.CPU;
        this.PSU = builder.PSU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GPU = builder.GPU;
        this.Extras = builder.Extras;
    }

    public void printInfo() {
        System.out.println("Computer name: " + this.name);
        System.out.println("Motherboard: " + this.Motherboard);
        System.out.println("Processor: " + this.CPU);
        System.out.println("Power Supply: " + this.PSU);
        System.out.println("Internal Memory (RAM): " + this.RAM);
        System.out.println("External Memory (Storage devices): ");
        System.out.println("Graphics Processor: " + this.GPU);
        if (!Extras.equals("None")) {
            System.out.println("Extras: " + this.Extras);
        }
    }


    public static class Builder {
        private String name;
        private String Motherboard;
        private String CPU;
        private String PSU;
        private String RAM;
        private String Storage;
        private String GPU;
        private String Extras;

        public Builder(String name) {
            this.name = name;
        }
        public Builder setMotherboard(String motherboard) {
            this.Motherboard = motherboard;
            return this;
        }
        public Builder setCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }
        public Builder setPSU(String psu) {
            this.PSU = psu;
            return this;
        }
        public Builder setRAM(String ram) {
            this.RAM = ram;
            return this;
        }
        public Builder setStorage(String storage) {
            this.Storage = storage;
            return this;
        }
        public Builder setGPU(String gpu) {
            this.GPU = gpu;
            return this;
        }
        public Builder setExtras(String extras) {
            this.Extras = extras;
            return this;
        }
        public PC build() {
            return new PC(this);
        }
    }
}


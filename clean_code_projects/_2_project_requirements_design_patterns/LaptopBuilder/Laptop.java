package _2_project_requirements_design_patterns.LaptopBuilder;

public class Laptop {
    private String Processor;
    private String Memory;
    private String Storage;
    private boolean DedicatedGraphics;
    public String getProcessor()
    {
        return Processor;
    }
    public String getMemory()
    {
        return Memory;
    }
    public String getStorage()
    {
        return Storage;
    }

    private Laptop(Builder builder)
    {
        this.Processor=builder.Processor;
        this.Memory=builder.Memory;
        this.Storage=builder.Storage;
        this.DedicatedGraphics=builder.DedicatedGraphics;
    }

    public static class Builder
    {
        private String Processor;
        private String Memory;
        private String Storage;
        private boolean DedicatedGraphics;

        public Builder SetProcessor(String processor)
        {
            this.Processor=processor;
            return this;
        }
        public Builder setMemory(String memory)
        {
            this.Memory=memory;
            return this;
        }
        public Builder SetStorage(String storage)
        {
            this.Storage=storage;
            return this;
        }
        public Builder setDedicatedGraphics(boolean dedicatedGraphics)
        {
            this.DedicatedGraphics=dedicatedGraphics;
            return this;
        }

        public Laptop build()
        {
            return new Laptop(this);
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Processor='" + Processor + '\'' +
                ", Memory='" + Memory + '\'' +
                ", Storage='" + Storage + '\'' +
                ", DedicatedGraphics=" + DedicatedGraphics +
                '}';
    }

    public static void main(String[] args) {
        Laptop l1=new Builder().SetProcessor("i7-7700HQ").setMemory("16 GB DDR4 2400 MHz").SetStorage("512 GB PCIe SSD").setDedicatedGraphics(true).build();
        System.out.println(l1);
    }
}

package clean.code.design_patterns.requirements;

//Factory

public class Main {

    public static void main(String[] args) {

        //Using Factory pattern we remove the instantiation of actual implementation classes from client code

        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config:"+pc);
        System.out.println("Factory Server Config:"+server);


        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Specs comp = new Specs.ComputerBuilder("2TB", "16GB").build();
        Specs comp1 = new Specs.ComputerBuilder("2TB", "16GB").setGraphicsCardEnabled(true).build();

    }
}


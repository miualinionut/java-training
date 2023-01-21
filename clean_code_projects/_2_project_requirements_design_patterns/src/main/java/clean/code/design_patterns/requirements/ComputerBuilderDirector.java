package clean.code.design_patterns.requirements;

public class ComputerBuilderDirector {

    public Specs getBasicComputer() {
        return new Specs.ComputerBuilder("2TB", "16GB").build();
    }

    public Specs getGraphicsCardEnabledComputer() {
        return new Specs.ComputerBuilder("2TB", "16GB").setGraphicsCardEnabled(true).build();
    }
}

package clean.code.design_patterns.requirements;

import clean_code_projects._2_project_requirements_design_patterns.src.main.java.clean.code.design_patterns.requirements.House;
import clean_code_projects._2_project_requirements_design_patterns.src.main.java.clean.code.design_patterns.requirements.StatePattern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();

        houses.add(new House.HouseBuilder("Corbeanca", 2)
                .chimney(2)
                .build());
        houses.add(new House.HouseBuilder("Caracal", 1)
                .securityCameras(6)
                .pool(1)
                .build());
        houses.add(new House.HouseBuilder("Bragadiru", 3)
                .securityCameras(3)
                .pool(1)
                .chimney(1)
                .build());
        houses.add(new House.HouseBuilder("Magurele", 4)
                .securityCameras(8)
                .chimney(2)
                .build());

        houses.forEach(System.out::println);

        StatePattern state = new StatePattern();

        state.
    }
}

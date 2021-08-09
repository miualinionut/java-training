package clean.code.design_patterns.requirements;

import java.util.Arrays;

public class Agency {
    private Cars[] rentCars= new Cars[0];

    public void details(Cars rentCars){
        this.rentCars= Arrays.copyOf(this.rentCars,this.rentCars.length+1);
        this.rentCars[this.rentCars.length-1]=rentCars;
    }
}

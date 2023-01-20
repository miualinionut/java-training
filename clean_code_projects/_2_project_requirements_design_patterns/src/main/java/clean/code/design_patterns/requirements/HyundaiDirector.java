package clean.code.design_patterns.requirements;

public class HyundaiDirector {
    public void buildTrain(HyundaiTrainBuilder builder){
        builder.brand("Hyundai")
                .propulsion("electric")
                .model("XLR-8")
                .seats("300")
                .cargoCapacity("2000 T");
    }
    public void buildCar(HyundaiVehicleBuilder builder){
        builder.brand("Hyundai")
                .propulsion("electric")
                .model("UNY")
                .seats("4")
                .cargoCapacity("1 T");

    }
}

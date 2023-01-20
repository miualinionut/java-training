package clean.code.design_patterns.requirements;

public class SiemensDirector {
    public void buildTrain(SiemensTrainBuilder builder){
        builder.brand("Siemens")
                .propulsion("electric")
                .model("GGR8")
                .seats("600")
                .cargoCapacity("20000 T");
    }
    public void buildCar(SiemensVehicleBuilder builder){
        builder.brand("Siemens")
                .propulsion("electric")
                .model("TTTE")
                .seats("4")
                .cargoCapacity("1.8 T");

    }
}

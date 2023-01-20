package clean.code.design_patterns.requirements;

public class HyundaiFactory extends FactoryCompany{

    @Override
    public Train assembleTrain() {

        return new HyundaiTrain();
    }

    @Override
    public Vehicle assembleVehicle() {

        return new HyundaiVehicle();
    }
}

package clean.code.design_patterns.requirements;

public class SiemensFactory extends FactoryCompany{
    @Override
    public Train assembleTrain() {
        return new SiemensTrain();
    }

    @Override
    public Vehicle assembleVehicle() {
        return new SiemensVehicle();
    }
}

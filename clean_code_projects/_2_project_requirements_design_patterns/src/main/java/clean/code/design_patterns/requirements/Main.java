package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        //abstract factory
        FactoryCompany hyundaiFactory = new HyundaiFactory();
        Train hyundaiTrain = hyundaiFactory.assembleTrain();
        Vehicle hyundaiVehicle = hyundaiFactory.assembleVehicle();


        //builder
        HyundaiTrainBuilder builder = new HyundaiTrainBuilder();
        builder.brand("Hyundai").model("Y3").cargoCapacity("30000 T").propulsion("electric");
        HyundaiTrain trenuletul = builder.build();
        System.out.println(trenuletul.toString());

        Train hyundai_train = builder.brand("suziki").cargoCapacity("333").model("xxx").build();

        //Director
        HyundaiDirector director = new HyundaiDirector();
        HyundaiVehicleBuilder builder1 = new HyundaiVehicleBuilder();
        director.buildCar(builder1);
        HyundaiVehicle car = builder1.build();
        System.out.println(car.toString());
    }
}

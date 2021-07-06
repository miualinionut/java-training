import java.util.ArrayList;
import java.util.List;

public class AllCars extends CarPlan {

    private List<CarPlan> carList = new ArrayList<CarPlan>();

    @Override
    public void showCarDetails() {
        for (CarPlan car:carList) {
            car.showCarDetails();
        }
    }

    public void addCar (CarPlan car) {
        carList.add(car);
    }

    public void removeCar (CarPlan car) {
        carList.remove(car);
    }
}

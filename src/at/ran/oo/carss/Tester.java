package at.ran.oo.carss;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    private List<Car> carList = new ArrayList<Car>();

    public void add(Car car) {
        carList.add( car);
    }
    public void test(){
        for (Car car : carList) {
            car.drive();
        }
    }

    
}

package at.ran.oo.lisk1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Car());
        vehicles.add(new Car());
        vehicles.add(new Bike());

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getColor());
            
        }
    }
}

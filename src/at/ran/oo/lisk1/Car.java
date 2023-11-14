package at.ran.oo.lisk1;

public class Car implements MotorizedVehicle {

    @Override
    public String getColor() {
       return "black";
    }

    @Override
    public Engine getEngine() {
        return new Engine();
    }
    
}

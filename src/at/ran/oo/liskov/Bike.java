package at.ran.oo.liskov;

public class Bike implements Vehicle {

    @Override
    public String getColor() {
       return "black";
    }

    @Override
    public Engine getEngine() {
       return null;
    }
    
}

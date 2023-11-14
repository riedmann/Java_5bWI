package at.ran.oo.liskov;

public class Car implements Vehicle {

    @Override
    public String getColor() {
       return "red";
    }

    @Override
    public Engine getEngine() {
        return new Engine();
    }
    
}

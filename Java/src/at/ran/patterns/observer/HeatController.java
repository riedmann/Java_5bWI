package at.ran.patterns.observer;

public class HeatController implements Observer {

    @Override
    public void inform(int temperature) {
        System.out.println("I am a heat conroller: " + temperature);
    }
    
}

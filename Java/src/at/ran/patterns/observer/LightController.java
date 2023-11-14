package at.ran.patterns.observer;
public class LightController implements Observer{

    @Override
    public void inform(int temperature) {
       System.out.println("INFO: " + temperature);
    }
    
}

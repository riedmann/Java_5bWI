package at.ran.oo.observer;

public class HeatController implements Observer{

    @Override
    public void inform() {
        System.out.println("Informed HeatController");
    }
    
}

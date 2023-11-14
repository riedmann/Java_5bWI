package at.ran.oo.observer;

public class AwningController implements Observer {

    @Override
    public void inform() {
        System.out.println("AwningController informed");
    }

}

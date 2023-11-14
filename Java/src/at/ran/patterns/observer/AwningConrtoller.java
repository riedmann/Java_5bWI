package at.ran.patterns.observer;

public class AwningConrtoller implements Observer {

    @Override
    public void inform(int temperature) {
      System.out.println("I am an AwningConrtoller:" + temperature);
    }
    
}

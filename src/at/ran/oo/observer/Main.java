package at.ran.oo.observer;

public class Main {
    
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();

        HeatController c1 =new HeatController();
        HeatController c2 =new HeatController();
        HeatController c3 =new HeatController();

        AwningController a1 = new AwningController();
        AwningController a2 =new AwningController();

        thermometer.addObserver(a1);
        thermometer.addObserver(c2);
        thermometer.addObserver(c3);

        thermometer.run();
    }
}

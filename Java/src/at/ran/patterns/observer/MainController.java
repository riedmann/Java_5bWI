package at.ran.patterns.observer;

public class MainController {
    public static void main(String[] args) {
        AwningConrtoller ac1 = new AwningConrtoller();
        AwningConrtoller ac2 = new AwningConrtoller();
        HeatController hc1 = new HeatController();
        HeatController hc2 = new HeatController();
        LightController lc1 = new LightController();

        Thermomether thermomether = new Thermomether();

        thermomether.addObserver(ac2);
        thermomether.addObserver(hc2);
        thermomether.addObserver(lc1);

        for (int i = 0; i < 20; i++) {
            thermomether.setTemperature();
        }

    }
}

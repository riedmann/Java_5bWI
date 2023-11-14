package at.ran.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thermomether {
    private int temperature;
    private List<Observer> observers = new ArrayList<Observer>();

    public Thermomether() {
        setTemperature();
    }

    public void setTemperature() {
        Random random = new Random();
        this.temperature = random.nextInt(40);
        System.out.println("New Temperature: " + this.temperature);
        if (temperature >=20){
            informAll();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void informAll() {
      
        for (Observer observer : observers) {
            observer.inform(this.temperature);
        }
    }
}

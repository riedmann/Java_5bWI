package at.ran.oo.observer;

import java.util.*;

public class Thermometer {

    private List<Observer> observers = new ArrayList<Observer>();
    private Random random = new Random();

    public void run() {
        while (true) {
            if (random.nextInt(1000) > 950) {
                informAll();
                break;
            } else {
                System.out.println("nono ");
            }

        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void informAll() {
        for (Observer observer : observers) {
            observer.inform();
        }
    }
}

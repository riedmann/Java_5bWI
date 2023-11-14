package at.ran.oo.singleton;

public class Counter {
    private int counter = 0;
    private static Counter instance = null;

    private Counter(){

    }

    public static Counter getInstance(){
        if (instance == null){
            instance = new Counter();
        }
        return instance;
    }

    public void increment() {
        int counter = 0;
        this.counter++;
    }


    public int getCounter() {
        return counter;
    }

}

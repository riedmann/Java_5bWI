package at.ran.oo.singleton;

public class Counter2 {
    private static int counter = 0;

    public static void increment (){
        counter++;
    }

    public static int getCounter(){
        return counter;
    }
}

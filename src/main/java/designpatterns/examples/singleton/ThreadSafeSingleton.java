package designpatterns.examples.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }

    // ------------------

//    private double footprint;
//
//    private ThreadSafeSingleton() {
//        footprint = Math.random();
//    }
//
//    public void getFootprint() {
//        System.out.println("footprint = " + footprint);
//    }
}

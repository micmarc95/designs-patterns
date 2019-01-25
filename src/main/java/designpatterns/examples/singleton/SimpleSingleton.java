package designpatterns.examples.singleton;

public class SimpleSingleton {
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }

//    private double footprint;
//
//    private SimpleSingleton() {
//        footprint = Math.random();
//    }
//
//    public void getFootprint() {
//        System.out.println("footprint = " + footprint);
//    }
}

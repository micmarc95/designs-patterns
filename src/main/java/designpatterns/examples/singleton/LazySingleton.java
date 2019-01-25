package designpatterns.examples.singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() { }

    public static LazySingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    // --------
//
//    private double footprint;
//
//    private LazySingleton() {
//        footprint = Math.random();
//    }
//
//    public void getFootprint() {
//        System.out.println("footprint = " + footprint);
//    }
}

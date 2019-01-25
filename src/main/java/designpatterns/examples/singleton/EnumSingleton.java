package designpatterns.examples.singleton;

public enum EnumSingleton {
    INSTANCE;

    private double footprint;

    EnumSingleton() {
        footprint = Math.random();
    }

    public void getFootprint() {
        System.out.println("footprint = " + footprint);
    }
}

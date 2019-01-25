package designpatterns.examples.facade;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("....\n" +
                ".  .\n" +
                ".  .\n" +
                ".  .\n" +
                ".  .\n" +
                "....");
    }
}

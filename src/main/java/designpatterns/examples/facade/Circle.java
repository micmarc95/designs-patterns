package designpatterns.examples.facade;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println(" .. \n" +
                ".  .\n" +
                " ..");
    }
}

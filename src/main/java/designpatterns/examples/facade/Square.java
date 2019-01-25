package designpatterns.examples.facade;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("....\n" +
                ".  .\n" +
                "....");
    }
}

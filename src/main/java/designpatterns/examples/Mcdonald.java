package designpatterns.examples;

import designpatterns.examples.decorator.*;

public class Mcdonald {
    public static void main(String[] args) {
        Burger myFavouriteBurger = new BigMac();
        WithFries myFirstOrder = new WithFries(myFavouriteBurger);
        WithDrink mySecondOrder = new WithDrink(new McRoyal());
        System.out.println("Order #1: " + myFirstOrder.toString());
        System.out.println("Order #2: " + mySecondOrder.toString());
    }
}

package designpatterns.examples.decorator;

import java.math.RoundingMode;

public abstract class Burger implements Pricy, Caloric {
    @Override
    public String toString() {
        return "Price: " + getPrice().setScale(2, RoundingMode.CEILING) + "\n"
                + "Calories: " + getCalories() + "\n";
    }
}

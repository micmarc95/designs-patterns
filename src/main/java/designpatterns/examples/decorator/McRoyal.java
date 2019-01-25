package designpatterns.examples.decorator;

import java.math.BigDecimal;

public class McRoyal extends Burger {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(8.99);
    }

    @Override
    public int getCalories() {
        return 580;
    }
}

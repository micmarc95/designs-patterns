package designpatterns.examples.decorator;

import java.math.BigDecimal;

public class BigMac extends Burger {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(7.99);
    }

    @Override
    public int getCalories() {
        return 650;
    }
}

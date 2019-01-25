package designpatterns.examples;

import designpatterns.examples.builder.Coffee;
import designpatterns.examples.builder.CoffeeBuilder;
import designpatterns.examples.builder.CoffeeSizeEnum;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder(CoffeeSizeEnum.ESPRESSO)
                .setSyrup("Vanilia")
                .setSugar(1.0)
                .setMilk(true);
        Coffee myFavouriteCoffee = coffeeBuilder.build();
        System.out.println(myFavouriteCoffee.toString());
    }

//    // Shorter version below
//    public static void main(String[] args) {
//        Coffee myFavouriteCoffee = new CoffeeBuilder(CoffeeSizeEnum.ESPRESSO)
//                .setSyrup("Vanilia")
//                .setSugar(1.0)
//                .setMilk(true)
//                .build();
//        System.out.println(myFavouriteCoffee.toString());
//    }
}

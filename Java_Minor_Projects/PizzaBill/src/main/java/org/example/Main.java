package org.example;


public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraToppings(); // Check method spelling
        basePizza.addExtraCheese();   // Check method spelling
        basePizza.takeAway();         // Check method spelling
        basePizza.getBill();          // Check method spelling

                // Pizza basePizza = new Pizza(true);
                // basePizza.addExtraToppings();
                // basePizza.addExtraCheese();
                // basePizza.takeAway();
                // basePizza.getBill();

                DeluxPizza dp = new DeluxPizza(true);
                dp.addExtraCheese();
//                dp.addExtraToppings();
                dp.getBill();

    }
}

package org.example;

public class DeluxPizza extends Pizza {

    public DeluxPizza(Boolean veg) {
        super(veg);  // Corrected super call
        super.addExtraCheese(); // Deluxe pizza includes extra cheese by default
        super.addExtraToppings(); // Deluxe pizza includes extra toppings by default
    }

    @Override
    public void addExtraCheese() {
        // Extra cheese is already included in DeluxePizza by default
    }

    @Override
    public void addExtraToppings() {
        // Extra toppings are already included in DeluxePizza by default
    }
}

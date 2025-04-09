package org.example;

public class Pizza {
    private Boolean veg;
    private int price;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayOpted = false;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;

    // Constructor
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void getPizzaPrice() {
        System.out.println("Base Pizza Price: $" + this.basePizzaPrice);
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isTakeAwayOpted = true;
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "Pizza Base Price: $" + basePizzaPrice + "\n";

        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: $" + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added: $" + extraToppingsPrice + "\n";
        }
        if (isTakeAwayOpted) {
            bill += "Take Away: $" + backPackPrice + "\n";
        }

        bill += "Total Bill: $" + this.price;
        System.out.println(bill);
    }
}

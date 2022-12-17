package designpattern.structural.decorator.toppings;

import designpattern.structural.decorator.pizza.Pizza;

public class Paneer implements Pizza {
    private Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 60 + this.pizza.cost();
    }

    @Override
    public String description() {
        return this.pizza.description() + " + " + "Paneer";
    }
}

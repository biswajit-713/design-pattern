package designpattern.structural.decorator.toppings;

import designpattern.structural.decorator.pizza.Pizza;

public class Cheese implements Pizza {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 80 + this.pizza.cost();
    }

    @Override
    public String description() {
        return this.pizza.description() + " + " + "Cheese";
    }
}

package designpattern.structural.decorator.toppings;

import designpattern.structural.decorator.pizza.Pizza;

public class Tomato implements Pizza {
    private Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 30 + this.pizza.cost();
    }

    @Override
    public String description() {
        return this.pizza.description() + " + " + "Tomato";
    }
}

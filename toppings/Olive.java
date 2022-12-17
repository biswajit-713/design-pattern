package designpattern.structural.decorator.toppings;

import designpattern.structural.decorator.pizza.Pizza;

public class Olive implements Pizza {

    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 20 + this.pizza.cost();
    }

    @Override
    public String description() {
        return this.pizza.description() + " + " + "Olive";
    }
}

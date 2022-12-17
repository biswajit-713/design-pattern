package designpattern.structural.decorator.pizza;

public class BBQChicken implements Pizza{
    private Pizza pizza;

    public BBQChicken() {
    }

    public BBQChicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        int cost = 200;
        if (pizza == null) {
            return cost;
        }
        return cost + this.pizza.cost();
    }

    @Override
    public String description() {
        String description = "BBChicken";
        if (pizza == null) {
            return description;
        } else {
            return this.pizza.description() + " + " + description;
        }
    }
}

package designpattern.structural.decorator.pizza;

public class Pepperoni implements Pizza{
    private Pizza pizza;

    public Pepperoni() {
    }

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        if (pizza == null) {
            return 180;
        }
        return 180 + this.pizza.cost();
    }

    @Override
    public String description() {
        String description = "Pepperoni";
        if (pizza == null) {
            return description;
        } else {
            return this.pizza.description() + " + " + description;
        }
    }
}

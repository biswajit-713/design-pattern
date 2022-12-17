package designpattern.structural.decorator.pizza;

public class Margarita implements Pizza{
    private Pizza pizza;

    public Margarita() {
    }

    public Margarita(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        if (pizza == null) {
            return 200;
        }
        return 200 + this.pizza.cost();
    }

    @Override
    public String description() {
        String description = "Margarita";
        if (pizza == null) {
            return description;
        } else {
            return this.pizza.description() + " + " + description;
        }
    }
}

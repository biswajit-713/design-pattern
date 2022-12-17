package designpattern.structural.decorator.pizza;

public class Farmhouse implements Pizza{

    private Pizza pizza;

    public Farmhouse() {
    }

    public Farmhouse(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        if (pizza == null) {
            return 150;
        }
        return 150 + this.pizza.cost();
    }

    @Override
    public String description() {
        String description = "Farmhouse";
        if (pizza == null) {
            return description;
        } else {
            return this.pizza.description() + " + " + description;
        }
    }
}

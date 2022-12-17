package designpattern.structural.decorator;

import designpattern.structural.decorator.pizza.BBQChicken;
import designpattern.structural.decorator.pizza.Farmhouse;
import designpattern.structural.decorator.pizza.Margarita;
import designpattern.structural.decorator.pizza.Pizza;
import designpattern.structural.decorator.toppings.Cheese;
import designpattern.structural.decorator.toppings.Olive;
import designpattern.structural.decorator.toppings.Paneer;
import designpattern.structural.decorator.toppings.Tomato;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Olive(new Cheese(new Tomato(new Farmhouse())));
        System.out.println(pizza.cost());
        System.out.println(pizza.description());
    }
}

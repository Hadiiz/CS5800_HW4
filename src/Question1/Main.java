package Question1;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //OUTPUT 1
        ArrayList<PizzaBuilder.Pizza> pizzaHut = new ArrayList<PizzaBuilder.Pizza>();
        pizzaHut.add(new PizzaBuilder().setSize("small").setChain("Pizza Hut").addTopping("pepperoni").addTopping("chicken")
                .addTopping("ham and pineapple").createPizza());
        pizzaHut.add(new PizzaBuilder().setSize("medium").setChain("Pizza Hut").addTopping("pesto").addTopping("olives")
                .addTopping("sausage").addTopping("spinach").addTopping("extra cheese").addTopping("spicy pork").createPizza());
        pizzaHut.add(new PizzaBuilder().setSize("large").setChain("Pizza Hut").addTopping("beef").addTopping("onions").addTopping("olives")
                .addTopping("ham and pineapple").addTopping("spinach").addTopping("mushrooms").addTopping("bacon").addTopping("chicken")
                .addTopping("pepperoni").createPizza());

        pizzaHut.forEach(pizza -> pizza.eat());

        System.out.println();
        System.out.println("******************************************************************************************");
        System.out.println();

        //OUTPUT 2
        pizzaHut = new ArrayList<PizzaBuilder.Pizza>();
        pizzaHut.add(new PizzaBuilder().setSize("large").setChain("Pizza Hut").addTopping("pepperoni").addTopping("chicken")
                .addTopping("ham and pineapple").createPizza());
        pizzaHut.add(new PizzaBuilder().setSize("small").setChain("Pizza Hut").addTopping("chicken")
                .addTopping("ham and pineapple").createPizza());
        pizzaHut.forEach(pizza -> pizza.eat());

        ArrayList<PizzaBuilder.Pizza> littleCeasars = new ArrayList<PizzaBuilder.Pizza>();
        littleCeasars.add(new PizzaBuilder().setSize("medium").setChain("little Ceasars").addTopping("pepperoni").addTopping("chicken")
                .addTopping("ham and pineapple").addTopping("beef").addTopping("onions").addTopping("olives")
                .addTopping("spinach").addTopping("pesto").createPizza());
        littleCeasars.add(new PizzaBuilder().setSize("small").setChain("little Ceasars").addTopping("spinach")
                .addTopping("extra cheese").addTopping("spicy pork").addTopping("ham and pineapple").addTopping("beef")
                .addTopping("onions").createPizza());
        littleCeasars.forEach(pizza -> pizza.eat());

        ArrayList<PizzaBuilder.Pizza> dominos = new ArrayList<PizzaBuilder.Pizza>();
        dominos.add(new PizzaBuilder().setSize("small").setChain("Dominos").addTopping("pepperoni").createPizza());
        dominos.add(new PizzaBuilder().setSize("large").setChain("Dominos").addTopping("pepperoni").addTopping("chicken")
                .addTopping("ham and pineapple").createPizza());
        dominos.forEach(pizza -> pizza.eat());
    }
}
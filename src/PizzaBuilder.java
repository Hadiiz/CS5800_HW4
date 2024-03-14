import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PizzaBuilder {
    private String chain;
    private String size;
    private static final List<String> allowedSizes = Arrays.asList("small", "medium", "large");

    private ArrayList<String> toppings;
    private static final List<String> allowedToppings = Arrays.asList(
            "pepperoni", "sausage", "mushrooms", "bacon", "onions", "extra cheese",
            "peppers", "chicken", "olives", "spinach", "tomato and basil", "beef",
            "ham", "pesto", "spicy pork", "ham and pineapple"
    );

    public PizzaBuilder(){
        toppings = new ArrayList<String>();
    }

    public PizzaBuilder setSize(String size){
        size = size.toLowerCase();
        if(!allowedSizes.contains(size)){
            System.out.println("Sorry "+size+" is not an offered size, only use small, medium or large");
            return this;
        }
        this.size = size;
        return this;
    }

    public PizzaBuilder setChain(String chain){
        this.chain = chain;
        return this;
    }

    public PizzaBuilder addTopping(String topping){
        topping = topping.toLowerCase();
        if(!allowedToppings.contains(topping)){
            System.out.println("Sorry "+topping+" is not an available, Here's our full list of toppings: " +
                    "pepperoni, sausage, mushrooms, bacon, onions, extra cheese, peppers, chicken, olives, spinach, tomato and basil" +
                    "beef, ham, pesto, spicy pork, ham and pineapple");
            return this;
        }
        toppings.add(topping);
        return this;
    }

    public Pizza createPizza(){
        if (size == null || size.isEmpty()) {
            throw new IllegalStateException("Pizza size has not been set. Please set a size before creating a pizza.");
        }
        Pizza pizza = new Pizza(chain, size, toppings);
        return pizza;
    }
    class Pizza{
        private String chain;
        private String size;
        private List<String> toppings;

        public Pizza(String chain, String size, ArrayList<String> toppings) {
            this.chain = chain;
            this.size = size;
            this.toppings = toppings;
        }

        public void eat() {
            System.out.println(this.chain + " " + this.
                    size + " pizza with toppings:");
            for (String topping : this.toppings) {
                System.out.println("- " + topping);
            }
            System.out.println();
        }

    }
}

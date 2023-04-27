import java.util.ArrayList;

public class ExtraCheese implements Pizza {

    ArrayList toppings;
    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
        toppings = pizza.getToppings();
        toppings.add("cheese");
    }

    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}

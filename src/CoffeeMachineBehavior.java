import cupboard.*;
import coffee_bin.*;
public interface CoffeeMachineBehavior {
    Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException;
}



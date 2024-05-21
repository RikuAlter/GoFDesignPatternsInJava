package creational.factoryMethod;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Bun + lettuce + tomato + beef + dressing + bun");
    }
}

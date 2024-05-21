package creational.factoryMethod;

public class BeefBurgerCooker extends Cooker{
    @Override
    public Burger cookRecipie() {
        return new BeefBurger();
    }
}

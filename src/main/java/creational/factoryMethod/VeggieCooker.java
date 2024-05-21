package creational.factoryMethod;

public class VeggieCooker extends Cooker{
    @Override
    public Burger cookRecipie() {
        return new VeggieBurger();
    }
}

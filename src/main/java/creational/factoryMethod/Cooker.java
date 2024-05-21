package creational.factoryMethod;

public abstract class Cooker {

    public Burger cookBurger() {
        Burger burger = cookRecipie();
        burger.prepare();
        return burger;
    }

    public abstract Burger cookRecipie();
}

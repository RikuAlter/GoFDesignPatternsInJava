package structural.bridge;

public class AmericanMenu extends IMenu{
    public AmericanMenu(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToping() {
        getPizza().setTopping("Cheese");
    }

    @Override
    public void addCrust() {
        getPizza().setCrust("Thin");
    }

    @Override
    public void addSauce() {
        getPizza().setSauce("Melted cheese and tomato");
    }
}

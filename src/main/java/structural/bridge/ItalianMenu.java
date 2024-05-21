package structural.bridge;

public class ItalianMenu extends IMenu{
    public ItalianMenu(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToping() {
        getPizza().setTopping("Pamesan cheese");
    }

    @Override
    public void addCrust() {
        getPizza().setCrust("Roasted");
    }

    @Override
    public void addSauce() {
        getPizza().setSauce("Olive oil and tomato");
    }
}

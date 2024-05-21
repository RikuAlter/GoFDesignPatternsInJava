package structural.composite;

public class Videogame extends Product{
    public Videogame(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}

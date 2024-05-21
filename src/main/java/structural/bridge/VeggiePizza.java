package structural.bridge;

public class VeggiePizza extends Pizza{
    @Override
    public void assemble() {
        System.out.println("Crust: "+getCrust());
        System.out.println("Sause: "+getSauce());
        System.out.println("Topping: "+getTopping());
        System.out.println("Adding veggies!");
    }
}

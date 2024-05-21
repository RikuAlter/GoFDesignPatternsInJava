package structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class IMenu {
    private Pizza pizza;

    public abstract void addToping();
    public abstract void addCrust();
    public abstract void addSauce();

    public void cook(){
        addCrust();
        addSauce();
        addToping();
        getPizza().assemble();
    }
}

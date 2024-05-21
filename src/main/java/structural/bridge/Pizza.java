package structural.bridge;

import lombok.Data;

@Data
public abstract class Pizza {
    public String sauce;
    public String topping;
    public String crust;

    public abstract void assemble();
}

package structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Box implements Item{

    private List<Item> items;

    @Override
    public double calculatePrice() {
        return items.stream().mapToDouble(Item::calculatePrice).sum();
    }
}

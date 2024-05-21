package behavioral.iterator;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class Vertex<T> {
    public T value;
    public List<Vertex<T>> neighbours = new ArrayList<>();
    @ToString.Exclude
    public boolean visited;

    public Vertex(T value){
        this.value = value;
    }
}

package behavioral.iterator;

import lombok.Data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

@Data
public class BreadthFirstIterator<T> implements Iterator<Vertex<T>> {

    public Vertex<T> startVertex;
    public Queue<Vertex<T>> queue;

    public BreadthFirstIterator(Vertex<T> startVertex){
        this.startVertex = startVertex;
        queue = new LinkedList<>();
        queue.add(startVertex);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Vertex<T> next() {
        if(!hasNext())
            return null;
        Vertex<T> current = queue.poll();
        if(!current.isVisited()){
            current.setVisited(true);
            queue.addAll(current.getNeighbours());
            return current;
        }
        return next();
    }
}

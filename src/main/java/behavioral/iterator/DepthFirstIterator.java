package behavioral.iterator;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstIterator<T> implements Iterator<Vertex<T>> {

    public Vertex<T> startVertex;
    public Deque<Vertex<T>> stack;

    public DepthFirstIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        stack = new LinkedList<>();
        stack.push(this.startVertex);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Vertex<T> next() {
        if(!hasNext())
            return null;
        Vertex<T> current = stack.pop();
        if(!current.isVisited()){
            current.setVisited(true);
            current.getNeighbours().forEach(stack::push);
            return current;
        }
        return next();
    }
}

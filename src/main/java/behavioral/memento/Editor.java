package behavioral.memento;

import lombok.Getter;
import behavioral.memento.TextArea.Memento;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

@Getter
public class Editor {
    private final Deque<Memento> memoryStack;
    private final TextArea textArea;

    public Editor(){
        memoryStack = new LinkedList<>();
        textArea = new TextArea();
    }

    public void save(String text){
        textArea.setText(text);
        memoryStack.push(textArea.takeSnapshot());
    }

    public void restore() {
        memoryStack.pop();
        if(Optional.ofNullable(memoryStack.peek()).isPresent())
            textArea.setText(memoryStack.peek().getText());
    }
}

package behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextArea {
    private String text;

    public void restore(Memento mem) {
        this.text = mem.text;
    }

    public Memento takeSnapshot() {
        return new Memento(text);
    }

    @Getter
    public static class Memento {
        private final String text;

        public Memento(String text){
            this.text = text;
        }
    }
}

package structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String name;
    private String ISBN;
    private int pageCount;
    private String author;
    private BookPublication publication;
}

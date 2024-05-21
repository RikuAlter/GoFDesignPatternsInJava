package structural.flyweight;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class BookProvider {

    private static final HashMap<String, BookPublication> publications = new HashMap<>();

    public static BookPublication getBookPublication(String publication, String printingCompany, String editor){
        BookPublication cachedPublisher = publications.get(publication);
        if(cachedPublisher == null){
            BookPublication bp = new BookPublication(publication, printingCompany, editor);
            publications.put(publication, bp);
            return bp;
        }
        return cachedPublisher;
    }

    public static Book createBook(String name, String isbn, int pageCount, String author, String publication, String printingCompany, String editor){
        BookPublication bp = getBookPublication(publication, printingCompany, editor);
        return new Book(name, isbn, pageCount, author, bp);
    }
}

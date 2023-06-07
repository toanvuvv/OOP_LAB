package media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media{
    public Book() {
        super();
    }
    private List<String> authors = new ArrayList<String>();
    
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author already exists!");
        }
    }
    
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    
}

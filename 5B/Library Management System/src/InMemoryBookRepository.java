import java.util.HashMap;
import java.util.Map;

public class InMemoryBookRepository implements IBookRepository {
    private Map<String, Book> bookMap = new HashMap<>();

    @Override
    public void addBook(Book book) {
        bookMap.put(book.getId(), book);
    }

    @Override
    public void removeBook(String bookId) {
        bookMap.remove(bookId);
    }

    @Override
    public Book getBook(String bookId) {
        return bookMap.get(bookId);
    }
}
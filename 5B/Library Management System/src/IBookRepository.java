// IBookRepository.java
public interface IBookRepository {
    void addBook(Book book);
    void removeBook(String bookId);
    Book getBook(String bookId);
}


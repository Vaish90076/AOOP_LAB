// Client.java
public class Client {
    public static void main(String[] args) {
        // Create repositories
        IBookRepository bookRepository = new InMemoryBookRepository();
        IMemberRepository memberRepository = new InMemoryMemberRepository();
        
        // Create borrowing policy
        IBorrowingPolicy borrowingPolicy = new StandardPolicy();

        // Create library
        Library library = new Library(bookRepository, memberRepository, borrowingPolicy);

        // Add books
        Book book1 = new Book("B001", "1984", "George Orwell");
        Book book2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Add members
        Member member1 = new Member("M001", "Alice");
        Member member2 = new Member("M002", "Bob");
        library.addMember(member1);
        library.addMember(member2);

        // Borrow and return books
        library.borrowBook("M001", "B001"); // Alice borrows 1984
        library.returnBook("B001"); // Return 1984
    }
}

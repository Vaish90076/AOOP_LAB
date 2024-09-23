// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private IBookRepository bookRepository;
    private IMemberRepository memberRepository;
    private IBorrowingPolicy borrowingPolicy;

    public Library(IBookRepository bookRepository, IMemberRepository memberRepository, IBorrowingPolicy borrowingPolicy) {
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
        this.borrowingPolicy = borrowingPolicy;
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void addMember(Member member) {
        memberRepository.addMember(member);
    }

    public void borrowBook(String memberId, String bookId) {
        Member member = memberRepository.getMember(memberId);
        Book book = bookRepository.getBook(bookId);

        if (member != null && book != null && book.isAvailable() && borrowingPolicy.canBorrow(member)) {
            book.borrow();
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Borrowing failed.");
        }
    }

    public void returnBook(String bookId) {
        Book book = bookRepository.getBook(bookId);
        if (book != null) {
            book.returnBook();
            System.out.println(book.getTitle() + " has been returned.");
        }
    }
}

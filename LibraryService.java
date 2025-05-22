package Projects.LibraryManagementSystem;

import Projects.LibraryManagementSystem.Book;
import Projects.LibraryManagementSystem.BorrowRequest;

import java.util.*;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private Set<String> isbnSet = new HashSet<>();
    private Queue<BorrowRequest> borrowQueue = new ArrayDeque<>();
    private Map<String, List<Book>> authorMap = new HashMap<>();

    public void addBook(Book book) {
        if (isbnSet.contains(book.getIsbn())) {
            System.out.println("Book already exists!");
            return;
        }
        books.add(book);

        isbnSet.add(book.getIsbn());

        authorMap.computeIfAbsent(book.getAuthor(), k -> new ArrayList<>()).add(book);
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) System.out.println(b);
        }
    }

    public void borrowBook(String user, String isbn) {
        if (!isbnSet.contains(isbn)) {
            System.out.println("ISBN not found.");
            return;
        }
        borrowQueue.add(new BorrowRequest(user, isbn));
        System.out.println("Book added to borrow queue.");
    }

    public void viewBorrowQueue() {
        if (borrowQueue.isEmpty()) {
            System.out.println("No pending borrow requests.");
        } else {
            for (BorrowRequest br : borrowQueue) System.out.println(br);
        }
    }

    public void sortBooksByTitle() {
        Collections.sort(books);
        System.out.println("Books sorted by title.");
    }
}


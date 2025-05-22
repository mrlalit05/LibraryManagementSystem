package Projects.LibraryManagementSystem;

import Projects.LibraryManagementSystem.Book;
import Projects.LibraryManagementSystem.BorrowRequest;
import Projects.LibraryManagementSystem.LibraryService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n📚 Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. View Borrow Queue");
            System.out.println("5. Sort Books by Title");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    library.addBook(new Book(title, author, isbn, year));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Your Name: ");
                    String user = sc.nextLine();
                    System.out.print("Book ISBN: ");
                    String bookIsbn = sc.nextLine();
                    library.borrowBook(user, bookIsbn);
                    break;

                case 4:
                    library.viewBorrowQueue();
                    break;

                case 5:
                    library.sortBooksByTitle();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

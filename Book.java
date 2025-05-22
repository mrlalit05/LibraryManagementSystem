package Projects.LibraryManagementSystem;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private String isbn;
    private int year;
//    private String author;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }
    public String getIsbn() { return isbn; }

    @Override
    public int compareTo(Book b) {
        return this.title.compareToIgnoreCase(b.title); // natural sort
    }
    @Override

    public String toString(){
        return title + " by " + author + " (" + year + ") [ISBN: " + isbn + "]";
    }

    public String getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return title;
    }


    public int getYear() {
        return year;
    }
}

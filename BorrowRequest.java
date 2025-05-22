package Projects.LibraryManagementSystem;

import java.time.LocalDateTime;

public class BorrowRequest {

    private String userName;
    private String isbn;
    private LocalDateTime requestTime;

    public BorrowRequest(String userName, String isbn ){
        this.userName=userName;
        this.isbn=isbn;
        this.requestTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return userName + " requested ISBN: " + isbn + " at " + requestTime;
    }


}

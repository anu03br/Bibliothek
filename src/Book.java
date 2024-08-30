//This is a Model Class
public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isBorrowed;

    //constructor for Book objects
    //parameter isBorrowed is not necessary, on adding a book isBorrowed will always be false
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }
    //setters for immutable attributes
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getIsbn() {
        return isbn;
    }

    //setter and getter because isBorrowed will be changed after creation
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}

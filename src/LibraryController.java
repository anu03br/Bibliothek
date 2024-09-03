import java.util.ArrayList;


//class with the different methods for managing books and clients
public class LibraryController {


    ArrayList<Book> books= new ArrayList<Book>();
    ArrayList<User> users = new ArrayList<User>();

    //new to initialize view class here to use the methods inside
    //initialize new Library to add books AND USERS into
    //don't forget about the users

    //controller part of addBookFromLibrary
    public void addBook(String title, String autor,int isbn) {

        //pass collected info into creating a new book
        Book newBook = new Book(title, autor, isbn);

        //add new book to library
        books.add(newBook);
    }

    //controller part of borrowBookFromLibrary
    public boolean borrowBook(int isbn) {

        //loop through all books in the library
        for (int i = 0; i < books.size(); i++) {
            //compare all isbn to the one provided in above input
            if (books.get(i).getIsbn() == isbn) {
                //iff book is found set isBorrowed to true
                books.get(i).setIsBorrowed(true);
                //return true to view (display book was checked out)
                return true;
            }
        }
        //return false(book was not found)
        return false;
    }

    //controller part of returnBookFromLibrary
    public boolean returnBook(int isbn) {

        //loop through all books in the library
        for (int i = 0; i < books.size(); i++) {
            //compare all isbn to the one provided in above input
            if (books.get(i).getIsbn() == isbn) {
                //iff book is found set isBorrowed to true
                books.get(i).setIsBorrowed(false);
                //return true to view (display book was checked out)
                return true;
            }
        }
        //return false(book was not found)
        return false;
    }

    //controller part of listBooksFromLibrary
    //sends books array to view
    public ArrayList<Book> listBooks() {
        return new ArrayList<>(books);
    }
}

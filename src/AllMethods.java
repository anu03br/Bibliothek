import java.util.Scanner;

//class with the different methods for managing books and clients
public class AllMethods {

    //new to initialize view class here to use the methods inside
    View view = new View(new Scanner(System.in));
    //initialize new Library to add books AND USERS into
    //don't forget about the users
    Library library = new Library();


    //method to adda book to books arrayList
    //this method should be called and take user input create a new book object
    public void addBook() {

        //get the books title
        view.displayMessage("enter book name");
        String title= view.takeInputAsString();
        //get the books isbn
        view.displayMessage("enter book isbn");
        int isbn= view.takeInputAsInt();
        view.displayMessage("enter book author");
        String author= view.takeInputAsString();

        //pass collected info into creating a new book
        Book newBook = new Book(title, author, isbn);

        //add new book to library
        library.books.add(newBook);
        view.closeScanner();
    }

    public void borrowBook() {

        //get isbn of th book to borrow
        view.displayMessage("enter book isbn");
        int isbn = view.takeInputAsInt();

        //loop through all books in the library
        for (int i = 0; i < library.books.size(); i++) {
            //compare all isbn to the one provided in above input
            if (library.books.get(i).getIsbn() == isbn) {
                //iff book is found set isBorrowed to true
                library.books.get(i).setIsBorrowed(true);
                return;
            }


        }
        view.displayMessage("book not found");
    }
}

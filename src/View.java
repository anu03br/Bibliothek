import java.util.ArrayList;
import java.util.Scanner;

//the View class handles and scanner input or sout output
public class View {

    //instanz des controllers
    LibraryController controller = new LibraryController();

    //this should be the only Scanner
    //made scanner not private
    private Scanner scan = new Scanner(System.in);

    //constructor for the View class
    public View() {
    }



    public void mainMenue(){

        int choice;
        boolean exit = false;

        while (!exit) {

            //object= view method = displayMessage
            displayMessage("welcome, choose what to do");
            displayMessage("1. Add a book\n2. Remove a book\n3. List all books\n4. borrow books\n5. return books\n0. Exit");

            //take user choice
            choice =takeInputAsInt();


            switch(choice) {
                case 0:
                    //exit
                    displayMessage("exiting");
                    exit = true;
                    break;
                case 1:
                    //add book
                    displayMessage("Adding a book...");
                    addBookToLibrary();
                    break;
                case 2:
                    //remove book
                    displayMessage("Removing a book...");
                    displayMessage("not implemented yet");
                    break;
                case 3:
                    //list all books
                    displayMessage("Getting List of all books");
                    listBooksFromLibrary();
                    break;
                case 4:
                    //borrow a book
                    displayMessage("Starting borrowing process.");
                    borrowBookFromLibrary();
                    break;
                case 5:
                    //return a book
                    displayMessage("Returning borrowing process.");
                    returnBookToLibrary();
                    break;
                default:
                    displayMessage("incorrect input");
                    break;
            }
        }
        closeScanner();
    }

    //method to adda book to books arrayList
    //this method should be called and take user input create a new book object
    public void addBookToLibrary() {

        //get the books title
        displayMessage("enter book title");
        String title= takeInputAsString();
        //get books author
        displayMessage("enter book author");
        String author= takeInputAsString();
        //get the books isbn
        displayMessage("enter book isbn");
        int isbn= takeInputAsInt();

        controller.addBook(title, author, isbn);
        displayMessage("book added");

    }

    //borrow book from library via method
    public void borrowBookFromLibrary(){


        //get isbn of th book to borrow
        displayMessage("enter book isbn");
        int isbn = takeInputAsInt();

        boolean isFound = controller.borrowBook(isbn);

        if (isFound) {
            displayMessage("book is available");
            displayMessage("book was checked out");
        }
        else {
            displayMessage("book is not available");
        }
    }

    //return book to library
    public void returnBookToLibrary() {
        displayMessage("enter book isbn");
        int isbn = takeInputAsInt();

        boolean isReturned = controller.borrowBook(isbn);

        if (isReturned) {
            displayMessage("book is available");
            displayMessage("book was marked as returned");
        }
        else{
            displayMessage("book was not found");
        }
    }

    //send books Array to View
    public void listBooksFromLibrary(){
        ArrayList<Book> books =controller.listBooks();
        displayMessage("Books in this Library:\n");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String bookDetails = "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn();
            displayMessage(bookDetails);

        }
    }


    //take input as String
    public String takeInputAsString(){
        //take next input and stor in a String
        //will be parsed later if needed
        String userInput=scan.nextLine();
        return userInput;
    }

    //take input as int
    public int takeInputAsInt(){
        int userInput=scan.nextInt();
        return userInput;
    }

    //take input as Bool
    public boolean takeInputAsBoolean(){
        boolean userInput=scan.nextBoolean();
        return userInput;
    }

    //method to display messages to terminal
    //message is passed from main method and printed here
    public void displayMessage(String message){
        System.out.println(message);
    }

    //method to close scanner
    public void closeScanner() {
        scan.close();
    }
}

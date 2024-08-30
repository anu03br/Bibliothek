import java.util.Scanner;

//Main is the controller class with the main method inside
public class Main {
    public static void main(String[] args) {

        //new to initialize view class here to use the methods inside
        View view = new View(new Scanner(System.in));

        int choice;
        boolean exit = false;

        while (!exit) {

            //object= view method = displayMessage
            view.displayMessage("welcome, choose what to do");
            view.displayMessage("1. Add a book\n2. Remove a book\n0. Exit");

            //take user choice
            choice =view.takeInputAsInt();


            switch(choice) {
                case 0:
                    //exit
                    view.displayMessage("exiting");
                    exit = true;
                case 1:
                    //add book
                case 2:
                    //remove book
                default:
                    view.displayMessage("incorrect input");
            }
        }
        view.closeScanner();
    }
}
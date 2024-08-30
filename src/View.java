import java.util.Scanner;

//the View class handles and scanner input or sout output
public class View {

    //this should be the only Scanner
    //made scanner not private
    Scanner scan;

    //constructor
    //what does this do exactly?
    //guess we need this to pass the scanner around
    public View(Scanner scan){
        this.scan=new Scanner(System.in);

    }

//why do we not need to pass the scanner thoe the input methods???
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

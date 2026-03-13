import java.util.Random;
import java.util.Scanner;
import java.lang.Integer;
//or import java.util.*;

public class NumberGuesser{
	//initialize scanners and strings in open space in class!
	java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//Main is static; so don't put much in there.  In most Java projects, main simply calls the constructor of the current class.  
		new NumberGuesser();
	} // end main
	
	public NumberGuesser(){
		//constrcutor 
		boolean keepGoing = true;	
		while(keepGoing == true){
			String response = menu();
			if (response.equals("1")){
        			humanGuesser();
    			} // end if
			else if (response.equals("2")){
    				computerGuesser();
    			} // end else if
			else if (response.equals("0")){
        			System.out.println("Goodbye!");
        			keepGoing = false;
    			} // end else if
			else {
        			System.out.println("Sorry. I didn't understand");
    			} // end else
  		} // end while
	} // end constructor


 	public String menu(){
		//prints a menu, returns a single character string 0, 1, or 2
     		System.out.println("Select an option");
     		System.out.println("0) Quit");
     		System.out.println("1) Human Guesser");
     		System.out.println("2) Computer Guesser");
     		String response = input.nextLine();
     		return response;
   	} // end menu

	public void humanGuesser(){
  		boolean keepGoing = true;
  		int turns = 0;
  		Random random = new Random();
  		int correct = random.nextInt(100) + 1;
  		while (keepGoing == true) {
        		//ask user for a number and put into -> new String guess
        		turns++;
			System.out.println (turns + ") Please enter a number: ");
        		String guess = input.nextLine();
        		
			try {
                        	int intGuess = Integer.parseInt(guess);
                        } // end try
        			if (intGuess < correct) {
            				System.out.println ("Too low");
        			} // end if
				else if (intGuess > correct) {
            				System.out.println ("Too high");
        			} //end else if
				else if (intGuess == correct) {
            				System.out.println ("You guessed correct!");
            				keepGoing = false;
        			} // end else if
        			else if (intGuess > 100) {
            				System.out.println ("The number has to be between 1-100!");
				} // end else if
        			else (intGuess < 1) {
                                	System.out.println ("The number has to be between 1-100!");
				} //end else
			catch (NumberFormatException e) {
                                System.out.println("That is not a number!");
			} // end catch
		} // end while
	} // end humanGuesser

	public void computerGuesser(){
  		boolean keepGoing = true;
  		int turns = 0;
  		int compGuess = 50;
  		int changeBy = 25;
  		while (keepGoing == true) {
    			turns++;
			System.out.println (turns + ") I guess " + compGuess);
    			System.out.println ("Too (H)igh, too (L)ow, or (C)orrect? ");
    			String feedback = input.nextLine();
    			feedback = feedback.toUpperCase();
    			if (feedback.equals("H")) {
      				compGuess -= changeBy;
      				changeBy /= 2;
    			} // end if
    			else if (feedback.equals("L")) {
      				compGuess += changeBy;
      				changeBy /= 2;
    			} // end else if
    			else if (feedback.equals("C")) {
      				System.out.println ("Yippee!");
      				keepGoing = false;
    			} //end else if
    			else {
      				System.out.println("Sorry. I didn't understand");
    			} // end else
		} // end while
	} //end computer guesser
	
/*
	public int StringtoInt(String guess){
  		String tempGuess = guess;
  		try {
    			int intGuess = Integer.parseInt(tempGuess);
			return intGuess;
  		} // end try
  		catch (NumberFormatException e) {
    			System.out.println("That is not a number!");
			return 
		} // end catch
  	} // end StringtoInt
*/

} // end NumberGuesser class


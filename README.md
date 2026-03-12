# Algorithm for guesser game
## NAME THE FILE --> NumberGuesser.java
```
import java.util.Random;
import java.util.Scanner or import java.util.*;


Public class NumberGuesser():

  initialize scanners and strings in open space in class

 public static void main(String[] args) {
  //Main is static; so don't put much in there.  In most Java projects, main simply calls the constructor of the current class.  
  new NumberGuesser();
  } // end main

public NumberGuesser(){
  //constrcutor 
  boolean keepGoing = true;
  while(keepGoing){

    String response = menu();

    if (response.equals("1")){
        System.out.println(humanGuesser());

    } else if (response.equals("2")){
        System.out.println(computerGuesser());

    } else if (response.equals("0")){
        System.out.println("Goodbye!");
        keepGoing = false;

    } else {
        System.out.println("Sorry. I didn't understand");
    } // end if
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
  make an integer -> correct (rand generated)
  while keepGoing == true; {
        ask user for a number and put into -> new String guess
        if guess < correct {
            tell user: System.out.println ("Too low");
        } // end if
        elif guess > correct{
            tell user: System.out.println ("Too high");
        } //end if
        else {
            tell user: System.out.println ("You guessed correct!");
            set keepGoing to False;
        } //end else
  } // end while loop
} //end humanGuesser method

public void computerGuesser(){
  boolean keepGoing = true;
  int turns = 1;
  int compGuess = 50;
  while keepGoing == true{
    tell user: System.out.println (turns + ") I guess" compGuess);
    tell user: System.out.println ("Too (H)igh, too (L)ow, or (C)orrect? ");
    String feedback = input.nextLine();
    feedback = feedback.toUpperCase();
    if feedback.equals("H)
  
    
    


} //end computer guesser
```

## Previous coding under C (for reference):
```
main()
    make a 20 length char array -> userName
    make an integer -> guess & initialize first value
    make an integer -> correct (rand generated)
    make an integer -> turns & initialize to zero
    make an integer -> keepGoing & initialize to -1 (boolean -1 & 0)
    
    seed random number generator
    generate a random number between 1 and 100 and put into correct
    ask user name and put in userName
    greet user with their name
    
    while keepGoing is true (-1):
        increment turns
        ask user for a number and put into -> guess
        if guess < correct:
            tell user "Too low"
        elif guess > correct:
            tell user "Too high"
        else:
            tell user "You guessed correct!"
            set keepGoing to False (0)

    evaluate the performance
    if turns < 7:
        say "You did great"
    elif turns > 7:
        say "You did alright"
    else:

        say "You did good"
```

package trySomething;
import java.util.Scanner;
public class Prompter {
private Game game;

public Prompter(Game game){
	this.game = game;
}
public boolean promptForGuess(){
	Scanner scanner = new Scanner(System.in);
	boolean isHit = false;
	boolean isAcceptable = false;
	do{
		
	
	System.out.print("Enter a Letter: ");
	String guessInput = scanner.nextLine();
	try{
		isHit = game.applyGuess(guessInput);
		isAcceptable = true;

	} catch(IllegalArgumentException iae){
		System.out.printf("%s. Please try again. %n", iae.getMessage());
	}
	}while(! isAcceptable);
	return isHit;
}
public void displayProgress(){
	System.out.printf("You %d tries left. %s",game.getRemainingTries(), game.getCurrentProgress());
}
public void displayOutcome(){
	if(game.isWon()){
		System.out.printf("Congrats you won with %d tries left", game.getRemainingTries());
	}
	else{
		System.out.printf("Sorry, the answer was %s", game.getAnswer());
	}
}
}

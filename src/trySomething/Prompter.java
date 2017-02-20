package trySomething;
import java.util.Scanner;
public class Prompter {
private Game game;

public Prompter(Game game){
	this.game = game;
}
public boolean promptForGuess(){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a Letter: ");
	String guessInput = scanner.nextLine();
	char guess = guessInput.charAt(0);
	return game.applyGuess(guess);
}
public void displayProgress(){
	System.out.printf("Try to solve: %s", game.getCurrentProgress());
}
}

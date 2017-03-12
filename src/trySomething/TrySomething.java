package trySomething;
import java.util.Scanner;
public class TrySomething {

	public static void main(String[] args) {
	Scanner guessWord = new Scanner(System.in);
	System.out.println("Enter a word");
	String word = guessWord.nextLine();
		Game game = new Game(word);
		try{
			System.out.println("in try");
		Runtime.getRuntime().exec("clear");
		}
		  catch (final Exception e)
	    {
			  
	    }
//		if(args.length == 0){
//			System.out.println("Usage: java Hangman <answer>");
//			System.err.println("answer is required");
//			System.exit(1);
//		}
		Prompter prompter = new Prompter(game);
		while(game.getRemainingTries() > 0 && !game.isWon()){
		prompter.displayProgress();
		prompter.promptForGuess();
		}
		prompter.displayOutcome();
	}
}

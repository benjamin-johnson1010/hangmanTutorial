package trySomething;
public class TrySomething {

	public static void main(String[] args) {
		Game game = new Game("treehouse");
		Prompter prompter = new Prompter(game);
		prompter.displayProgress();
		boolean isHit = prompter.promptForGuess();
		if (isHit){
			System.out.print("Hit");
		}
		else{
			System.out.print("miss");
		}
	}

}

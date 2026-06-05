package gamesPortal.model;

public class ThrowSix implements DicePlay {

	private Dice dice;// the dice we use

	private int score; // player score

	//constructor
	public ThrowSix() {

		dice = new Dice(); // make new dice
		score = 5; // start from 5
	}

	//play game and return result
	public String playGame() {

		String resultText = "Throw Six Game\n\n";

		resultText = resultText + "Dice\tScore\n";
		resultText = resultText + "*****\t*****\n";

		//first line
		resultText = resultText + "1\t" + score + "\n";

		//while loop to win or lose
		while (score > 0) {

			int result = dice.roll(); // roll the dice

			score--; // lose 1 point every roll

			resultText = resultText + result + "\t" + score + "\n";

			//if roll is 6 player wins
			if (result == 6) {

				resultText = resultText + "\nYou win. Your score is " + score;

				return resultText;
			}

			resultText = resultText + "You lose\n";
		}

		return resultText;
	}

	//return score
	public int getScore() {

		return score;
	}
	
}
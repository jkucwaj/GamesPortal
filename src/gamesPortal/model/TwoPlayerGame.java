package gamesPortal.model;

public class TwoPlayerGame implements DicePlay {

	private Dice dice1; // first dice
	private Dice dice2; // second dice
	private Dice dice3; // third dice
	private Dice dice4; // fourth dice

	private int p1diceroll; // Player 1's score
	private int p2diceroll; // Player 2's score

	//constructor
	public TwoPlayerGame() {

		dice1 = new Dice(); // make first dice
		dice2 = new Dice(); // make second dice
		dice3 = new Dice(); // make third dice
		dice4 = new Dice(); // make fourth dice

		p1diceroll = 0;
		p2diceroll = 0;
	}

	//play game and return result
	public String playGame() {

		String resultText = "Two Player Dice Game\n\n";

		//player 1
		resultText = resultText + "PLAYER 1\n";
		resultText = resultText + "Dice1\tDice2\n";
		resultText = resultText + "*****\t*****\n";

		for (int i = 1; i <= 3; i++) {

			int rolln1 = dice1.roll(); // roll 1st dice
			int rolln2 = dice2.roll(); // roll 2nd dice

			resultText = resultText + rolln1 + "\t" + rolln2 + "\n";

			//check for double
			if (rolln1 == rolln2) {

				p1diceroll++; // add 1 point if same
			}
		}

		resultText = resultText + "\nPlayer 1 score = " + p1diceroll + "\n\n";

		//player 2
		resultText = resultText + "PLAYER 2\n";
		resultText = resultText + "Dice1\tDice2\n";
		resultText = resultText + "*****\t*****\n";

		for (int i = 1; i <= 3; i++) {

			int rolln3 = dice3.roll(); // roll 3rd dice
			int rolln4 = dice4.roll(); // roll 4th dice

			resultText = resultText + rolln3 + "\t" + rolln4 + "\n";

			//check for double
			if (rolln3 == rolln4) {

				p2diceroll++; // add 1 point if same
			}
		}

		resultText = resultText + "\nPlayer 2 score = " + p2diceroll + "\n\n";

		//check winner
		if (p2diceroll > p1diceroll) {

			resultText = resultText + "Player 2 wins!";
		}

		else if (p1diceroll > p2diceroll) {

			resultText = resultText + "Player 1 wins!";
		}

		else {

			resultText = resultText + "There is no winner";
		}

		return resultText;
	}
	
	//return player 1 score
	public int getPlayerOneScore() {

		return p1diceroll;
	}

	//return player 2 score
	public int getPlayerTwoScore() {

		return p2diceroll;
	}

}
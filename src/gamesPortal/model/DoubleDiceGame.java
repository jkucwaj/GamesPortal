package gamesPortal.model;

public class DoubleDiceGame implements DicePlay {

	private Dice dice1;
	private Dice dice2;
	private int score;

	//constructor
	public DoubleDiceGame() {

		dice1 = new Dice(); //first dic
		dice2 = new Dice();//second dice
		score = 0;//player score 
	}

	//play game and return result as text
	public String playGame() {

		String resultText = "Double Dice Game\n\n";
		resultText = resultText + "Dice1\t Dice2\n";
		resultText = resultText + "*****\t*****\n";

		for (int i = 1; i <= 3; i++) {

			int rolln1 = dice1.roll();
			int rolln2 = dice2.roll();

			resultText = resultText + rolln1 + "\t" + rolln2 + "\n";

			if (rolln1 == rolln2) {
				score++;
			}
		}

		resultText = resultText + "\nYour score = " + score;

		return resultText;
	}

	//return score
	public int getScore() {

		return score;
	}
	
	
}
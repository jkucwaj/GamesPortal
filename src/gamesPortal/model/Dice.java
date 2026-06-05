package gamesPortal.model;

import java.util.Random; // lets us use random numbers

public class Dice {
	
	private int currentFaceValue; //attribute that stores number showing on the dice
	
	public Dice() {//constructor runs once when we make a new Dice
		currentFaceValue = 1; //start with current face
	}
	
	//to roll the dice
	public int roll() {
		Random diceRoller = new Random(); // make random generator 
		currentFaceValue = diceRoller.nextInt(6) + 1; // get number 1–6
        return currentFaceValue ; // give the number back
	}
	
}

	
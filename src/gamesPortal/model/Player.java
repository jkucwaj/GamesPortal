package gamesPortal.model;

import java.util.ArrayList;

public class Player {

	private String username; //player username
	private String password; //player password

	private ArrayList<Integer> scores; //store player scores

	//constructor
	public Player(String username, String password) {

		this.username = username;
		this.password = password;

		scores = new ArrayList<>();
	}

	//return username
	public String getUsername() {

		return username;
	}

	//return password
	public String getPassword() {

		return password;
	}

	//add score to list
	public void addScore(int score) {

		scores.add(score);
	}

	//return all scores
	public ArrayList<Integer> getScores() {

		return scores;
	}

	//show score history
	public String getScoreHistory() {

		String result = "";

		for (Integer score : scores) {

			result = result + score + "\n";
		}

		return result;
	}
	
	//return highest score
	public int getHighestScore() {

		int highest = 0;

		for (Integer score : scores) {

			if (score > highest) {

				highest = score;
			}
		}

		return highest;
	}
	
}
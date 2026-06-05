package gamesPortal.controller;

import gamesPortal.model.DoubleDiceGame;
import gamesPortal.model.Player;
import gamesPortal.model.PlayerInfo;
import gamesPortal.model.ThrowSix;
import gamesPortal.model.TwoPlayerGame;
import gamesPortal.view.LoginView;
import gamesPortal.view.MenuView;
import gamesPortal.model.FileIO;
import gamesPortal.model.ExceptionHandling;

import javax.swing.JOptionPane;

public class Controller {

	//login screen
	private LoginView loginView;

	//current logged player
	private Player currentPlayer;

	//stores all players
	private PlayerInfo playerInfo;

	//constructor
	public Controller() {

		playerInfo = new PlayerInfo();

		//open login view
		loginView = new LoginView(this);
		
		fileIO = new FileIO();
	}

	//check login details
	public boolean login(String username, String password) {

		currentPlayer = playerInfo.login(username, password);

		//if login correct
		if (currentPlayer != null) {
			return true;
		}

		//wrong login
		return false;
	}
	
	//register new player
	public void register(String username, String password) {

		try {

			boolean success = playerInfo.register(username, password);

			//if register worked
			if (success) {

				//save players after register
				fileIO.savePlayers(playerInfo.getPlayers());

				JOptionPane.showMessageDialog(null, "Player profile created");
			}
		}

		catch (ExceptionHandling e) {

			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
	//open menu 
	public void openMenu(String username) {

		new MenuView(this, username);
	}

	//play throw six
	public void playThrowSix() {

		ThrowSix game = new ThrowSix();

		String result = game.playGame();

		//add score to current player
		currentPlayer.addScore(game.getScore());
		fileIO.savePlayers(playerInfo.getPlayers());
		
		JOptionPane.showMessageDialog(null, result);//show result in gui window
	}

	//play double dice
	public void playDoubleDice() {

		DoubleDiceGame game = new DoubleDiceGame();

		String result = game.playGame();

		//add score to current player
		currentPlayer.addScore(game.getScore());
		fileIO.savePlayers(playerInfo.getPlayers());

		JOptionPane.showMessageDialog(null, result);//show result in gui window
	}

	//play two player game
	public void playTwoPlayerGame() {

		TwoPlayerGame game = new TwoPlayerGame();

		String result = game.playGame();

		//add player 1 score
		currentPlayer.addScore(game.getPlayerOneScore());
		fileIO.savePlayers(playerInfo.getPlayers());

		JOptionPane.showMessageDialog(null, result);//show result in gui window
	}

	//show all player scores
	public void showScoreHistory() {

		String history = currentPlayer.getScoreHistory();

		//if no scores yet
		if (history.equals("")) {
			history = "No scores yet";
		}

		JOptionPane.showMessageDialog(null, history);//show popup window
	}
	
	
	private FileIO fileIO;
	
	//return highest score
	public int getHighestScore() {

		return currentPlayer.getHighestScore();
	}
}
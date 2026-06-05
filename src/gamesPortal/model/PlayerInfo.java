package gamesPortal.model;

import java.util.ArrayList;

public class PlayerInfo {

	private ArrayList<Player> players; //store all players

	//constructor
	public PlayerInfo() {

		players = new ArrayList<>();

		//pre-made players and scores 
		//pre-made player
		Player zeus = new Player("Zeus", "thunder");
		zeus.addScore(5);
		zeus.addScore(3);

		//second player
		Player hera = new Player("Hera", "pomegranate");
		hera.addScore(2);
		hera.addScore(4);

		//third player
		Player poseidon = new Player("Poseidon", "storm");
		poseidon.addScore(6);
		poseidon.addScore(1);

		//add players to list
		players.add(zeus);
		players.add(hera);
		players.add(poseidon);
	}

	//check login details
	public Player login(String username, String password) {

		//check empty fields
		if (username.equals("") || password.equals("")) {

			return null;
		}

		for (Player player : players) {

			if (player.getUsername().equalsIgnoreCase(username)
					&& player.getPassword().equals(password)) {

				return player;
			}
		}

		return null;
	}
	//register new player and throws exception
	public boolean register(String username, String password) throws ExceptionHandling {

		//check empty fields
		if (username.equals("") || password.equals("")) {

			throw new ExceptionHandling("Fields cannot be empty");
		}

		for (Player player : players) {

			if (player.getUsername().equalsIgnoreCase(username)) {

				throw new ExceptionHandling("Username already exists");
			}
		}

		players.add(new Player(username, password));

		return true;
	}

	//return all players
	public ArrayList<Player> getPlayers() {

		return players;
	}
	
	
}
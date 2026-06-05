package gamesPortal.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileIO {

	//save player data to file
	public void savePlayers(ArrayList<Player> players) {

		try {

			FileWriter writer = new FileWriter("players.txt");

			for (Player player : players) {

				writer.write(player.getUsername() + " - Highest Score: " + player.getHighestScore() + "\n");
			}

			writer.close();

			System.out.println("Players saved");
		}

		catch (IOException e) {

			System.out.println("Error saving file");
		}
	}
}
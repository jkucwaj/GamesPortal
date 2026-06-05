package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gamesPortal.model.Player;

class PlayerTest
{
	@Test
	void testAddScore()
	{
		Player player = new Player("Zeus", "thunder");

		player.addScore(5);

		assertEquals(5, player.getHighestScore());
	}
	
	@Test
	void testHighestScore()
	{
		Player player = new Player("Hera", "pomegranate");

		player.addScore(2);
		player.addScore(6);
		player.addScore(4);

		assertEquals(6, player.getHighestScore());
	}
	
	@Test
	void testScoreHistoryNotEmpty()
	{
		Player player = new Player("Poseidon", "storm");

		player.addScore(3);
		player.addScore(5);

		assertFalse(player.getScoreHistory().isEmpty());
	}
	
	
}

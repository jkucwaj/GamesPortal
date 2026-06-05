package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gamesPortal.model.DoubleDiceGame;
import gamesPortal.model.ThrowSix;
import gamesPortal.model.TwoPlayerGame;

class GamesTest {

	@Test
	void testThrowSixReturnsText()
	{
		ThrowSix game = new ThrowSix();

		String result = game.playGame();

		assertNotNull(result);
		assertFalse(result.isEmpty());
	}
	
	@Test
	void testDoubleDiceGameReturnsText()
	{
		DoubleDiceGame game = new DoubleDiceGame();

		String result = game.playGame();

		assertNotNull(result);
		assertFalse(result.isEmpty());
	}
	
	@Test
	void testTwoPlayerGameReturnsText()
	{
		TwoPlayerGame game = new TwoPlayerGame();

		String result = game.playGame();

		assertNotNull(result);
		assertFalse(result.isEmpty());
	}

}

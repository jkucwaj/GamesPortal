package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import gamesPortal.model.ExceptionHandling;

import gamesPortal.model.Player;
import gamesPortal.model.PlayerInfo;

class PlayerInfoTest
{
	@Test
	void testValidLogin()
	{
		PlayerInfo playerInfo = new PlayerInfo();

		Player player = playerInfo.login("Zeus", "thunder");

		assertNotNull(player);
	}

	@Test
	void testInvalidLogin()
	{
		PlayerInfo playerInfo = new PlayerInfo();

		Player player = playerInfo.login("Zeus", "wrongpassword");

		assertNull(player);
	}
	
	@Test
	void testDuplicateUsername()
	{
		PlayerInfo playerInfo = new PlayerInfo();

		assertThrows(ExceptionHandling.class, () ->
		{
			playerInfo.register("Zeus", "1234");
		});
	}
}
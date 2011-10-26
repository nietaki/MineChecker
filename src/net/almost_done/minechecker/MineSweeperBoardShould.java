package net.almost_done.minechecker;

import org.junit.Test;
import static org.junit.Assert.*;
import static net.almost_done.minechecker.Coords.*;

public class MineSweeperBoardShould {

	@Test
	public void acceptAValidMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		assertTrue(mb.placeMine(1, 2));
		//    getCoords(a, b)
	}
	
	
}

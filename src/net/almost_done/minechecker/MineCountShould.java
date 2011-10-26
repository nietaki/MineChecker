package net.almost_done.minechecker;

import org.junit.Test;
import static org.junit.Assert.*;
import static net.almost_done.minechecker.Coords.*;

public class MineCountShould {

	@Test
	public void beZeroForEmptyBoard() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		assertTrue(mb.mineCount(1, 2) == 0);
	}

}

package net.almost_done.minechecker;

import org.junit.Test;
import static org.junit.Assert.*;
import static net.almost_done.minechecker.Coords.*;

public class MineCountShould {

	@Test
	public void beZeroForEmptyBoard() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		assertCont(mb, 1, 2, 0);
	}
	@Test
	public void beOneForNeighbouringMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(2, 2);
		assertCont(mb, 1, 2, 0);
	}
	private void assertCont(MineSweeperBoard mb, int x, int y, int count) throws Exception {
		assertTrue(mb.mineCount(x, y) == count);
	}
	
	

}

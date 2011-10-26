package net.almost_done.minechecker;

import org.junit.Test;
import static org.junit.Assert.*;
import static net.almost_done.minechecker.Coords.*;

public class MineCountShould {

	@Test
	public void beZeroForEmptyBoard() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		assertCount(mb, 1, 2, 0);
	}
	@Test
	public void beOneForNeighbouringMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(2, 2);
		assertCount(mb, 1, 2, 1);
	}

	@Test
	public void beZeroUnderMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(2, 2);
		assertCount(mb, 2, 2, 0);
	}

	@Test
	public void beZeroOutsideBoard() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(7, 2);
		assertCount(mb, 8, 2, 0);
	}
	
	@Test
	public void stack() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(2, 2);
		mb.placeMine(4, 4);
		assertCount(mb, 3, 3, 2);
	}

	@Test
	public void reactToMineRemoval() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(2, 2);
		mb.removeMine(2, 2);
		assertCount(mb, 3, 2, 0);
	}

	@Test
	public void notUpdateOnFailedMinePlacements() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(2, 2);
		mb.placeMine(2, 2);
		assertCount(mb, 2, 3, 1);
	}

	@Test
	public void notUpdateOnFailedMineRemovals() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(2, 2);
		mb.removeMine(3, 3);
		assertCount(mb, 2, 3, 1);
	}
	
	/* helpers and so on*/
	private void assertCount(MineSweeperBoard mb, int x, int y, int count) throws Exception {
		assertTrue(mb.mineCount(x, y) == count);
	}
	
	

}

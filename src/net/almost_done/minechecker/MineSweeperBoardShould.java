package net.almost_done.minechecker;

import org.junit.Test;
import static org.junit.Assert.*;
import static net.almost_done.minechecker.Coords.*;

public class MineSweeperBoardShould {

	@Test
	public void acceptAValidMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		assertTrue(mb.placeMine(1, 2));
	}

	@Test
	public void notAcceptARepeatedMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(8, 8);
		mb.placeMine(1, 2);
		assertFalse(mb.placeMine(1, 2));
	}

	@Test
	public void notAcceptAMineOutOfBoundsX1() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		assertFalse(mb.placeMine(-1, 2));
	}	

	@Test
	public void notAcceptAMineOutOfBoundsX2() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		assertFalse(mb.placeMine(5, 2)); //border case
	}
	@Test
	public void notAcceptAMineOutOfBoundsY1() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		assertFalse(mb.placeMine(0, -5));
	}	
	
	@Test
	public void notAcceptAMineOutOfBoundsy2() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		assertFalse(mb.placeMine(4, 9)); //border case
	}
	
}

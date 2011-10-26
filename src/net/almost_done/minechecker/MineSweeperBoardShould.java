package net.almost_done.minechecker;

import org.junit.Test;
import static org.junit.Assert.*;
import static net.almost_done.minechecker.Coords.*;

public class MineSweeperBoardShould {

	
	/* ADDING MINES */
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
		assertFalse(mb.placeMine(4, 9)); 
	}
	
	/* REMOVING MINES */
	@Test
	public void removeExistingMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		mb.placeMine(1, 2);
		assertTrue(mb.removeMine(1, 2));
	}
	
	@Test
	public void notRemoveNonExistingMine() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		mb.placeMine(1, 2);
		assertFalse(mb.removeMine(2, 3));
	}

	@Test
	public void notRemoveMineTwice() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		mb.placeMine(1, 2);
		mb.removeMine(1, 2);
		assertFalse(mb.removeMine(1, 2));
	}
	
	@Test
	public void notRemoveMineOutOfBounds() throws Exception {
		MineSweeperBoard mb = new MineSweeperBoard(5, 8);
		mb.placeMine(1, 2);
		assertFalse(mb.removeMine(-2, 33));
	}
	
}

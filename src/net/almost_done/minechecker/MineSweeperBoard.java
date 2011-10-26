package net.almost_done.minechecker;

import java.util.HashSet;
import static net.almost_done.minechecker.Coords.*;

public class MineSweeperBoard {
	private int sizeX, sizeY;
	private HashSet<Coords> fields;

	public MineSweeperBoard(int x, int y){
		fields = new HashSet<Coords>();
		setSizeX(x);
		setSizeY(y);
	}

	boolean placeMine(int x, int y){
		Coords c = getCoords(x, y);
		return fields.add(c);
	}

	/* setters, getters, helpers */
	public int getSizeX() {
		return sizeX;
	}
	private void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	private void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}


}

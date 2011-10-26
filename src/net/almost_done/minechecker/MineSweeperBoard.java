package net.almost_done.minechecker;

import java.util.HashSet;
import static net.almost_done.minechecker.Coords.*;

public class MineSweeperBoard {
	private int sizeX, sizeY;
	private HashSet<Coords> fields;
	private int[][] mine_counts;

	public MineSweeperBoard(int x, int y){
		fields = new HashSet<Coords>();
		mine_counts = new int[x][y];
		setSizeX(x);
		setSizeY(y);
	}

	boolean placeMine(int x, int y){
		if(inBounds(x, y))
			return false;
		Coords c = getCoords(x, y);
		return fields.add(c);
	}

	boolean removeMine(int x, int y){
		if(inBounds(x, y))
			return false;
		Coords c = getCoords(x, y);
		return fields.remove(c);
	}

	private boolean inBounds(int x, int y) {
		return x<0 || x>=getSizeX() ||
			 y<0 || y>=getSizeY();
	}
	
	int mineCount(int x, int y){
		return 0;
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

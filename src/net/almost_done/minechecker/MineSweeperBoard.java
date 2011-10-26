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
		if(x<0 || x>=getSizeX() ||
			 y<0 || y>=getSizeY())
			return false;
		Coords c = getCoords(x, y);
		return fields.add(c);
	}

	boolean removeMine(int x, int y){
		if(x<0 || x>=getSizeX() ||
			 y<0 || y>=getSizeY())
			return false;
		Coords c = getCoords(x, y);
		return fields.remove(c);
	}
	
	int getSurroundingMineCount(){
		return -1;
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

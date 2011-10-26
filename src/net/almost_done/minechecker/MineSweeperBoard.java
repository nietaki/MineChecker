package net.almost_done.minechecker;

import java.util.HashSet;

public class MineSweeperBoard {
	private int sizeX, sizeY;
	private HashSet<Coords> fields;
	
	public MineSweeperBoard(int x, int y){
		setSizeX(x);
		setSizeY(y);
	}
	
	boolean placeMine(int x, int y){
		return true;
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
	
	
	private Coords getCoords(int a, int b){
		return new Coords(a, b);
	}
	

}

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
		if(outOfBounds(x, y))
			return false;
		Coords c = getCoords(x, y);
		boolean ret = fields.add(c);
		updateMineCount(x, y, 1);
		return ret;
	}

	private void updateMineCount(int x, int y, int count_change) {
		//updating mine counts
		for(int i=-1; i<=1; i++){
			for(int j=-1; j<=1; j++){
				int posx = x+i;
				int posy = y+j;
				if((i!=0 || j!=0) && inBounds(posx, posy)){
					mine_counts[posx][posy] += count_change;
				}
			}
		}
	}

	boolean removeMine(int x, int y){
		if(outOfBounds(x, y))
			return false;
		updateMineCount(x, y, -1);
		Coords c = getCoords(x, y);
		return fields.remove(c);
	}
	private boolean inBounds(int x, int y){
		return ! outOfBounds(x, y);
	}
	private boolean outOfBounds(int x, int y) {
		return x<0 || x>=getSizeX() ||
			 y<0 || y>=getSizeY();
	}
	
	int mineCount(int x, int y){
		if(inBounds(x, y))
			return mine_counts[x][y];
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

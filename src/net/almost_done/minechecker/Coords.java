package net.almost_done.minechecker;

public final class Coords extends Pair<Integer, Integer> {
	public Coords(Integer a, Integer b){
		super(a, b);
	}

	public static Coords getCoords(int a, int b){
		return new Coords(a, b);
	}

}

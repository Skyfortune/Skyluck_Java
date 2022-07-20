package ex05_8;

public class PositivePoint extends Point{

	public PositivePoint() {
		super(0,0);
		// TODO Auto-generated constructor stub
	}

	public PositivePoint(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String tmp ="(" + getX() + "," + getY() +")의 점";
		return tmp;
}
}

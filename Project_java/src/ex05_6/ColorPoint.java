package ex05_6;


public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y) {
		
		super(x, y);
		this.color = color;
	}

	public ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {

		String tmp = color + "색의" + " (" + getX() + "," + getY() + ")의 점";
		return tmp;
	}

}


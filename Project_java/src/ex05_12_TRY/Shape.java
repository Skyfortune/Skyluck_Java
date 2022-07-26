package ex05_12_TRY;

public abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

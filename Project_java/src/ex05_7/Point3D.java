package ex05_7;

public class Point3D extends Point{

	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		 this.z = z;
	}

	public void moveUp() {
		// TODO Auto-generated method stub
		z++;
	}

	public void moveDown() {
		// TODO Auto-generated method stub
		z--;
	}

	public void move(int x, int y, int z) {
		// TODO Auto-generated method stub
		move(x,y);
		this.z=z;
	}
	public String toString() {
		String tmp ="(" + getX() + "," + getY() +","+ getZ() +")의 점";
		return tmp;
	}

	private int getZ() {
		// TODO Auto-generated method stub
		return z;
	}

}
//완성 시키자
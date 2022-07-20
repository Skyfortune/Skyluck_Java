package ex05_13_14;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("반지름이" + radius + "인 원입니다!");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}

}

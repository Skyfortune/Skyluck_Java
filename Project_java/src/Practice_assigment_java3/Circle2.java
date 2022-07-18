package Practice_assigment_java3;

public class Circle2 {
	private double x,y;
	private int radius;
	//이하 선언 끝
	public Circle2(double x, double y, int radius) {
		//내용작성1
		this.x = x;
		this.y= y;
		this.radius = radius;
	//배치완료	
		
	}
	public void show() {
		System.out.print("("+x);
		System.out.print(",");
		System.out.print(y+")");
		System.out.println(radius);
}
	
	public int getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}
}
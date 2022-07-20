package ex05_5;

public class main {

	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}

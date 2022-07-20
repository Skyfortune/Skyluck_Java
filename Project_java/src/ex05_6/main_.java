package ex05_6;

public class main_ {

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // BLACK 색에 (0,0)위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		//colorpoint()을 더 만들면 되는 문제였다.

		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}

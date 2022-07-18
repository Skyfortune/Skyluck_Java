package Project_java;

public class Circlearea {
	public static void main (String[] args) {
		final double Pl = 3.14;//원주율
		double radius = 10;//반지름
		double circleaArea = 0; //원의 면적
		
		circleaArea =radius *radius *Pl; //원의 면적 계산
		System.out.println("이것은 처음 만들어본 예제");
		System.out.print("원의 면적=");
		System.out.println(circleaArea);
	}
}

package Practice_assigment_java;
import java.util.Scanner;
public class Ex_10_circle_crush {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int s1x=sc.nextInt(); 
		int s1y=sc.nextInt(); 
		int s1r=sc.nextInt();  
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int s2x=sc.nextInt(); 
		int s2y=sc.nextInt(); 
		int s2r=sc.nextInt(); 
		//s1의 중심점과 s2의 중심점의 거리를 계산한뒤, 두개의 원의 반지름의 합보다 같거나 작으면 겹칠것
		double distance=(((s1x-s2x)*(s1x-s2x))+((s1y-s2y)*(s1y-s2y)));
		distance =Math.sqrt(distance);  //s1 중심점과 s2중심점의 거리
		if(distance<=s1r+s2r)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
	}
}

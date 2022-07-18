package Practice_assigment_java;
import java.util.Scanner;
public class Ex_9_circle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		int centerx=sc.nextInt(); //원의 중심 x 값
		int centery=sc.nextInt(); //원의 중심 y 값
		int half=sc.nextInt();    //원의 반지름, 
		System.out.print("점 입력>>");
		int dotx=sc.nextInt();    //검색할 x 값
		int doty=sc.nextInt();    //검색할 y 값
		
		//이렇게 되면 원안에 있을 점의 위치는 다음과 같다. 
		//원의 중심 값에서 '+ -' 원의 반지름
		//피타고라스의 정리를 이용한다.
		// 가장큰 변 제곱 = 각 다른변의 길이의 제곱의 합
		
		double distance=(((centerx-dotx)*(centerx-dotx))+((centery-doty)*(centery-doty)));
		distance =Math.sqrt(distance);
		if(distance<=half)
			System.out.println("점 ("+dotx+"," + doty +")는 원 안에 있다.");
		else 
			System.out.println("점 ("+dotx+"," + doty +")는 원 안에 없다.");
	}
}
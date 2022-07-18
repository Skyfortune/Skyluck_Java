package Practice_assigment_java;
import java.util.Scanner;				//입력할 수 있게 만든다.
public class Ex_2_figure_out_number {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	System.out.print("2자리수 정수 입력(10~99)>>");
	int AB = a.nextInt(); // 입력한 a를 AB이라는 이름의 정수타입으로 리턴한다.
	
	if ((AB >= 100) || (AB <= 10)) { //100이 넘거나 10보다 작다면, 경고문 출력
		System.out.println("10~99의 숫자만 입력해 주세요.");
	//처음에는 &&를 썼다. 이는 하나라도 false 라면 false로 출력하게 만드는데,
	//생각을 해보니 이 해당 문구에 맞아야 해당 출력물이 나오니까, 하나라도 T라면 ture가 나오는 구문으로 실행
	}
	else if (AB % 11 == 0) {//십의 자리와 일의 자리가 같다면 11의 배수가 된다.
					   //그러므로 11로 나눈 나머지가 0일때를 비교하여 출력한다.
		System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
	

	}
	else {
		System.out.println("No! 10의 자리와 1의 자리가 같지않습니다." );
	}
}
}

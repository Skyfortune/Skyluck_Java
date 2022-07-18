package Practice_assigment_java;
import java.util.Scanner;
public class Ex_1_money {
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in); //입력한 값은 sc가 된다.
		
			System.out.print("원화를 입력하세요(단위 원)"); //첫 문단을 출력한다.
			
		int won = sc.nextInt(); // 입력한 Sc를 won이라는 이름의 정수타입으로 리턴한다.
		double doller = (double)won/1216; //달러로 바꾸는 연산을 실행한다.
		
			System.out.println(won + "원은 $"+ String.format("%.2f", doller)+ "입니다.");
			//String.format(format,args) 는 인자로 전달된 format에 맞게 문자열을 리턴한다.
			//%.6f 를 한다면 소수점 7번째 자리를 반올림하여 6번째까지 표현한다는 의미.
			//그러므로 %.2f 로 하게되면 소수점 2번째 자리까지만 표현이 된다.
		
		
	}
}

package Practice_assigment_java;
import java.util.Scanner;
public class Ex_6_369game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1-99 사이의 정수를 입력하시오>>");
		int a= sc.nextInt();
		
		if(a%3 ==0) { //3의 배수 구하기
			System.out.println("박수짝짝");
		}
		else
			System.out.println(a);
		
	}
}
